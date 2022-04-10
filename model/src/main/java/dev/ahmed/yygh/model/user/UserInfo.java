package dev.ahmed.yygh.model.user;

import dev.ahmed.yygh.model.base.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * <p>
 * UserInfo
 * </p>
 *
 * @author qy
 */
@Data
@ApiModel(description = "UserInfo")
@TableName("user_info")
public class UserInfo extends BaseEntity {
	
	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value = "openid")
	@TableField("openid")
	private String openid;

	@ApiModelProperty(value = "nickName")
	@TableField("nick_name")
	private String nickName;

	@ApiModelProperty(value = "phone")
	@TableField("phone")
	private String phone;

	@ApiModelProperty(value = "name")
	@TableField("name")
	private String name;

	@ApiModelProperty(value = "certificatesType")
	@TableField("certificates_type")
	private String certificatesType;

	@ApiModelProperty(value = "certificatesNo")
	@TableField("certificates_no")
	private String certificatesNo;

	@ApiModelProperty(value = "certificatesUrl")
	@TableField("certificates_url")
	private String certificatesUrl;

	@ApiModelProperty(value = "authStatus（0：未认证 1：认证中 2：认证成功 -1：认证失败）")
	@TableField("auth_status")
	private Integer authStatus;

	@ApiModelProperty(value = "status（0：锁定 1：正常）")
	@TableField("status")
	private Integer status;

}

