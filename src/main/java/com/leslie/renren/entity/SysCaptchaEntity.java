package com.leslie.renren.entity;

import org.hibernate.annotations.DynamicInsert;
import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.Column;
import java.util.Date;
import org.hibernate.annotations.DynamicUpdate;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Entity;
import com.alibaba.fastjson.JSONObject;
import javax.persistence.Id;

/**
 * <p>
 * 系统验证码
 * </p>
 * 
 * @version 1.0
 * @author Focus
 * @since 2020-04-27
 */
@Entity
@DynamicInsert
@DynamicUpdate
@Table(name = "sys_captcha")
@TableName(value =" sys_captcha", schema = "renren")
public class SysCaptchaEntity implements java.io.Serializable {

	private static final long serialVersionUID = -1L;

	/**
	 * uuid
	 */
	@Id
	@Column(name = "uuid", nullable = false, unique = true, length = 36)
	private String uuid;

	/**
	 * 验证码
	 */
	@TableField("code")
	@Column(name = "code", nullable = false, length = 6)
	private String code;

	/**
	 * 过期时间
	 */
	@TableField("expire_time")
	@Temporal(TemporalType.TIMESTAMP)
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "Asia/Shanghai")
	@Column(name = "expire_time")
	private Date expireTime;

	/**
	 * 属性的公用set方法<br/>
	 * uuid
	 */
	public void setUuid(String value) {
		this.uuid = value;
    }

	/**
	 * 属性的公用get方法<br/>
	 * uuid
	 */
    public String getUuid() {
		return this.uuid;
	}

	/**
	 * 属性的公用set方法<br/>
	 * 验证码
	 */
	public void setCode(String value) {
		this.code = value;
    }

	/**
	 * 属性的公用get方法<br/>
	 * 验证码
	 */
    public String getCode() {
		return this.code;
	}

	/**
	 * 属性的公用set方法<br/>
	 * 过期时间
	 */
	public void setExpireTime(Date value) {
		this.expireTime = value;
    }

	/**
	 * 属性的公用get方法<br/>
	 * 过期时间
	 */
    public Date getExpireTime() {
		return this.expireTime;
	}

	@Override
	public String toString() {
		JSONObject object = new JSONObject();
		object.put("uuid", getUuid());
		object.put("code", getCode());
		object.put("expireTime", getExpireTime());
		return object.toJSONString();
	}

}
