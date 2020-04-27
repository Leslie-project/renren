package com.leslie.renren.modules.sys.controller;



import com.leslie.renren.cons.common.Response;
import com.leslie.renren.dao.mybatis.ISysUserDao;
import com.leslie.renren.modules.sys.form.SysLoginForm;
import com.leslie.renren.modules.sys.service.SysCaptchaService;
import com.leslie.renren.modules.sys.service.SysLoginService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 用户登录控制层
 */
@RestController

public class SysLoginController {

    private Logger logger = LoggerFactory.getLogger(SysLoginController.class);

    @Autowired
    private SysCaptchaService sysCaptchaService;

    @Autowired
    private SysLoginService sysLoginService;

    @Autowired
    private ISysUserDao sysUserDao;

    @GetMapping("captcha.jpg")
    public void captcha (HttpServletRequest request, HttpServletResponse response){
        sysCaptchaService.getCaptcha(request,response);
    }

    @PostMapping("sys/login")
    public Response login(@RequestBody SysLoginForm sysLoginForm){
        return sysLoginService.login(sysLoginForm);
    }



}
