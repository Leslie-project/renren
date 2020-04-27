package com.leslie.renren.dao.mybatis;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;
import com.leslie.renren.entity.SysUserTokenEntity;

/**
 * <p>
 * 系统用户Token
 * </p>
 * 
 * @version 1.0
 * @author Justin Yang
 * @since 2020-04-27
 */
public interface ISysUserTokenDao extends BaseMapper<SysUserTokenEntity>{

	Integer insertBatch(List<SysUserTokenEntity> list);
}
