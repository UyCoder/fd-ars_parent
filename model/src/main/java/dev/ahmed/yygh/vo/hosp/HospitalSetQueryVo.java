package dev.ahmed.yygh.vo.hosp;

import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class HospitalSetQueryVo {

    @ApiModelProperty(value = "hospital name")
    private String hosname;

    @ApiModelProperty(value = "hospital code")
    private String hoscode;
}
