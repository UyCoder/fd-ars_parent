package dev.ahmed.yygh.vo.hosp;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel(description = "Hospital")
public class HospitalQueryVo implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value = "hoscode")
	private String hoscode;

	@ApiModelProperty(value = "hosname")
	private String hosname;

	@ApiModelProperty(value = "hostype")
	private String hostype;

	@ApiModelProperty(value = "provinceCode")
	private String provinceCode;

	@ApiModelProperty(value = "cityCode")
	private String cityCode;

	@ApiModelProperty(value = "districtCode")
	private String districtCode;

	@ApiModelProperty(value = "status")
	private Integer status;
}

