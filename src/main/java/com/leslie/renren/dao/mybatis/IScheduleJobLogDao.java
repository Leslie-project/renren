package com.leslie.renren.dao.mybatis;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;
import com.leslie.renren.entity.ScheduleJobLogEntity;

/**
 * <p>
 * 定时任务日志
 * </p>
 * 
 * @version 1.0
 * @author Justin Yang
 * @since 2020-04-27
 */
public interface IScheduleJobLogDao extends BaseMapper<ScheduleJobLogEntity>{

	Integer insertBatch(List<ScheduleJobLogEntity> list);
}
