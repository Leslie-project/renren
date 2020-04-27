package com.leslie.renren.dao.mybatis;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;
import com.leslie.renren.entity.SysMenuEntity;

/**
 * <p>
 * 菜单管理
 * </p>
 * 
 * @version 1.0
 * @author Justin Yang
 * @since 2020-04-27
 */
public interface ISysMenuDao extends BaseMapper<SysMenuEntity>{

	Integer insertBatch(List<SysMenuEntity> list);
}
