package com.leslie.renren.tools.utils;

public class CodeMessage {
    private String code;
    private String message;
    public  static  CodeMessage SUCCESS =new CodeMessage("200","success");

    public  static  CodeMessage PARAMETER_ERROR =new CodeMessage("10001","参数错误");

    public static CodeMessage ERROR = new CodeMessage("500","服务器错误");

    public static CodeMessage NOT_FIND_DATA = new CodeMessage("500105","查找不到对应数据");



    private CodeMessage(String code, String message){
        this.code=code;
        this.message =message;
    }
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
