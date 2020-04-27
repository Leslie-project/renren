package com.leslie.renren.dao.mybatis;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;
import com.leslie.renren.entity.TbUserEntity;

/**
 * <p>
 * 用户
 * </p>
 * 
 * @version 1.0
 * @author Justin Yang
 * @since 2020-04-27
 */
public interface ITbUserDao extends BaseMapper<TbUserEntity>{

	Integer insertBatch(List<TbUserEntity> list);
}
