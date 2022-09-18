package dev.ahmed.yygh.common.exception;

import dev.ahmed.yygh.common.result.ResultCodeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Custom global exception class
 *
 * @author qy
 */
@Data
@ApiModel(value = "Custom global exception class")
public class YyghException extends RuntimeException {

    @ApiModelProperty(value = "excepion code")
    private Integer code;

    /**
     * Create exception object with status code and error message
     *
     * @param message
     * @param code
     */
    public YyghException(String message, Integer code) {
        super(message);
        this.code = code;
    }

    /**
     * Receive enumeration type object and return corresponding exception object
     *
     * @param resultCodeEnum
     */
    public YyghException(ResultCodeEnum resultCodeEnum) {
        super(resultCodeEnum.getMessage());
        this.code = resultCodeEnum.getCode();
    }

    @Override
    public String toString() {
        return "YyghException{" +
                "code=" + code +
                ", message=" + this.getMessage() +
                '}';
    }
}
