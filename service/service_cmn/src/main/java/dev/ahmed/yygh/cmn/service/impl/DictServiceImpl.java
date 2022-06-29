package dev.ahmed.yygh.cmn.service.impl;

import com.alibaba.excel.EasyExcel;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import dev.ahmed.yygh.cmn.controller.DictController;
import dev.ahmed.yygh.cmn.mapper.DictMapper;
import dev.ahmed.yygh.cmn.service.DictService;
import dev.ahmed.yygh.model.cmn.Dict;
import dev.ahmed.yygh.model.hosp.HospitalSet;
import dev.ahmed.yygh.vo.cmn.DictEeVo;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

/**
 * @Created: 4/8/2022 00:33
 * @Email: AhmedBughra@gmail.com
 * @CreatedWith: IntelliJ IDEA
 */
@Service
public class DictServiceImpl extends ServiceImpl<DictMapper, Dict> implements DictService {
    @Override
    public List<Dict> findChildData(Long id) {
        QueryWrapper<Dict> wrapper = new QueryWrapper<>();
        wrapper.eq("parent_id", id);
        List<Dict> dictList = baseMapper.selectList(wrapper);

        // list has no parent_id, so we need to set it manually
        for (Dict dict : dictList) {
            Long dictId = dict.getId();
            boolean isChild = this.isChildren(dictId);
            dict.setHasChildren(isChild);
        }
        return dictList;
    }

    @Override
    public void exportDictData(HttpServletResponse response) {
        // configuration of download file
        response.setContentType("application/vnd.ms-excel");
        response.setCharacterEncoding("UTF-8");
        String fileName = "dict";
        response.setHeader("Content-Disposition", "attachment;filename="+fileName+".xls");

        // search Database
        List<Dict> dictList = baseMapper.selectList(null);
        // Dicrt -> DictEevo
        List<DictEeVo> dictVoList = new ArrayList<>();
        for (Dict dict : dictList) {
            DictEeVo dictEeVo = new DictEeVo();
            dictEeVo.setId(dict.getId());
            BeanUtils.copyProperties(dict, dictEeVo);
            dictVoList.add(dictEeVo);
        }

        // write to excel file
        try {
            EasyExcel.write(response.getOutputStream(), DictEeVo.class).sheet("dict")
                    .doWrite(dictVoList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // booleadn has child data
    private boolean isChildren(Long id){
        QueryWrapper<Dict> wrapper = new QueryWrapper<>();
        wrapper.eq("parent_id", id);
        Integer count = baseMapper.selectCount(wrapper);
        return count > 0;
    }
}
