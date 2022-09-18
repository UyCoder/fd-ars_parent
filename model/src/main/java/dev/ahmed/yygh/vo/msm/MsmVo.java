package dev.ahmed.yygh.vo.msm;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Map;

@Data
@ApiModel(description = "MsmVo")
public class MsmVo {

    @ApiModelProperty(value = "phone")
    private String phone;

    @ApiModelProperty(value = "templateCode")
    private String templateCode;

    @ApiModelProperty(value = "parameters")
    private Map<String, Object> param;
}
