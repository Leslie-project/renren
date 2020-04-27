package com.leslie.renren.modules.sys.service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.leslie.renren.cons.common.Response;
import com.leslie.renren.dao.mybatis.ISysUserDao;
import com.leslie.renren.entity.SysUserEntity;
import com.leslie.renren.modules.sys.form.PasswordForm;
import com.leslie.renren.modules.sys.service.SysUserService;
import com.leslie.renren.tools.utils.CodeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    ISysUserDao sysUserDao;

    /**
     * 获取管理员列表
     *
     * @param pageNo
     * @param pageSize
     * @return
     */
    @Override
    public Response<IPage<SysUserEntity>> getList(Integer pageNo, Integer pageSize) {
        QueryWrapper wrapper = new QueryWrapper();
        IPage<SysUserEntity> page = new Page<>(pageNo, pageSize);
        sysUserDao.selectPage(page, wrapper);
        return Response.success(page);
    }

    /**
     * 获取管理员信息
     *
     * @param username
     * @return
     */
    @Override
    public Response getInfo(String username) {
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("username", username);
        return Response.success(sysUserDao.selectOne(wrapper));
    }

    /**
     * 修改密码
     *
     * @param passwordForm
     * @return
     */
    @Override
    public Response changePassword(PasswordForm passwordForm) {
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("username", passwordForm.getUserName());
        SysUserEntity sysUserEntity = sysUserDao.selectOne(wrapper);
        if (sysUserEntity == null) {
            return Response.error(CodeMessage.PARAMETER_ERROR);
        } else {
            sysUserEntity.setPassword(passwordForm.getNewPassword());
        }
        sysUserDao.updateById(sysUserEntity);

        return Response.success();
    }

    /**
     * 添加管理员
     *
     * @param sysUserEntity
     * @return
     */
    @Override
    public Response save(SysUserEntity sysUserEntity) {
        sysUserDao.insert(sysUserEntity);

        return Response.success();
    }

    /**
     * 修改管理员
     *
     * @param sysUserEntity
     * @return
     */
    @Override
    public Response update(SysUserEntity sysUserEntity) {
        sysUserDao.updateById(sysUserEntity);

        return Response.success();
    }

    /**
     * 删除管理员
     *
     * @param sysUserEntity
     * @return
     */
    @Override
    public Response delete(SysUserEntity sysUserEntity) {
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("username", sysUserEntity.getUsername());
        sysUserDao.delete(wrapper);
        return Response.success();
    }
}
