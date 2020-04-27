package com.leslie.renren.modules.sys.service.Impl;

import com.leslie.renren.modules.sys.service.SysCaptchaService;

import com.leslie.renren.tools.utils.CreateCaptchaUtil;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Service
public class SysCaptchaServiceImpl implements SysCaptchaService {


    @Override
    public void getCaptcha(javax.servlet.http.HttpServletRequest request, HttpServletResponse response) {

            response.setContentType("image/jpeg");//设置相应类型,告诉浏览器输出的内容为图片
            response.setHeader("Pragma", "No-cache");//设置响应头信息，告诉浏览器不要缓存此内容
            response.setHeader("Cache-Control", "no-cache");
            response.setDateHeader("Expire", 0);
            CreateCaptchaUtil createCaptchaUtil = new CreateCaptchaUtil();
            createCaptchaUtil.getRandcode(request, response);//输出验证码图片方法

    }

    @Override
    public boolean checkCaptcha(String value,HttpSession session) {
            //从session中获取随机数
            String inputStr = value;
            String random = (String) session.getAttribute("RANDOMVALIDATECODEKEY");
            if (random == null) {
                return false;
            }
            if (random.equals(inputStr)) {
                return true;
            } else {
                return false;
            }


    }
}
