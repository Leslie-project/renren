package com.leslie.renren.modules.sys.service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.leslie.renren.cons.common.Response;
import com.leslie.renren.dao.mybatis.ISysUserDao;
import com.leslie.renren.entity.SysUserEntity;
import com.leslie.renren.modules.sys.form.SysLoginForm;
import com.leslie.renren.modules.sys.service.SysCaptchaService;
import com.leslie.renren.modules.sys.service.SysLoginService;
import com.leslie.renren.tools.utils.CodeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysLoginServiceImpl implements SysLoginService {

    @Autowired
    private SysCaptchaService sysCaptchaService;

    @Autowired
    private ISysUserDao userDao;

    /**
     * 用户登录
     *
     * @param sysLoginForm
     * @return
     */
    @Override
    public Response login(SysLoginForm sysLoginForm) {
        boolean isTure = sysCaptchaService.checkCaptcha(sysLoginForm.getCaptcha(), sysLoginForm.getHttpSession());
        if (!isTure) {
            return Response.error(CodeMessage.PARAMETER_ERROR);
        } else {
            QueryWrapper wrapper = new QueryWrapper();
            wrapper.eq("username", sysLoginForm.getUsername());
            SysUserEntity sysUserEntity = userDao.selectOne(wrapper);
            if (sysUserEntity == null || !sysUserEntity.getPassword().equals(sysLoginForm.getPassword())){
                return Response.error(CodeMessage.PARAMETER_ERROR);
            }
        }
        return Response.error(CodeMessage.ERROR);
    }
}
