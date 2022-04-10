package dev.ahmed.yygh.model.user;

import dev.ahmed.yygh.model.base.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * <p>
 * UserLoginRecord
 * </p>
 *
 * @author qy
 */
@Data
@ApiModel(description = "userLoginRecord")
@TableName("user_login_record")
public class UserLoginRecord extends BaseEntity {
	
	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value = "userId")
	@TableField("user_id")
	private Long userId;

	@ApiModelProperty(value = "ip")
	@TableField("ip")
	private String ip;

}

