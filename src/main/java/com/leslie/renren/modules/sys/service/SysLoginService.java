package com.leslie.renren.modules.sys.service;

import com.leslie.renren.cons.common.Response;
import com.leslie.renren.modules.sys.form.SysLoginForm;

/**
 * 登录
 */
public interface SysLoginService {
    /**
     * 用户登录
     * @param sysLoginForm
     * @return
     */
    Response login(SysLoginForm sysLoginForm);

}
