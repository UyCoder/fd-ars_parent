package dev.ahmed.yygh.model.hosp;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import dev.ahmed.yygh.model.base.BaseEntity;
import dev.ahmed.yygh.model.base.BaseMongoEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.util.StringUtils;

import java.util.Date;
import java.util.List;

/**
 * <p>
 * RegisterRule
 * </p>
 *
 * @author qy
 */
@Data
@ApiModel(description = "BookingRule")
@Document("BookingRule")
public class BookingRule {
	
	@ApiModelProperty(value = "cycle")
	private Integer cycle;

	@ApiModelProperty(value = "releaseTime")
	private String releaseTime;

	@ApiModelProperty(value = "stopTime")
	private String stopTime;

	@ApiModelProperty(value = "quitDay（如：就诊前一天为-1，当天为0）")
	private Integer quitDay;

	@ApiModelProperty(value = "quitTime")
	private String quitTime;

	@ApiModelProperty(value = "rule")
	private List<String> rule;

	/**
	 *
	 * @param rule
	 */
	public void setRule(String rule) {
		if(!StringUtils.isEmpty(rule)) {
			this.rule = JSONArray.parseArray(rule, String.class);
		}
	}

}

