package dev.ahmed.yygh.model.hosp;

import com.alibaba.fastjson.JSONObject;
import dev.ahmed.yygh.model.base.BaseEntity;
import dev.ahmed.yygh.model.base.BaseMongoEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * <p>
 * Hospital
 * </p>
 *
 * @author qy
 */
@Data
@ApiModel(description = "Hospital")
@Document("Hospital")
public class Hospital extends BaseMongoEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "hoscode")
    @Indexed(unique = true) // unique
    private String hoscode;

    @ApiModelProperty(value = "hosname")
    @Indexed
    private String hosname;

    @ApiModelProperty(value = "hostype")
    private String hostype;

    @ApiModelProperty(value = "provinceCode")
    private String provinceCode;

    @ApiModelProperty(value = "cityCode")
    private String cityCode;

    @ApiModelProperty(value = "districtCode")
    private String districtCode;

    @ApiModelProperty(value = "address")
    private String address;

    @ApiModelProperty(value = "logoData")
    private String logoData;

    @ApiModelProperty(value = "intro")
    private String intro;

    @ApiModelProperty(value = "route")
    private String route;

    @ApiModelProperty(value = "status 0：未上线 1：已上线")
    private Integer status;

    //预约规则
    @ApiModelProperty(value = "bookingRule")
    private BookingRule bookingRule;

    public void setBookingRule(String bookingRule) {
        this.bookingRule = JSONObject.parseObject(bookingRule, BookingRule.class);
    }
}

