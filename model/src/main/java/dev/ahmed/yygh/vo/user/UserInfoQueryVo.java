package dev.ahmed.yygh.vo.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "UserInfoQueryVo")
public class UserInfoQueryVo {

    @ApiModelProperty(value = "keyword")
    private String keyword;

    @ApiModelProperty(value = "status")
    private Integer status;

    @ApiModelProperty(value = "authStatus")
    private Integer authStatus;

    @ApiModelProperty(value = "createTimeBegin")
    private String createTimeBegin;

    @ApiModelProperty(value = "createTimeEnd")
    private String createTimeEnd;
}
