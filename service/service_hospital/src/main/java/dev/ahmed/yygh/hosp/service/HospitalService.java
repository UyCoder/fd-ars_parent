package dev.ahmed.yygh.hosp.service;

import dev.ahmed.yygh.model.hosp.Hospital;
import dev.ahmed.yygh.vo.hosp.HospitalQueryVo;
import dev.ahmed.yygh.vo.hosp.HospitalSetQueryVo;
import org.springframework.data.domain.Page;

import java.util.Map;

public interface HospitalService {
    void save(Map<String, Object> paramMap);

//    search hospital by hoscode
    Hospital getByHoscode(String hoscode);

    // hospital paging search
    Page<Hospital> selectHospPage(Integer page, Integer limit, HospitalQueryVo hospitalQueryVo);

    void updateStatus(String id, Integer status);

    Map<String, Object> getHospById(String id);
}
