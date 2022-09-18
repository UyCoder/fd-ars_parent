package dev.ahmed.yygh.model.acl;

import dev.ahmed.yygh.model.base.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * <p>
 * 用户角色
 * </p>
 *
 * @author qy
 * @since 2019-11-08
 */
@Data
@ApiModel(description = "user role")
@TableName("acl_user_role")
public class UserRole extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "roleId")
    @TableField("role_id")
    private Long roleId;

    @ApiModelProperty(value = "userId")
    @TableField("user_id")
    private Long userId;
}

