package dev.ahmed.yygh.vo.hosp;

import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
@ApiModel(description = "Schedule")
public class ScheduleOrderVo {

	@ApiModelProperty(value = "hoscode")
	private String hoscode;

	@ApiModelProperty(value = "hosname")
	private String hosname;

	@ApiModelProperty(value = "depcode")
	private String depcode;

	@ApiModelProperty(value = "depname")
	private String depname;

	@ApiModelProperty(value = "hosScheduleId（医院自己的排班主键）")
	private String hosScheduleId;

	@ApiModelProperty(value = "title")
	private String title;

	@ApiModelProperty(value = "reserveDate")
	private Date reserveDate;

	@ApiModelProperty(value = "availableNumber")
	private Integer availableNumber;

	@ApiModelProperty(value = "reserveTime（0：上午 1：下午）")
	private Integer reserveTime;

	@ApiModelProperty(value = "amount")
	private BigDecimal amount;

	@ApiModelProperty(value = "quitTime")
	private Date quitTime;

	@ApiModelProperty(value = "startTime")
	private Date startTime;

	@ApiModelProperty(value = "endTime")
	private Date endTime;

	@ApiModelProperty(value = "stopTime")
	private Date stopTime;
}

