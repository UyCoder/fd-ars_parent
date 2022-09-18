package dev.ahmed.yygh.model.user;

import dev.ahmed.yygh.model.base.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * <p>
 * Patient
 * </p>
 *
 * @author qy
 */
@Data
@ApiModel(description = "Patient")
@TableName("patient")
public class Patient extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "userId")
    @TableField("user_id")
    private Long userId;

    @ApiModelProperty(value = "name")
    @TableField("name")
    private String name;

    @ApiModelProperty(value = "certificatesType")
    @TableField("certificates_type")
    private String certificatesType;

    @ApiModelProperty(value = "certificatesNo")
    @TableField("certificates_no")
    private String certificatesNo;

    @ApiModelProperty(value = "sex")
    @TableField("sex")
    private Integer sex;

    @ApiModelProperty(value = "birthdate")
    @JsonFormat(pattern = "yyyy-MM-dd")
    @TableField("birthdate")
    private Date birthdate;

    @ApiModelProperty(value = "phone")
    @TableField("phone")
    private String phone;

    @ApiModelProperty(value = "isMarry")
    @TableField("is_marry")
    private Integer isMarry;

    @ApiModelProperty(value = "provinceCode")
    @TableField("province_code")
    private String provinceCode;

    @ApiModelProperty(value = "cityCode")
    @TableField("city_code")
    private String cityCode;

    @ApiModelProperty(value = "districtCode")
    @TableField("district_code")
    private String districtCode;

    @ApiModelProperty(value = "address")
    @TableField("address")
    private String address;

    @ApiModelProperty(value = "contactsName")
    @TableField("contacts_name")
    private String contactsName;

    @ApiModelProperty(value = "contactsCertificatesType")
    @TableField("contacts_certificates_type")
    private String contactsCertificatesType;

    @ApiModelProperty(value = "contactsCertificatesNo")
    @TableField("contacts_certificates_no")
    private String contactsCertificatesNo;

    @ApiModelProperty(value = "contactsPhone")
    @TableField("contacts_phone")
    private String contactsPhone;

    @ApiModelProperty(value = "isInsure")
    @TableField("is_insure")
    private Integer isInsure;

    @ApiModelProperty(value = "cardNo")
    @TableField("card_no")
    private String cardNo;

    @ApiModelProperty(value = "status（0：默认 1：已认证）")
    @TableField("status")
    private String status;
}

