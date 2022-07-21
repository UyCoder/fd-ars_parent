package dev.ahmed.yygh.hosp.service;

import dev.ahmed.yygh.model.hosp.Hospital;

import java.util.Map;

public interface HospitalService {
    void save(Map<String, Object> paramMap);

//    search hospital by hoscode
    Hospital getByHoscode(String hoscode);
}
