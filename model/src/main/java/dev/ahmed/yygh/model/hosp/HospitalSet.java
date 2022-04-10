package dev.ahmed.yygh.model.hosp;

import dev.ahmed.yygh.model.base.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * <p>
 * HospitalSet
 * </p>
 *
 * @author qy
 */
@Data
@ApiModel(description = "hospitalSet")
@TableName("hospital_set")
public class HospitalSet extends BaseEntity {
	
	private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "hosname")
	@TableField("hosname")
	private String hosname;

	@ApiModelProperty(value = "hoscode")
	@TableField("hoscode")
	private String hoscode;

	@ApiModelProperty(value = "apiUrl")
	@TableField("api_url")
	private String apiUrl;

	@ApiModelProperty(value = "signKey")
	@TableField("sign_key")
	private String signKey;

	@ApiModelProperty(value = "contactsName")
	@TableField("contacts_name")
	private String contactsName;

	@ApiModelProperty(value = "contactsPhone")
	@TableField("contacts_phone")
	private String contactsPhone;

	@ApiModelProperty(value = "status")
	@TableField("status")
	private Integer status;

}

