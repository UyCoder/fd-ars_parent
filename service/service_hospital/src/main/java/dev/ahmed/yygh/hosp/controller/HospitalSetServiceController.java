package dev.ahmed.yygh.hosp.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import dev.ahmed.yygh.common.result.Result;
import dev.ahmed.yygh.hosp.service.HospitalSetService;
import dev.ahmed.yygh.model.hosp.HospitalSet;
import dev.ahmed.yygh.vo.hosp.HospitalSetQueryVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.poi.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Created: 4/8/2022 00:36
 * @Email: AhmedBughra@gmail.com
 * @CreatedWith: IntelliJ IDEA
 */
@Api(tags = "HospitalSetController")
@RestController
@RequestMapping("/admin/hosp/hospitalSet")
public class HospitalSetServiceController {
    @Autowired
    private HospitalSetService hospitalSetService;

    // http://localhost:8201/admin/hosp/hospitalSet/findAll

    // 1. find all hospitalSet
    @ApiOperation(value = "find all hospitalSet")
    @GetMapping("findAll")
    public Result findAllHospitalSet() {
        List<HospitalSet> list = hospitalSetService.list();
        return Result.ok(list);
    }
    // 2. delet hospitalSet
    @ApiOperation(value = "Logical delete hospitalSet by id")
    @DeleteMapping("{id}")
    public Result deleteHospitalSet(@PathVariable Long id) {
        boolean flag = hospitalSetService.removeById(id);
        if (flag) {
            return Result.ok();
        }  else {
            return Result.fail();
        }
    }

    // 3. find hospital with conditional query and paging
    @ApiOperation(value = "find hospitalSet with paging")
    @PostMapping("findPage/{current}/{limit}")
    public Result findPageHospSet(@PathVariable Long current,
                                  @PathVariable Long limit,
                                  @RequestBody(required = false) HospitalSetQueryVo hospitalSetQueryVo) {
        // page object, current, limit
        Page<HospitalSet> page = new Page<>(current, limit);
        // query wrapper
        QueryWrapper<HospitalSet> queryWrapper = new QueryWrapper<>();
        // get hospital name and hospital code
        String hosname = hospitalSetQueryVo.getHosname();
        String hoscode = hospitalSetQueryVo.getHoscode();
        // if hospital name and hospital code are not null then add query wrapper
        if (!StringUtils.isEmpty(hosname)) {
            queryWrapper.like("hosname", hospitalSetQueryVo.getHosname());
        }
        if (!StringUtils.isEmpty(hoscode)) {
            queryWrapper.eq("hoscode", hospitalSetQueryVo.getHoscode());
        }
        // find hospitalSet with paging
        Page<HospitalSet> pageHospitalSet = hospitalSetService.page(page, queryWrapper);

        return Result.ok(pageHospitalSet);

    }
    // 4. add hospitalSet
    // 5. update hospitalSet by id
    // 6. delete hospitalSet
    // 7. multiple delete hospitalSet

}
