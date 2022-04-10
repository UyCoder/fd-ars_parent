package dev.ahmed.yygh.model.cms;

import dev.ahmed.yygh.model.base.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * <p>
 * 首页Banner实体
 * </p>
 *
 * @author qy
 * @since 2019-11-08
 */
@Data
@ApiModel(description = "Banner")
@TableName("banner")
public class Banner extends BaseEntity {
	
	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value = "title")
	@TableField("title")
	private String title;

	@ApiModelProperty(value = "imageUrl")
	@TableField("image_url")
	private String imageUrl;

	@ApiModelProperty(value = "linkUrl")
	@TableField("link_url")
	private String linkUrl;

	@ApiModelProperty(value = "sort")
	@TableField("sort")
	private Integer sort;

}

