package dev.ahmed.yygh.common.exception;

import dev.ahmed.yygh.common.result.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Created: 4/9/2022 19:03
 * @Email: AhmedBughra@gmail.com
 * @CreatedWith: IntelliJ IDEA
 */
@ControllerAdvice
public class GlobalExceptionHandler {

   @ExceptionHandler(Exception.class)
   @ResponseBody
   public Result error(Exception e){
       e.printStackTrace();
       return Result.fail();
   }


    @ExceptionHandler(YyghException.class)
    @ResponseBody
    public Result error(YyghException e){
        e.printStackTrace();
        return Result.fail();
    }
}

