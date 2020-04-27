package com.leslie.renren.dao.mybatis;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;
import com.leslie.renren.entity.QrtzBlobTriggersEntity;

/**
 * <p>
 * 
 * </p>
 * 
 * @version 1.0
 * @author Justin Yang
 * @since 2020-04-27
 */
public interface IQrtzBlobTriggersDao extends BaseMapper<QrtzBlobTriggersEntity>{

	Integer insertBatch(List<QrtzBlobTriggersEntity> list);
}
