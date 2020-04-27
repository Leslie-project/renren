package com.leslie.renren.dao.mybatis;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;
import com.leslie.renren.entity.SysRoleMenuEntity;

/**
 * <p>
 * 角色与菜单对应关系
 * </p>
 * 
 * @version 1.0
 * @author Justin Yang
 * @since 2020-04-27
 */
public interface ISysRoleMenuDao extends BaseMapper<SysRoleMenuEntity>{

	Integer insertBatch(List<SysRoleMenuEntity> list);
}
