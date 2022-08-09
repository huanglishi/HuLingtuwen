package com.huling.platform.util;

import com.huling.platform.util.ResultCodeEnum;

import java.io.Serializable;

/**
 * @Name 封装restful返回格式
 * @Classname HttpResult
 * @Description 统一结果类
 * @Date 2022/8/8 14:22 下午
 * @Author by HLS
 */
public class HttpResult <T> implements Serializable {

    /**
     * 是否响应成功
     */
    private Boolean success;
    /**
     * 响应状态码
     */
    private Integer code;
    /**
     * 响应数据
     */
    private T data;
    /**
     * 错误信息
     */
    private String message;

    // 构造器开始
    /**
     * 无参构造器(构造器私有，外部不可以直接创建)
     */
    private HttpResult() {
        this.code = 0;
        this.success = true;
    }
    /**
     * 有参构造器
     * @param obj
     */
    private HttpResult(T obj) {
        this.code = 0;
        this.data = obj;
        this.success = true;
    }
    /**
     * 有2参构造器
     * @param obj
     */
    private HttpResult(T obj,String msg) {
        this.code = 0;
        this.data = obj;
        this.success = true;
        this.message = msg;
    }
    /**
     * 有参构造器
     * @param resultCode
     */
    private HttpResult(ResultCodeEnum resultCode) {
        this.success = false;
        this.code = resultCode.getCode();
        this.message = resultCode.getMessage();
    }
    // 构造器结束

    /**
     * 通用返回成功（没有返回结果）
     * @param <T>
     * @return
     */
    public static<T> HttpResult<T> success(){
        return new HttpResult();
    }

    /**
     * 返回成功（有返回结果）
     * @param data
     * @param <T>
     * @return
     */
    public static<T> HttpResult<T> success(T data){
        return new HttpResult<T>(data);
    }

    /**
     * 返回成功（有返回结果，数据和提示语）
     * @param data
     * @param <T>
     * @return
     */
    public static<T> HttpResult<T> success(String msg,T data){
        return new HttpResult<T>(data,msg);
    }

    /**
     * 通用返回失败
     * @param resultCode
     * @param <T>
     * @return
     */
    public static<T> HttpResult<T> failure(ResultCodeEnum resultCode){
        return  new HttpResult<T>(resultCode);
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "HttpResult{" +
                "success=" + success +
                ", code=" + code +
                ", data=" + data +
                ", message='" + message + '\'' +
                '}';
    }
}

