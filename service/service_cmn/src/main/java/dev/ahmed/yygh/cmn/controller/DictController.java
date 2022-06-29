package dev.ahmed.yygh.cmn.controller;

import dev.ahmed.yygh.cmn.service.DictService;
import dev.ahmed.yygh.common.result.Result;
import dev.ahmed.yygh.model.cmn.Dict;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Api(tags = "Dictionary Controller")
@RestController
@RequestMapping("/admin/cmn/dict")
@CrossOrigin
public class DictController {

    @Autowired
    private DictService dictService;

    // import dict data
    @PostMapping("importData")
    public Result importDict(MultipartFile file) {
        dictService.importDictData(file);
        return Result.ok();
    }



    // export data
    @GetMapping("/exportData")
    public void exportDict(HttpServletResponse response) {
         dictService.exportDictData(response);
    }



    // search child data with id
    @ApiOperation(value = "search child data with id")
    @GetMapping("findChildData/{id}")
    public Result findChildData(@PathVariable Long id) {
        List<Dict> list = dictService.findChildData(id);
        return Result.ok(list);
    }
}
