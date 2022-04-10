package dev.ahmed.yygh.vo.order;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
@ApiModel(description = "Order")
public class OrderQueryVo {


	@ApiModelProperty(value = "userId")
	private Long userId;
	
	@ApiModelProperty(value = "outTradeNo")
	private String outTradeNo;

	@ApiModelProperty(value = "patientId")
	private Long patientId;

	@ApiModelProperty(value = "patientName")
	private String patientName;

	@ApiModelProperty(value = "keyword")
	private String keyword;

	@ApiModelProperty(value = "orderStatus")
	private String orderStatus;

	@ApiModelProperty(value = "reserveDate")
	private String reserveDate;

	@ApiModelProperty(value = "createTime")
	private String createTimeBegin;
	private String createTimeEnd;

}

