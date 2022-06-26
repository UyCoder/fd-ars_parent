package dev.ahmed.easyexcel;


import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

@Data
public class UserData {

    @ExcelProperty(value = "User ID", index = 0)
    private int uid;

    @ExcelProperty(value = "User Name", index = 1)
    private String username;
}
