package dev.ahmed.yygh.vo.order;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "OrderCountVo")
public class OrderCountVo {

    @ApiModelProperty(value = "reserveDate")
    private String reserveDate;

    @ApiModelProperty(value = "count")
    private Integer count;
}

