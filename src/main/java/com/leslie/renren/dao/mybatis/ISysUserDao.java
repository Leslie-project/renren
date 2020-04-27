package com.leslie.renren.dao.mybatis;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;
import com.leslie.renren.entity.SysUserEntity;

/**
 * <p>
 * 系统用户
 * </p>
 * 
 * @version 1.0
 * @author Justin Yang
 * @since 2020-04-27
 */
public interface ISysUserDao extends BaseMapper<SysUserEntity>{

	Integer insertBatch(List<SysUserEntity> list);
}
