package com.leslie.renren.dao.mybatis;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;
import com.leslie.renren.entity.SysUserRoleEntity;

/**
 * <p>
 * 用户与角色对应关系
 * </p>
 * 
 * @version 1.0
 * @author Justin Yang
 * @since 2020-04-27
 */
public interface ISysUserRoleDao extends BaseMapper<SysUserRoleEntity>{

	Integer insertBatch(List<SysUserRoleEntity> list);
}
