package dev.ahmed.yygh.model.cmn;

import dev.ahmed.yygh.model.base.BaseEntity;
import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * Dict
 * </p>
 *
 * @author qy
 */
@Data
@ApiModel(description = "dictionary")
@TableName("dict")
public class Dict {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    private Long id;

    @ApiModelProperty(value = "createTime")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField("create_time")
    private Date createTime;

    @ApiModelProperty(value = "updateTime")
    @TableField("update_time")
    private Date updateTime;

    @ApiModelProperty(value = "isDeleted(1:已删除，0:未删除)")
    @TableLogic
    @TableField("is_deleted")
    private Integer isDeleted;

    @ApiModelProperty(value = "params")
    @TableField(exist = false)
    private Map<String,Object> param = new HashMap<>();

    @ApiModelProperty(value = "parentId")
    @TableField("parent_id")
    private Long parentId;

    @ApiModelProperty(value = "name")
    @TableField("name")
    private String name;

    @ApiModelProperty(value = "value")
    @TableField("value")
    private String value;

    @ApiModelProperty(value = "dictCode")
    @TableField("dict_code")
    private String dictCode;

    @ApiModelProperty(value = "hasChildren")
    @TableField(exist = false)
    private boolean hasChildren;

}