package com.leslie.renren.dao.mybatis;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;
import com.leslie.renren.entity.SysConfigEntity;

/**
 * <p>
 * 系统配置信息表
 * </p>
 * 
 * @version 1.0
 * @author Justin Yang
 * @since 2020-04-27
 */
public interface ISysConfigDao extends BaseMapper<SysConfigEntity>{

	Integer insertBatch(List<SysConfigEntity> list);
}
