package dev.ahmed.yygh.vo.acl;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * RoleQueryVo
 * </p>
 *
 * @author qy
 * @since 2019-11-08
 */
@Data
@ApiModel(description = "Role Quiery")
public class RoleQueryVo implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value = "roleName")
	private String roleName;

}

