package com.leslie.renren.dao.mybatis;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;
import com.leslie.renren.entity.SysCaptchaEntity;

/**
 * <p>
 * 系统验证码
 * </p>
 * 
 * @version 1.0
 * @author Justin Yang
 * @since 2020-04-27
 */
public interface ISysCaptchaDao extends BaseMapper<SysCaptchaEntity>{

	Integer insertBatch(List<SysCaptchaEntity> list);
}
