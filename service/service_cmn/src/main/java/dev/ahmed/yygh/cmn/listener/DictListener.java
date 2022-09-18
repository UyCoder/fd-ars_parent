package dev.ahmed.yygh.cmn.listener;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.fasterxml.jackson.databind.util.BeanUtil;
import dev.ahmed.yygh.cmn.mapper.DictMapper;
import dev.ahmed.yygh.model.cmn.Dict;
import dev.ahmed.yygh.vo.cmn.DictEeVo;
import org.springframework.beans.BeanUtils;

public class DictListener extends AnalysisEventListener<DictEeVo> {

    private DictMapper dictMapper;

    public DictListener(DictMapper dictMapper) {
        this.dictMapper = dictMapper;
    }

    // line by line read
    @Override
    public void invoke(DictEeVo dictEeVo, AnalysisContext analysisContext) {
        // data insert to database
        Dict dict = new Dict();
        BeanUtils.copyProperties(dictEeVo, dict);
        dictMapper.insert(dict);
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {

    }
}
