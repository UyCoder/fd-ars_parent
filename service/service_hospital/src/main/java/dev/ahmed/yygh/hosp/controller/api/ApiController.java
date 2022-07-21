package dev.ahmed.yygh.hosp.controller.api;

import com.baomidou.mybatisplus.core.toolkit.StringUtils;

import dev.ahmed.yygh.common.exception.YyghException;
import dev.ahmed.yygh.common.helper.HttpRequestHelper;
import dev.ahmed.yygh.common.result.Result;
import dev.ahmed.yygh.common.result.ResultCodeEnum;
import dev.ahmed.yygh.common.utils.MD5;
import dev.ahmed.yygh.hosp.service.DepartmentService;
import dev.ahmed.yygh.hosp.service.HospitalService;
import dev.ahmed.yygh.hosp.service.HospitalSetService;
import dev.ahmed.yygh.model.hosp.Department;
import dev.ahmed.yygh.model.hosp.Hospital;
import dev.ahmed.yygh.vo.hosp.DepartmentQueryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
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

    @Autowired
    private DepartmentService departmentService;

    // remove department
    @PostMapping("/department/remove")
    public Result removeDepartment(HttpServletRequest request) {
        // get hospital data
        Map<String, String[]> requestMap = request.getParameterMap();
        Map<String, Object> paramMap = HttpRequestHelper.switchMap(requestMap);
        // hoscode and depcode
        String hoscode = (String) paramMap.get("hoscode");
        String depcode = (String) paramMap.get("depcode");

        // TODO check hoscode and depcode
        departmentService.remove(hoscode, depcode);
        return Result.ok();
    }

    //list departments of hospital
    @PostMapping("/department/list")
    private Result findDepartment(HttpServletRequest request) {
        // get hospital data
        Map<String, String[]> requestMap = request.getParameterMap();
        Map<String, Object> paramMap = HttpRequestHelper.switchMap(requestMap);
        //hoscode
        String hoscode = (String) paramMap.get("hoscode");
        // page and limit
        int page = StringUtils.isEmpty((CharSequence) paramMap.get("page"))?1:Integer.parseInt((String) paramMap.get("page"));
        int limit = StringUtils.isEmpty((CharSequence) paramMap.get("limit"))?1:Integer.parseInt((String) paramMap.get("limit"));

        // TODO check hoscode

        DepartmentQueryVo departmentQueryVo = new DepartmentQueryVo();
        departmentQueryVo.setHoscode(hoscode);

        // use method from service
        Page<Department> pageModel = departmentService.findPageDepartment(page, limit, departmentQueryVo);
        return Result.ok(pageModel);
    }


    // upload hospital api
    @PostMapping("/saveDepartment")
    public Result saveDepartment(HttpServletRequest request){
        // get hospital data
        Map<String, String[]> requestMap = request.getParameterMap();
        Map<String, Object> paramMap = HttpRequestHelper.switchMap(requestMap);
        // get hospcode
        String hoscode = (String) paramMap.get("hoscode");
        // 1. get hospital data then encrypt MD5 sign
        String hospSign = (String) paramMap.get("sign");
        // 2. search hospital by hoscode then get sign
        String signKey = hospitalSetService.getSignKey(hoscode);
        // 3. sign to MD5 encrypt
        String signKeyMd5 = MD5.encrypt(signKey);
        // 4. compare sign
        if (!hospSign.equals(signKeyMd5)) {
            throw new YyghException(ResultCodeEnum.SIGN_ERROR);
        }

        // use method from service to save data
        departmentService.save(paramMap);
        return Result.ok();
    }


    // search hospitals
    @PostMapping("/hospital/show")
    public Result getHosital(HttpServletRequest request) {
        // get hospital data
        Map<String, String[]> requestMap = request.getParameterMap();
        Map<String, Object> paramMap = HttpRequestHelper.switchMap(requestMap);
        // get hospcode
        String hoscode = (String) paramMap.get("hoscode");
        // 1. get hospital data then encrypt MD5 sign
        String hospSign = (String) paramMap.get("sign");
        // 2. search hospital by hoscode then get sign
        String signKey = hospitalSetService.getSignKey(hoscode);
        // 3. sign to MD5 encrypt
        String signKeyMd5 = MD5.encrypt(signKey);
        // 4. compare sign
        if (!hospSign.equals(signKeyMd5)) {
            throw new YyghException(ResultCodeEnum.SIGN_ERROR);
        }
        // search hospital by hoscode
        Hospital hospital = hospitalService.getByHoscode(hoscode);
        return Result.ok(hospital);
    }


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
