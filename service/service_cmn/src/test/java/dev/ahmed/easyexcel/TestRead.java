package dev.ahmed.easyexcel;

import com.alibaba.excel.EasyExcel;

public class TestRead {
    public static void main(String[] args) {
        // configure excel files path and name
        String fileName = "C:\\Users\\Javad\\Desktop\\excel\\01.xlsx";

        // create a new excel reader
        EasyExcel.read(fileName, UserData.class, new ExcelListener())
                .sheet()
                .doRead();
    }
}
