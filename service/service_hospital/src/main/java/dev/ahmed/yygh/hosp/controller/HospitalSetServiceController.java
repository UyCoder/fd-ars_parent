package dev.ahmed.yygh.hosp.controller;

import dev.ahmed.yygh.hosp.service.HospitalSetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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



}
