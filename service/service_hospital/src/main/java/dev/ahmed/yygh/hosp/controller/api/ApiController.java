package dev.ahmed.yygh.hosp.controller.api;


import dev.ahmed.yygh.common.exception.YyghException;
import dev.ahmed.yygh.common.helper.HttpRequestHelper;
import dev.ahmed.yygh.common.result.Result;
import dev.ahmed.yygh.common.result.ResultCodeEnum;
import dev.ahmed.yygh.common.utils.MD5;
import dev.ahmed.yygh.hosp.service.HospitalService;
import dev.ahmed.yygh.hosp.service.HospitalSetService;
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

    @Autowired
    private HospitalSetService hospitalSetService;

    // upload hostpital api
    @PostMapping("/saveHospital")
    public Result saveHosp(HttpServletRequest request) {
        // get hospital data
        Map<String, String[]> requestMap = request.getParameterMap();
        Map<String, Object> paramMap = HttpRequestHelper.switchMap(requestMap);

        // 1. get hospital data then encrypt MD5 sign
        String hospSign = (String) paramMap.get("sign");

        // 2. search hospital by hoscode then get sign
        String hoscode = (String) paramMap.get("hoscode");
        String signKey = hospitalSetService.getSignKey(hoscode);

        // 3. sign to MD5 encrypt
        String signKeyMd5 = MD5.encrypt(signKey);

        // 4. compare sign
        if (!hospSign.equals(signKeyMd5)) {
            throw new YyghException(ResultCodeEnum.SIGN_ERROR);
        }

        // "+" convert to " ", now convert back to "+"
        String logoData = (String) paramMap.get("logoData");
        logoData = logoData.replaceAll(" ", "+");
        paramMap.put("logoData", logoData);


        // use service
        hospitalService.save(paramMap);
        return Result.ok();


    }


}
