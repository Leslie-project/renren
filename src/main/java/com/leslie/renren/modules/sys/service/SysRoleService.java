package com.leslie.renren.modules.sys.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.leslie.renren.cons.common.Response;
import com.leslie.renren.entity.SysRoleEntity;

/**
 * 角色接口类
 */
public interface SysRoleService {

    /**
     * 角色列表
     * @param pageNo
     * @param pageSize
     * @return
     */
    Response<IPage<SysRoleEntity>> getList (Integer pageNo ,Integer pageSize);


    /**
     * 当前用户角色列表
     * @param pageNo
     * @param pageSize
     * @param userId
     * @return
     */
    Response<IPage<SysRoleEntity>> getListByUser (Integer pageNo,Integer pageSize,String userId);

    /**
     * 获取角色信息
     * @param roleId
     * @return
     */
    Response info (String roleId);

    /**
     * 添加角色信息
     * @param sysRoleEntity
     * @return
     */
    Response save (SysRoleEntity sysRoleEntity);

    /**
     * 修改角色
     * @param sysRoleEntity
     * @return
     */
    Response update (SysRoleEntity sysRoleEntity);

    /**
     * 删除角色
     * @param sysRoleEntity
     * @return
     */
    Response delete (SysRoleEntity sysRoleEntity);
}
