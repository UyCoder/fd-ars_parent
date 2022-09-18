package dev.ahmed.yygh.model.hosp;

import dev.ahmed.yygh.model.base.BaseEntity;
import dev.ahmed.yygh.model.base.BaseMongoEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * Schedule
 * </p>
 *
 * @author qy
 */
@Data
@ApiModel(description = "Schedule")
@Document("Schedule")
public class Schedule extends BaseMongoEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "hoscode")
    @Indexed //普通索引
    private String hoscode;

    @ApiModelProperty(value = "depcode")
    @Indexed //普通索引
    private String depcode;

    @ApiModelProperty(value = "title")
    private String title;

    @ApiModelProperty(value = "docname")
    private String docname;

    @ApiModelProperty(value = "skill")
    private String skill;

    @ApiModelProperty(value = "workDate")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date workDate;

    @ApiModelProperty(value = "workTime（0：上午 1：下午）")
    private Integer workTime;

    @ApiModelProperty(value = "reservedNumber")
    private Integer reservedNumber;

    @ApiModelProperty(value = "availableNumber")
    private Integer availableNumber;

    @ApiModelProperty(value = "amount")
    private BigDecimal amount;

    @ApiModelProperty(value = "status（-1：停诊 0：停约 1：可约）")
    private Integer status;

    @ApiModelProperty(value = "hosScheduleId（医院自己的排班主键）")
    @Indexed //普通索引
    private String hosScheduleId;
}

