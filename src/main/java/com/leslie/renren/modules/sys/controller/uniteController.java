package com.leslie.renren.modules.sys.controller;


import com.alibaba.fastjson.JSON;
import com.leslie.renren.cons.common.Request;
import com.leslie.renren.cons.common.Response;
import com.leslie.renren.entity.SysRoleEntity;
import com.leslie.renren.entity.SysUserEntity;
import com.leslie.renren.modules.sys.form.PasswordForm;
import com.leslie.renren.modules.sys.service.SysRoleService;
import com.leslie.renren.modules.sys.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class uniteController {

    @Autowired
    private SysUserService sysUserService;

    @Autowired
    private SysRoleService sysRoleService;

    @RequestMapping("/test")
    public Response controller(@RequestBody Request request) {
        String type = request.getType();
        Map<String, String> data = request.getData();

        switch (type) {
            ///分发SysUserController
            case "/sys/user/list":
                return sysUserService.getList(Integer.parseInt(data.get("pageNo")), Integer.parseInt(data.get("pageSize")));
            case "/sys/user/info":
                return sysUserService.getInfo(data.get("username"));
            case "/sys/user/password":
                //System.out.println(JSON.toJSONString(data));
                PasswordForm passwordForm = JSON.parseObject(JSON.toJSONString(data), PasswordForm.class);
                return sysUserService.changePassword(passwordForm);
            case "/sys/user/save":
                SysUserEntity saveEntity = JSON.parseObject(JSON.toJSONString(data), SysUserEntity.class);
                return sysUserService.save(saveEntity);
            case "/sys/user/update":
                SysUserEntity updateEntity = JSON.parseObject(JSON.toJSONString(data), SysUserEntity.class);
                return sysUserService.update(updateEntity);
            case "/sys/user/date":
                SysUserEntity deleteEntity = JSON.parseObject(JSON.toJSONString(data), SysUserEntity.class);
                return sysUserService.delete(deleteEntity);


            ///分发SysRoleController
            case "/sys/role/list":
                return sysRoleService.getList(Integer.parseInt(data.get("pageNo")), Integer.parseInt(data.get("pageSize")));
            case "/sys/role/select":
                return sysRoleService.getListByUser(Integer.parseInt(data.get("pageNo")), Integer.parseInt(data.get("pageSize")),data.get("userId"));
            case "/sys/role/info":
                return sysRoleService.info(data.get("roleId"));
            case "/sys/role/save":
                SysRoleEntity save2Entity = JSON.parseObject(JSON.toJSONString(data), SysRoleEntity.class);
                return sysRoleService.save(save2Entity);
            case "/sys/role/update":
                SysRoleEntity update2Entity = JSON.parseObject(JSON.toJSONString(data), SysRoleEntity.class);
                return sysRoleService.update(update2Entity);
            case "/sys/role/delete":
                SysRoleEntity delete2Entity = JSON.parseObject(JSON.toJSONString(data), SysRoleEntity.class);
                return sysRoleService.delete(delete2Entity);

        }
        return Response.success();
    }
}
