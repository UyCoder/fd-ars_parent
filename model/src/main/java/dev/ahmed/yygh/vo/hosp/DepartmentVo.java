package dev.ahmed.yygh.vo.hosp;

import dev.ahmed.yygh.model.hosp.Department;
import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
@ApiModel(description = "Department")
public class DepartmentVo {

	@ApiModelProperty(value = "depcode")
	private String depcode;

	@ApiModelProperty(value = "depname")
	private String depname;

	@ApiModelProperty(value = "children")
	private List<DepartmentVo> children;

}

