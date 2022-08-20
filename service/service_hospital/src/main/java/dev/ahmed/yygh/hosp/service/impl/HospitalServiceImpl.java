package dev.ahmed.yygh.hosp.service.impl;

import com.alibaba.fastjson.JSONObject;
import dev.ahmed.yygh.hosp.repository.HospitalRepository;
import dev.ahmed.yygh.hosp.service.HospitalService;
import dev.ahmed.yygh.model.hosp.Hospital;
import dev.ahmed.yygh.vo.hosp.HospitalQueryVo;
import dev.ahmed.yygh.vo.hosp.HospitalSetQueryVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Map;

@Service
public class HospitalServiceImpl implements HospitalService {


    @Autowired
    private HospitalRepository hospitalRepository;

    @Override
    public void save(Map<String, Object> paramMap) {
        // chage map to hospital object
        String mapString = JSONObject.toJSONString(paramMap);
        Hospital hospital = JSONObject.parseObject(mapString, Hospital.class);

        // is data exists
        String hoscode = hospital.getHoscode();
        Hospital hospitalExist = hospitalRepository.getHospitalByHoscode(hoscode);

        if (hospitalExist != null) {  // if exist
            // update
            hospital.setStatus(hospitalExist.getStatus());
            hospital.setCreateTime(hospitalExist.getCreateTime());
            hospital.setUpdateTime(new Date());
            hospital.setIsDeleted(0);
            hospitalRepository.save(hospital);
        } else { // if not exists
            // insert
            hospital.setStatus(0);
            hospital.setCreateTime(new Date());
            hospital.setUpdateTime(new Date());
            hospital.setIsDeleted(0);
            hospitalRepository.save(hospital);
        }



    }

//    search hospital by hoscode
    @Override
    public Hospital getByHoscode(String hoscode) {
        Hospital hospitalByHoscode = hospitalRepository.getHospitalByHoscode(hoscode);
        return hospitalByHoscode;
    }

    @Override
    public Page<Hospital> selectHospPage(Integer page, Integer limit, HospitalQueryVo hospitalQueryVo) {
        // create pageabel onbject
        Pageable pageable = PageRequest.of(page - 1, limit);
        // matcher
        ExampleMatcher matcher = ExampleMatcher.matching()
                .withStringMatcher(ExampleMatcher.StringMatcher.CONTAINING)
                .withIgnoreCase(true);
        // hospitalSetQueryVo to hospital object
        Hospital hospital = new Hospital();
        BeanUtils.copyProperties(hospitalQueryVo, hospital);
        // example object
        Example<Hospital> example = Example.of(hospital, matcher);
        // pageable object
        Page<Hospital> all = hospitalRepository.findAll(example, pageable);
        return all;
    }
}
