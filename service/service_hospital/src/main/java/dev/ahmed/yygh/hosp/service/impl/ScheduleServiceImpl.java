package dev.ahmed.yygh.hosp.service.impl;

import com.alibaba.fastjson.JSONObject;
import dev.ahmed.yygh.hosp.repository.ScheduleRepository;
import dev.ahmed.yygh.hosp.service.ScheduleService;
import dev.ahmed.yygh.model.hosp.Department;
import dev.ahmed.yygh.model.hosp.Schedule;
import dev.ahmed.yygh.vo.hosp.ScheduleQueryVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Map;

@Service
public class ScheduleServiceImpl implements ScheduleService {

    @Autowired
    private ScheduleRepository scheduleRepository;


    @Override
    public void save(Map<String, Object> paramMap) {

        // paramMap convert to schedule object
        String paramMapString = JSONObject.toJSONString(paramMap);
        Schedule schedule = JSONObject.parseObject(paramMapString, Schedule.class);

        // search with hoscode and hosScheduleId
        Schedule scheduleExist = scheduleRepository.
                getScheduleByHoscodeAndHosScheduleId(schedule.getHoscode(), schedule.getHosScheduleId());

        // if exist save scheduleExist if not exist update time and Isdeleted
        if (scheduleExist != null) {
            scheduleExist.setUpdateTime(new Date());
            scheduleExist.setIsDeleted(0);
            scheduleExist.setStatus(1);
            scheduleRepository.save(scheduleExist);
        } else {
            schedule.setCreateTime(new Date());
            schedule.setUpdateTime(new Date());
            schedule.setIsDeleted(0);
            schedule.setStatus(1);
            scheduleRepository.save(schedule);
        }

    }

    @Override
    public Page<Schedule> findPageSchedule(int page, int limit, ScheduleQueryVo scheduleQueryVo) {
        // create pagable object
        Pageable pageable = PageRequest.of(page - 1, limit);
        // create example object
        Schedule schedule = new Schedule();
        BeanUtils.copyProperties(scheduleQueryVo, schedule);
        schedule.setIsDeleted(0);
        schedule.setStatus(1);

        ExampleMatcher matcher = ExampleMatcher.matching()
                .withStringMatcher(ExampleMatcher.StringMatcher.CONTAINING)
                .withIgnoreCase(true);

        Example<Schedule> example = Example.of(schedule, matcher);
        Page<Schedule> all = scheduleRepository.findAll(example, pageable);
        return all;
    }

    @Override
    public void remove(String hoscode, String hosScheduleId) {
        // check with hoscode and hosScheduleId
        Schedule schedule = scheduleRepository.
                getScheduleByHoscodeAndHosScheduleId(hoscode, hosScheduleId);
        // if exist update time and Isdeleted
        if (schedule != null) {
            scheduleRepository.deleteById(schedule.getId());
        }

    }
}
