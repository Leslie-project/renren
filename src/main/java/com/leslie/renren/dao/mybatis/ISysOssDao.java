package com.leslie.renren.dao.mybatis;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;
import com.leslie.renren.entity.SysOssEntity;

/**
 * <p>
 * 文件上传
 * </p>
 * 
 * @version 1.0
 * @author Justin Yang
 * @since 2020-04-27
 */
public interface ISysOssDao extends BaseMapper<SysOssEntity>{

	Integer insertBatch(List<SysOssEntity> list);
}
