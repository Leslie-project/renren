package com.leslie.renren.modules.sys.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.leslie.renren.cons.common.Response;
import com.leslie.renren.entity.SysRoleEntity;
import com.leslie.renren.modules.sys.service.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 角色管理
 */
@RestController
@RequestMapping("/sys/role")
public class SysRoleController {

    @Autowired
    private SysRoleService sysRoleService;


    /**
     * 角色列表
     * @param pageNo
     * @param pageSize
     * @return
     */
    @GetMapping("/list")
    public Response<IPage<SysRoleEntity>> getList (Integer pageNo ,Integer pageSize){
        return sysRoleService.getList(pageNo,pageSize);
    }


    /**
     * 当前用户角色列表
     * @param pageNo
     * @param pageSize
     * @param userId
     * @return
     */
    @GetMapping("/select")
    public Response<IPage<SysRoleEntity>> getListByUser (Integer pageNo,Integer pageSize,String userId){
        return sysRoleService.getListByUser(pageNo,pageSize,userId);
    }

    /**
     * 获取角色信息
     * @param roleId
     * @return
     */
    @GetMapping("/info")
    public Response info (String roleId){
        return sysRoleService.info(roleId);
    }

    /**
     * 添加角色信息
     * @param sysRoleEntity
     * @return
     */
    @PostMapping("/save")
    public Response save (SysRoleEntity sysRoleEntity){
        return sysRoleService.save(sysRoleEntity);
    }

    /**
     * 修改角色
     * @param sysRoleEntity
     * @return
     */
    @PostMapping("/update")
    public Response update (SysRoleEntity sysRoleEntity){
        return sysRoleService.update(sysRoleEntity);
    }

    /**
     * 删除角色
     * @param sysRoleEntity
     * @return
     */
    @PostMapping("/delete")
    public Response delete (SysRoleEntity sysRoleEntity){
        return sysRoleService.delete(sysRoleEntity);
    }

}
