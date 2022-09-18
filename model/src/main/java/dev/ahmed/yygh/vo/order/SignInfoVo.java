package dev.ahmed.yygh.vo.order;

import dev.ahmed.yygh.model.base.BaseMongoEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

/**
 * <p>
 * HospitalSet
 * </p>
 *
 * @author qy
 */
@Data
@ApiModel(description = "SignInfo")
public class SignInfoVo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "apiUrl")
    private String apiUrl;

    @ApiModelProperty(value = "signKey")
    private String signKey;
}

