package dev.ahmed.yygh.hosp.service.impl;

import com.alibaba.fastjson.JSONObject;
import dev.ahmed.yygh.hosp.repository.DepartmentRepository;
import dev.ahmed.yygh.hosp.service.DepartmentService;
import dev.ahmed.yygh.model.hosp.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Map;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public void save(Map<String, Object> paramMap) {
        // paramMap convert to department object
        String paramMapString = JSONObject.toJSONString(paramMap);
        Department department = JSONObject.parseObject(paramMapString, Department.class);

        // search with hoscode and depcode
        Department departmentExist = departmentRepository.
                getDepartmentByHoscodeAndDepcode(department.getHoscode(), department.getDepcode());

        // if exist save departmentExist if not exist update time and Isdeleted
        if (departmentExist != null) {
            departmentExist.setUpdateTime(new Date());
            departmentExist.setIsDeleted(0);
            departmentRepository.save(departmentExist);
        } else {
            department.setCreateTime(new Date());
            department.setUpdateTime(new Date());
            department.setIsDeleted(0);
            departmentRepository.save(department);
        }

    }
}
