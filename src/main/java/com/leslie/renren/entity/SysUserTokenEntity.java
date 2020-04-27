package com.leslie.renren.entity;

import org.hibernate.annotations.DynamicInsert;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.Column;
import java.util.Date;
import org.hibernate.annotations.DynamicUpdate;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Entity;
import com.alibaba.fastjson.JSONObject;
import javax.persistence.Id;

/**
 * <p>
 * 系统用户Token
 * </p>
 * 
 * @version 1.0
 * @author Focus
 * @since 2020-04-27
 */
@Entity
@DynamicInsert
@DynamicUpdate
@Table(name = "sys_user_token")
@TableName(value =" sys_user_token", schema = "renren")
public class SysUserTokenEntity implements java.io.Serializable {

	private static final long serialVersionUID = -1L;

	/**
	 * 
	 */
	@Id
	@Column(name = "user_id", nullable = false, unique = true, length = 20)
	@JsonSerialize(using = ToStringSerializer.class)
	private Long userId;

	/**
	 * token
	 */
	@TableField("token")
	@Column(name = "token", nullable = false, length = 100)
	private String token;

	/**
	 * 过期时间
	 */
	@TableField("expire_time")
	@Temporal(TemporalType.TIMESTAMP)
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "Asia/Shanghai")
	@Column(name = "expire_time")
	private Date expireTime;

	/**
	 * 更新时间
	 */
	@TableField("update_time")
	@Temporal(TemporalType.TIMESTAMP)
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "Asia/Shanghai")
	@Column(name = "update_time")
	private Date updateTime;

	/**
	 * 属性的公用set方法<br/>
	 * 
	 */
	public void setUserId(Long value) {
		this.userId = value;
    }

	/**
	 * 属性的公用get方法<br/>
	 * 
	 */
    public Long getUserId() {
		return this.userId;
	}

	/**
	 * 属性的公用set方法<br/>
	 * token
	 */
	public void setToken(String value) {
		this.token = value;
    }

	/**
	 * 属性的公用get方法<br/>
	 * token
	 */
    public String getToken() {
		return this.token;
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

	/**
	 * 属性的公用set方法<br/>
	 * 更新时间
	 */
	public void setUpdateTime(Date value) {
		this.updateTime = value;
    }

	/**
	 * 属性的公用get方法<br/>
	 * 更新时间
	 */
    public Date getUpdateTime() {
		return this.updateTime;
	}

	@Override
	public String toString() {
		JSONObject object = new JSONObject();
		object.put("userId", getUserId());
		object.put("token", getToken());
		object.put("expireTime", getExpireTime());
		object.put("updateTime", getUpdateTime());
		return object.toJSONString();
	}

}
