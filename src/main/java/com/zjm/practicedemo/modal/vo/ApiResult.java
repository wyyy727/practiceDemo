package com.zjm.practicedemo.modal.vo;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;


/**
 * 用于接口返回值统一格式
 * @author zjm
 *
 * @param <T>
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiResult<T> implements Serializable {
	/** status - success */
	public final static String STATUS_SUCCESS = "success";
	/**  status - failure */
	public final static String STATUS_FAILURE = "failure";
	
	public ApiResult(){
		
	}
	
	/**
	 * 初始状态
	 * @param status
	 */
	public ApiResult(String status){
		this.status = status;
	}

	public ApiResult(int code, String msg, String status) {
		this.code = code;
		this.message = msg;
		this.status = status;
	}
	public static <T> ApiResult<T> success(String msg) {
		ApiResult<T> result = new ApiResult<T>(0, msg, STATUS_SUCCESS);
		return result;
	}
	public static <T> ApiResult<T> success(String msg, T t) {
		ApiResult<T> result = new ApiResult<T>(0, msg, STATUS_SUCCESS);
		result.setData(t);
		return result;
	}
	public static <T> ApiResult<T> error(int code, String msg) {
		ApiResult<T> result = new ApiResult<T>(code, msg, STATUS_FAILURE);
		return result;
	}
	
	/**
	 * 返回 code非0，status==success
	 * @param int
	 * @param <T>
	 * @return
	 */
	public static <T> ApiResult<T> failure(int code, String msg) {
		ApiResult<T> result = new ApiResult<T>(code, msg, STATUS_SUCCESS);
		//if(t != null) result.setData(t);
		return result;
	}
	
	private static final long serialVersionUID = -4454475104964622455L;
	@JSONField(name="status")
	private String status;
	
	@JSONField(name="data")
	private T data;
	
	@JSONField(name="code")
	private int code;
	
	@JSONField(name="message")
	private String message;
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "ApiResult [status=" + status + ", data=" + data + ", code=" + code + ", message=" + message + "]";
	}
	
}
