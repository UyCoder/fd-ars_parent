package dev.ahmed.easyexcel;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;

import java.util.Map;

public class ExcelListener extends AnalysisEventListener<UserData> {


    // read line by line
    @Override
    public void invoke(UserData userData, AnalysisContext analysisContext) {
        System.out.println(userData);
    }

    @Override
    public void invokeHeadMap(Map<Integer, String> headMap, AnalysisContext context) {
        System.out.println("table head info" + headMap);
    }

    // after read all lines
    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
    }
}
