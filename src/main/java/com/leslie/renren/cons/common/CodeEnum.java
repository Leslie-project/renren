package com.leslie.renren.cons.common;

public enum CodeEnum {
	// 1000~2000公用校验码
	// 2000~3000业务编码
	// 3000~4000为第三方业务编码
	// 4000~5000为授权相关校验码
	// 5000~6000为前端业务编码
	SUCCESS(0, "成功"),
	//
	ERROR(-1, "系统异常"),
	//
	ERROR_PARAM(1001, "参数为空或无效"),
	//
	ERROR_BUS(2001, "业务异常，请参考响应结果!");

	private final int code;
	private final String msg;

	private CodeEnum(int code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public int getCode() {
		return code;
	}

	public String getMsg() {
		return msg;
	}

}
