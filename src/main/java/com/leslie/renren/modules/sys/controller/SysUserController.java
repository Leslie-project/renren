package com.leslie.renren.modules.sys.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.leslie.renren.cons.common.Response;
import com.leslie.renren.entity.SysUserEntity;
import com.leslie.renren.modules.sys.form.PasswordForm;
import com.leslie.renren.modules.sys.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sys/user")
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;

    /**
     * 管理员列表
     *
     * @param pageNo
     * @param pageSize
     * @return
     */
    @GetMapping("/list")
    public Response<IPage<SysUserEntity>> list(@RequestParam Integer pageNo, @RequestParam Integer pageSize) {
        return sysUserService.getList(pageNo, pageSize);
    }

    /**
     * 获取管理员信息
     *
     * @param username
     * @return
     */
    @GetMapping("/info")
    public Response getInfo(@RequestParam String username) {
        return sysUserService.getInfo(username);
    }

    /**
     * 修改密码
     *
     * @param passwordForm
     * @return
     */
    @PostMapping("/password")
    public Response password(@RequestBody PasswordForm passwordForm) {
        return sysUserService.changePassword(passwordForm);
    }

    /**
     * 添加管理员
     * @param sysUserEntity
     * @return
     */
    @PostMapping("/save")
    public Response save (@RequestBody SysUserEntity sysUserEntity){
        return sysUserService.save(sysUserEntity);
    }

    /**
     * 修改管理员
     * @param sysUserEntity
     * @return
     */
    @PostMapping("/update")
    public Response update (@RequestBody SysUserEntity sysUserEntity){
        return sysUserService.update(sysUserEntity);
    }

    /**
     * 删除管理员
     * @param sysUserEntity
     * @return
     */
    @PostMapping("/delete")
    public Response delete (@RequestBody SysUserEntity sysUserEntity){
        return sysUserService.delete(sysUserEntity);
    }
}
