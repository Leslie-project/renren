package com.leslie.renren.dao.mybatis;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;
import com.leslie.renren.entity.ScheduleJobEntity;

/**
 * <p>
 * 定时任务
 * </p>
 * 
 * @version 1.0
 * @author Justin Yang
 * @since 2020-04-27
 */
public interface IScheduleJobDao extends BaseMapper<ScheduleJobEntity>{

	Integer insertBatch(List<ScheduleJobEntity> list);
}
