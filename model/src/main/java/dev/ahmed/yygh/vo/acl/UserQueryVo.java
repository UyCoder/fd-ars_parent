package dev.ahmed.yygh.vo.acl;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * UserQueryVo
 * </p>
 *
 * @author qy
 * @since 2019-11-08
 */
@Data
@ApiModel(description = "user query vo")
public class UserQueryVo implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value = "username")
	private String username;

	@ApiModelProperty(value = "nickName")
	private String nickName;

}

