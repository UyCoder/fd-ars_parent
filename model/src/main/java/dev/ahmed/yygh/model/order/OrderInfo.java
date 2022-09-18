package dev.ahmed.yygh.model.order;

import dev.ahmed.yygh.model.base.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * Order
 * </p>
 *
 * @author qy
 */
@Data
@ApiModel(description = "Order")
@TableName("order_info")
public class OrderInfo extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "userId")
    @TableField("user_id")
    private Long userId;

    @ApiModelProperty(value = "outTradeNo")
    @TableField("out_trade_no")
    private String outTradeNo;

    @ApiModelProperty(value = "hoscode")
    @TableField("hoscode")
    private String hoscode;

    @ApiModelProperty(value = "hosname")
    @TableField("hosname")
    private String hosname;

    @ApiModelProperty(value = "depcode")
    @TableField("depcode")
    private String depcode;

    @ApiModelProperty(value = "depname")
    @TableField("depname")
    private String depname;

    @ApiModelProperty(value = "scheduleId")
    @TableField("schedule_id")
    private String scheduleId;

    @ApiModelProperty(value = "title")
    @TableField("title")
    private String title;

    @ApiModelProperty(value = "reserveDate")
    @JsonFormat(pattern = "yyyy-MM-dd")
    @TableField("reserve_date")
    private Date reserveDate;

    @ApiModelProperty(value = "reserveTime（0：上午 1：下午）")
    @TableField("reserve_time")
    private Integer reserveTime;

    @ApiModelProperty(value = "patientId")
    @TableField("patient_id")
    private Long patientId;

    @ApiModelProperty(value = "patientName")
    @TableField("patient_name")
    private String patientName;

    @ApiModelProperty(value = "patientPhone")
    @TableField("patient_phone")
    private String patientPhone;

    @ApiModelProperty(value = "hosRecordId（医院预约记录主键）")
    @TableField("hos_record_id")
    private String hosRecordId;

    @ApiModelProperty(value = "number")
    @TableField("number")
    private Integer number;

    @ApiModelProperty(value = "fetchTime")
    @TableField("fetch_time")
    private String fetchTime;

    @ApiModelProperty(value = "fetchAddress")
    @TableField("fetch_address")
    private String fetchAddress;

    @ApiModelProperty(value = "amount")
    @TableField("amount")
    private BigDecimal amount;

    @ApiModelProperty(value = "quitTime")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    @TableField("quit_time")
    private Date quitTime;

    @ApiModelProperty(value = "orderStatus")
    @TableField("order_status")
    private Integer orderStatus;
}

