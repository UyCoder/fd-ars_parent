package dev.ahmed.yygh.cmn.service;

import com.baomidou.mybatisplus.extension.service.IService;
import dev.ahmed.yygh.cmn.controller.DictController;
import dev.ahmed.yygh.cmn.mapper.DictMapper;
import dev.ahmed.yygh.model.cmn.Dict;
import dev.ahmed.yygh.model.hosp.HospitalSet;

import java.util.List;

/**
 * @Created: 4/8/2022 00:32
 * @Email: AhmedBughra@gmail.com
 * @CreatedWith: IntelliJ IDEA
 */
public interface DictService extends IService<Dict> {
    List<Dict> findChildData(Long id);
}
