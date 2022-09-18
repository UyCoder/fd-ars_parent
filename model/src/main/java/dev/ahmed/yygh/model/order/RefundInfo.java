package dev.ahmed.yygh.model.order;

import dev.ahmed.yygh.model.base.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * RefundInfo
 * </p>
 *
 * @author qy
 */
@Data
@ApiModel(description = "RefundInfo")
@TableName("refund_info")
public class RefundInfo extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "outTradeNo")
    @TableField("out_trade_no")
    private String outTradeNo;

    @ApiModelProperty(value = "orderId")
    @TableField("order_id")
    private Long orderId;

    @ApiModelProperty(value = "paymentType（微信 支付宝）")
    @TableField("payment_type")
    private Integer paymentType;

    @ApiModelProperty(value = "tradeNo")
    @TableField("trade_no")
    private String tradeNo;

    @ApiModelProperty(value = "totalAmount")
    @TableField("total_amount")
    private BigDecimal totalAmount;

    @ApiModelProperty(value = "subject")
    @TableField("subject")
    private String subject;

    @ApiModelProperty(value = "refundStatus")
    @TableField("refund_status")
    private Integer refundStatus;

    @ApiModelProperty(value = "callbackTime")
    @TableField("callback_time")
    private Date callbackTime;

    @ApiModelProperty(value = "callbackContent")
    @TableField("callback_content")
    private String callbackContent;
}

