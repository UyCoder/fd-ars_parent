package dev.ahmed.yygh.cmn.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import dev.ahmed.yygh.cmn.controller.DictController;
import dev.ahmed.yygh.cmn.mapper.DictMapper;
import dev.ahmed.yygh.cmn.service.DictService;
import dev.ahmed.yygh.model.cmn.Dict;
import dev.ahmed.yygh.model.hosp.HospitalSet;
import org.springframework.stereotype.Service;

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

    // booleadn has child data
    private boolean isChildren(Long id){
        QueryWrapper<Dict> wrapper = new QueryWrapper<>();
        wrapper.eq("parent_id", id);
        Integer count = baseMapper.selectCount(wrapper);
        return count > 0;
    }
}
