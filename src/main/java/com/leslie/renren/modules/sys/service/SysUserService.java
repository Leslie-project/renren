package com.leslie.renren.modules.sys.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.leslie.renren.cons.common.Response;
import com.leslie.renren.entity.SysUserEntity;
import com.leslie.renren.modules.sys.form.PasswordForm;

/**
 * 管理员管理
 */
public interface SysUserService {

    /**
     * 获取管理员列表
     *
     * @param pageNo
     * @param pageSize
     * @return
     */
    Response<IPage<SysUserEntity>> getList(Integer pageNo, Integer pageSize);

    /**
     * 获取管理员信息
     *
     * @param username
     * @return
     */
    Response getInfo(String username);

    /**
     * 修改密码
     *
     * @param passwordForm
     * @return
     */
    Response changePassword(PasswordForm passwordForm);

    /**
     * 添加管理员
     *
     * @param sysUserEntity
     * @return
     */
    Response save(SysUserEntity sysUserEntity);

    /**
     * 修改管理员
     *
     * @param sysUserEntity
     * @return
     */
    Response update(SysUserEntity sysUserEntity);

    /**
     * 删除管理员
     * @param sysUserEntity
     * @return
     */
    Response delete (SysUserEntity sysUserEntity);
}
