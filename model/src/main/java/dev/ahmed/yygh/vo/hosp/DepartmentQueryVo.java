package dev.ahmed.yygh.vo.hosp;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "Department")
public class DepartmentQueryVo {
	
	@ApiModelProperty(value = "hoscode")
	private String hoscode;

	@ApiModelProperty(value = "depcode")
	private String depcode;

	@ApiModelProperty(value = "depname")
	private String depname;

	@ApiModelProperty(value = "bigcode")
	private String bigcode;

	@ApiModelProperty(value = "bigname")
	private String bigname;

}

