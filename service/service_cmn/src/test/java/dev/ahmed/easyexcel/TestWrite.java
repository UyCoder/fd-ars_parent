package dev.ahmed.easyexcel;

import com.alibaba.excel.EasyExcel;

import java.util.ArrayList;
import java.util.List;

public class TestWrite {
    public static void main(String[] args) {
        // build data list
        List<UserData> list = new ArrayList();
        for (int i = 0; i < 10; i++) {
            UserData Data = new UserData();
            Data.setUid(i);
            Data.setUsername("lucy" + i);
            list.add(Data);
        }


        // configure excel files path and name
        String fileName = "C:\\Users\\Javad\\Desktop\\excel\\01.xlsx";


        // create a new excel writer
        EasyExcel.write(fileName, UserData.class)
                .sheet("UserInfo")
                .doWrite(list);
    }
}
