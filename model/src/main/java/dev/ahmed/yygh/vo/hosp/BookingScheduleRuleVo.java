package dev.ahmed.yygh.vo.hosp;

import dev.ahmed.yygh.model.base.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * <p>
 * RegisterRule
 * </p>
 *
 * @author qy
 */
@Data
@ApiModel(description = "BookingScheduleRuleVo")
public class BookingScheduleRuleVo {

    @ApiModelProperty(value = "workDate")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date workDate;

    @ApiModelProperty(value = "workDateMd")
    @JsonFormat(pattern = "MM月dd日")
    private Date workDateMd; //方便页面使用

    @ApiModelProperty(value = "dayOfWeek")
    private String dayOfWeek;

    @ApiModelProperty(value = "docCount")
    private Integer docCount;

    @ApiModelProperty(value = "reservedNumber")
    private Integer reservedNumber;

    @ApiModelProperty(value = "availableNumber")
    private Integer availableNumber;

    @ApiModelProperty(value = "status 0：正常 1：即将放号 -1：当天已停止挂号")
    private Integer status;
}

