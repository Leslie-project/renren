package com.leslie.renren.cons.common;



import com.leslie.renren.tools.utils.CodeMessage;

public class Response<T> {
    private String code;
    private String message;
    private T data;

    private Response(String code,String message,T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }



    private Response(CodeMessage codeMessage) {
        if (codeMessage != null) {
            this.code = codeMessage.getCode();
            this.message = codeMessage.getMessage();
        }
    }


    /**
     * 成功
     *
     * @param data 数据
     * @param <T>  泛型
     * @return Result
     */
    public static <T> Response<T> success(T data) {
        return new Response<T>("200","成功",data);
    }

    /**
     * 成功( 无返数据)
     *
     * @param <T> 泛型
     * @return Result
     */
    public static <T> Response<T> success() {
        return (Response<T>) success("");
    }


    /**
     * 失败
     *
     * @param codeMessage 消息常量
     * @param <T>         泛型
     * @return Result
     */
    public static <T> Response<T> error(CodeMessage codeMessage) {
        return new Response<T>(codeMessage);
    }


    /**
     * 失败
     *
     * @param <T>         泛型
     * @return Result
     */
    public static <T> Response<T> errorMessage(String code,String message,T data) {
        return new Response<T>(code,message,data);
    }


    public T getData() {
        return data;
    }

    public String getMessage() {
        return message;
    }

    public String getCode() {
        return code;
    }


}


