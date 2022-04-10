package dev.ahmed.yygh.vo.order;

import dev.ahmed.yygh.vo.msm.MsmVo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
@ApiModel(description = "OrderMqVo")
public class OrderMqVo {

	@ApiModelProperty(value = "reservedNumber")
	private Integer reservedNumber;

	@ApiModelProperty(value = "availableNumber")
	private Integer availableNumber;

	@ApiModelProperty(value = "scheduleId")
	private String scheduleId;

	@ApiModelProperty(value = "msmVo")
	private MsmVo msmVo;

}

