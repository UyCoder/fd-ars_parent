package dev.ahmed.yygh.model.hosp;

import dev.ahmed.yygh.model.base.BaseEntity;
import dev.ahmed.yygh.model.base.BaseMongoEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * <p>
 * Department
 * </p>
 *
 * @author qy
 */
@Data
@ApiModel(description = "Department")
@Document("Department")
public class Department extends BaseMongoEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "hoscode")
    @Indexed // regular
    private String hoscode;

    @ApiModelProperty(value = "depcode")
    @Indexed(unique = true) // unique
    private String depcode;

    @ApiModelProperty(value = "depname")
    private String depname;

    @ApiModelProperty(value = "intro")
    private String intro;

    @ApiModelProperty(value = "bigcode")
    private String bigcode;

    @ApiModelProperty(value = "bigname")
    private String bigname;
}

