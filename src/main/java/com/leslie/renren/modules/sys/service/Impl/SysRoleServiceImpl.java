package com.leslie.renren.modules.sys.service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.leslie.renren.cons.common.Response;
import com.leslie.renren.dao.mybatis.ISysRoleDao;
import com.leslie.renren.dao.mybatis.ISysRoleMenuDao;
import com.leslie.renren.entity.SysRoleEntity;
import com.leslie.renren.modules.sys.service.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 角色接口实现类
 */
@Service
public class SysRoleServiceImpl implements SysRoleService {

    @Autowired
    private ISysRoleDao sysRoleDao;

    @Autowired
    private ISysRoleMenuDao sysRoleMenuDao;

    /**
     * 角色列表
     *
     * @param pageNo
     * @param pageSize
     * @return
     */
    @Override
    public Response<IPage<SysRoleEntity>> getList(Integer pageNo, Integer pageSize) {
        QueryWrapper wrapper = new QueryWrapper();
        IPage<SysRoleEntity> page = new Page<>(pageNo,pageSize);
        sysRoleDao.selectPage(page,wrapper);
        return Response.success(page);

    }

    /**
     * 当前用户角色列表
     *
     * @param pageNo
     * @param pageSize
     * @param userId
     * @return
     */
    @Override
    public Response<IPage<SysRoleEntity>> getListByUser(Integer pageNo, Integer pageSize, String userId) {
        QueryWrapper wrapper = new QueryWrapper();
        IPage<SysRoleEntity> page = new Page<>(pageNo,pageSize);
        wrapper.eq("create_user_id",userId);
        sysRoleDao.selectPage(page,wrapper);
        return Response.success(page);
    }

    /**
     * 获取角色信息
     *
     * @param roleId
     * @return
     */
    @Override
    public Response info(String roleId) {
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("role_id",roleId);
        SysRoleEntity sysRoleEntity = sysRoleDao.selectById(roleId);
        List<Long> menuIdList = sysRoleMenuDao.selectList(wrapper);
 //       sysRoleEntity.setMenuIdList(menuIdList);
        return Response.success(sysRoleEntity);
    }

    /**
     * 添加角色信息
     *
     * @param sysRoleEntity
     * @return
     */
    @Override
    public Response save(SysRoleEntity sysRoleEntity) {
        sysRoleDao.insert(sysRoleEntity);
        return Response.success();
    }

    /**
     * 修改角色
     *
     * @param sysRoleEntity
     * @return
     */
    @Override
    public Response update(SysRoleEntity sysRoleEntity) {
        sysRoleDao.updateById(sysRoleEntity);
        return Response.success();
    }

    /**
     * 删除角色
     *
     * @param sysRoleEntity
     * @return
     */
    @Override
    public Response delete(SysRoleEntity sysRoleEntity) {
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("role_id",sysRoleEntity.getRoleId());
        sysRoleDao.delete(wrapper);
        return Response.success();
    }
}
