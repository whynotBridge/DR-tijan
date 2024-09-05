package com.tijian.exception;

import lombok.Data;
import lombok.Getter;

/**
 * @author : rbe
 * @date : 2024/9/5 11:49
 */
@Data
public class TijianException extends RuntimeException{

    private final int code = 500;

    private String msg;


    public TijianException(String msg) {
        this.msg = msg;
    }

}
