package com.leslie.renren.dao.mybatis;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;
import com.leslie.renren.entity.SysLogEntity;

/**
 * <p>
 * 系统日志
 * </p>
 * 
 * @version 1.0
 * @author Justin Yang
 * @since 2020-04-27
 */
public interface ISysLogDao extends BaseMapper<SysLogEntity>{

	Integer insertBatch(List<SysLogEntity> list);
}
