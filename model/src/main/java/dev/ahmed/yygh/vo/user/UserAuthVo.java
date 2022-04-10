package dev.ahmed.yygh.vo.user;

import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description="UserAuthVo")
public class UserAuthVo {

    @ApiModelProperty(value = "name")
    @TableField("name")
    private String name;

    @ApiModelProperty(value = "certificatesType")
    @TableField("certificates_type")
    private String certificatesType;

    @ApiModelProperty(value = "certificatesNo")
    @TableField("certificates_no")
    private String certificatesNo;

    @ApiModelProperty(value = "certificatesUrl")
    @TableField("certificates_url")
    private String certificatesUrl;

}
