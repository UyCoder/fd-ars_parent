package dev.ahmed.yygh.model.acl;

import dev.ahmed.yygh.model.base.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * <p>
 * 权限
 * </p>
 *
 * @author qy
 * @since 2019-11-08
 */
@Data
@ApiModel(description = "Permission")
@TableName("acl_permission")
public class Permission extends BaseEntity {
	
	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value = "pid")
	@TableField("pid")
	private Long pid;

	@ApiModelProperty(value = "name")
	@TableField("name")
	private String name;

	@ApiModelProperty(value = "type(1:菜单,2:按钮)")
	@TableField("type")
	private Integer type;

	@ApiModelProperty(value = "permissionValue")
	@TableField("permission_value")
	private String permissionValue;

	@ApiModelProperty(value = "path")
	@TableField("path")
	private String path;

	@ApiModelProperty(value = "component")
	@TableField("component")
	private String component;

	@ApiModelProperty(value = "icon")
	@TableField("icon")
	private String icon;

	@ApiModelProperty(value = "status(0:禁止,1:正常)")
	@TableField("status")
	private Integer status;

	@ApiModelProperty(value = "level")
	@TableField(exist = false)
	private Integer level;

	@ApiModelProperty(value = "children")
	@TableField(exist = false)
	private List<Permission> children;

	@ApiModelProperty(value = "isSelected")
	@TableField(exist = false)
	private boolean isSelect;

}

