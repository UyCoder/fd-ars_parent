package dev.ahmed.yygh.vo.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description="RegisterVo")
public class RegisterVo {

    @ApiModelProperty(value = "mobile")
    private String mobile;

    @ApiModelProperty(value = "password")
    private String password;

    @ApiModelProperty(value = "code")
    private String code;
}
