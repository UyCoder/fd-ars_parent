package dev.ahmed.yygh.hosp.controller.api;


import dev.ahmed.yygh.common.helper.HttpRequestHelper;
import dev.ahmed.yygh.common.result.Result;
import dev.ahmed.yygh.hosp.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController
@RequestMapping("/api/hosp")
public class ApiController {

    @Autowired
    private HospitalService hospitalService;

    // upload hostpital api
    @PostMapping("/saveHospital")
    public Result saveHosp(HttpServletRequest request) {
        // get hospital data
        Map<String, String[]> requestMap = request.getParameterMap();
        Map<String, Object> paramMap = HttpRequestHelper.switchMap(requestMap);
        // use service
        hospitalService.save(paramMap);
        return Result.ok();


    }


}
