package dev.ahmed.yygh.hosp.controller;

import dev.ahmed.yygh.common.result.Result;
import dev.ahmed.yygh.hosp.service.HospitalService;
import dev.ahmed.yygh.model.hosp.Hospital;
import dev.ahmed.yygh.vo.hosp.HospitalQueryVo;
import dev.ahmed.yygh.vo.hosp.HospitalSetQueryVo;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("admin/hosp/hospital")
@CrossOrigin
public class HospitalController {

    @Autowired
    private HospitalService hospitalService;

    // list hospital
    @RequestMapping("list/{page}/{limit}")
    public Result listHospital(@PathVariable Integer page,
                               @PathVariable Integer limit,
                               HospitalQueryVo hospitalQueryVo) {
        Page<Hospital> pageModel = hospitalService.selectHospPage(page, limit, hospitalQueryVo);
        return Result.ok(pageModel);

    }

    @ApiOperation(value = "Update Hospital Status")
    @GetMapping("updateHospStatus/{id}/{status}")
    public Result updateHospStatus(@PathVariable String id,
                                   @PathVariable Integer status) {
        hospitalService.updateStatus(id, status);
        return Result.ok();
    }

    // hospital details
    @ApiOperation(value = "Hospital Details")
    @GetMapping("showHospDetail/{id}")
    public Result showHospDetail(@PathVariable String id) {
        Map<String, Object> map = hospitalService.getHospById(id);
        return Result.ok(map);
    }
}
