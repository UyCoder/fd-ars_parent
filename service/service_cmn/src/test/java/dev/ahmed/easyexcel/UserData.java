package dev.ahmed.easyexcel;


import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

@Data
public class UserData {

    @ExcelProperty("User ID")
    private int uid;

    @ExcelProperty("User Name")
    private String username;
}
