package dev.ahmed.yygh.vo.hosp;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
@ApiModel(description = "Schedule")
public class ScheduleQueryVo {

    @ApiModelProperty(value = "hoscode")
    private String hoscode;

    @ApiModelProperty(value = "depcode")
    private String depcode;

    @ApiModelProperty(value = "doccode")
    private String doccode;

    @ApiModelProperty(value = "workDate")
    private Date workDate;

    @ApiModelProperty(value = "workTime（0：上午 1：下午）")
    private Integer workTime;

}

