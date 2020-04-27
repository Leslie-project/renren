package com.leslie.renren.modules.sys.service;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 验证码
 */
public interface SysCaptchaService {
    /**
     * 获取验证码
     * @param request
     * @param response
     */
    void getCaptcha(HttpServletRequest request, HttpServletResponse response);


    boolean checkCaptcha(String value,HttpSession session);
}
