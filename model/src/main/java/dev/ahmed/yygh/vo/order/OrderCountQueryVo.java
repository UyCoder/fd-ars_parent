package dev.ahmed.yygh.vo.order;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "OrderCountQueryVo")
public class OrderCountQueryVo {
	
	@ApiModelProperty(value = "hoscode")
	private String hoscode;

	@ApiModelProperty(value = "hosname")
	private String hosname;

	@ApiModelProperty(value = "reserveDate")
	private String reserveDateBegin;
	private String reserveDateEnd;

}

