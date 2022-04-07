package dev.ahmed.yygh.hosp.controller;

import dev.ahmed.yygh.hosp.service.HospitalSetService;
import dev.ahmed.yygh.model.hosp.HospitalSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Created: 4/8/2022 00:36
 * @Email: AhmedBughra@gmail.com
 * @CreatedWith: IntelliJ IDEA
 */
@RestController
@RequestMapping("/admin/hosp/hospitalSet")
public class HospitalSetServiceController {
    @Autowired
    private HospitalSetService hospitalSetService;

    // http://localhost:8201/admin/hosp/hospitalSet/findAll

    // 1. find all hospitalSet
    @GetMapping("findAll")
    public List<HospitalSet> findAllHospitalSet() {
        List<HospitalSet> list = hospitalSetService.list();
        return list;
    }

    // 2. find hospitalSet by id
    // 3. add hospitalSet
    // 4. update hospitalSet
    // 5. delete hospitalSet
    @DeleteMapping("{id}")
    public boolean deleteHospitalSet(@PathVariable Long id) {
        boolean flag = hospitalSetService.removeById(id);
        return flag;
    }

}
