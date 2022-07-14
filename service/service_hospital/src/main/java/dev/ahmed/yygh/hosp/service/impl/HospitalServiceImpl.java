package dev.ahmed.yygh.hosp.service.impl;

import dev.ahmed.yygh.hosp.repository.HospitalRepository;
import dev.ahmed.yygh.hosp.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HospitalServiceImpl implements HospitalService {


    @Autowired
    private HospitalRepository hospitalRepository;

}
