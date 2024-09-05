package com.tijian.pojo;

import java.io.Serializable;

/**
 * @author : rbe
 * @date : 2024/9/5 11:27
 */
public class Result<T> implements Serializable {

    public static final int CORE_SUCCESS = 200;

    public static final int CORE_ERROR = 500;

    /** 状态码 */
    private int code;

    /** 提示语 */
    private String msg;

    /** 返回数据 */
    private T data;

    public Result(){}

    public Result(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public Integer getCode() {
        return this.code;
    }

    public String getMsg() {
        return this.msg;
    }

    public T getData() {
        return this.data;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setData(T data) {
        this.data = data;
    }

    // ============================  构建  ==================================

    // 构建成功
    public static <T> Result<T> success(){
        return new Result<>(CORE_SUCCESS,"操作成功",null);
    }

    public static <T> Result<T> success(String msg){
        return new Result<>(CORE_SUCCESS,msg,null);
    }

    public static <T> Result<T> code(int code){
        return new Result<>(code,null,null);
    }

    public static <T> Result<T> data(T data){
        return new Result<>(CORE_SUCCESS,"操作成功",data);
    }

    // 构建失败
    public static <T> Result<T> error(){
        return new Result<>(CORE_ERROR,"服务器异常",null);
    }

    public static <T> Result<T> error(String msg){
        return new Result<>(CORE_ERROR,msg,null);
    }

    public static <T> Result<T> error(int code, String msg){
        return new Result<>(code,msg,null);
    }

    // 构建指定状态码
    public static <T> Result<T> code(int code, String msg, T data){
        return new Result<>(code,msg,data);
    }


    @Override
    public String toString() {
        return "{"
                + "\"code\":" + this.code
                + ", \"msg\":\"" + this.msg + "\""
                + ", \"data\":" + this.data
                + "}";
    }
}
