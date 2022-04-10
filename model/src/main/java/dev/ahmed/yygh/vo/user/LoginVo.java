package dev.ahmed.yygh.vo.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description="LoginVo")
public class LoginVo {

    @ApiModelProperty(value = "openid")
    private String openid;

    @ApiModelProperty(value = "phone")
    private String phone;

    @ApiModelProperty(value = "code")
    private String code;

    @ApiModelProperty(value = "IP")
    private String ip;
}
