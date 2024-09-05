package com.tijian.exception;
import com.tijian.pojo.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestControllerAdvice;



/**
 * @author : rbe
 * @date : 2024/9/5 11:48
 *
 * 全局异常处理器，处理项目中抛出的业务异常
 */
@RestControllerAdvice
@Slf4j
public class ExceptionHandler {

    /**
     * 捕获业务异常
     * @param ex
     * @return
     */
    @org.springframework.web.bind.annotation.ExceptionHandler
    public Result exceptionHandler(TijianException ex){
        log.error("异常信息：{}", ex.getMsg());
        return Result.error(ex.getCode(),ex.getMsg());
    }

//    /**
//     * 处理SQL异常
//     * @param ex
//     * @return
//     */
//    @ExceptionHandler
//    public CommonResult exceptionHandler(SQLIntegrityConstraintViolationException ex){
//        //Duplicate entry 'zhangsan' for key 'employee.idx_username'
//        String message = ex.getMessage();
//        if(message.contains("Duplicate entry")){
//            String[] split = message.split(" ");
//            String username = split[2];
//            String msg = username + MessageConstant.ALREADY_EXISTS;
//            return CommonResult.error(msg);
//        }else{
//            return CommonResult.error(MessageConstant.UNKNOWN_ERROR);
//        }
//    }
}