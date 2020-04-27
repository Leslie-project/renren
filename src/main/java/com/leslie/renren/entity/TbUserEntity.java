package com.leslie.renren.entity;

import org.hibernate.annotations.DynamicInsert;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;
import javax.persistence.GenerationType;
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
 * 用户
 * </p>
 * 
 * @version 1.0
 * @author Focus
 * @since 2020-04-27
 */
@Entity
@DynamicInsert
@DynamicUpdate
@Table(name = "tb_user")
@TableName(value =" tb_user", schema = "renren")
public class TbUserEntity implements java.io.Serializable {

	private static final long serialVersionUID = -1L;

	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@TableId(value="user_id",type=IdType.AUTO)
	@Column(name = "user_id", nullable = false, unique = true, length = 20)
	@JsonSerialize(using = ToStringSerializer.class)
	private Long userId;

	/**
	 * 用户名
	 */
	@TableField("username")
	@Column(name = "username", nullable = false, length = 50)
	private String username;

	/**
	 * 手机号
	 */
	@TableField("mobile")
	@Column(name = "mobile", nullable = false, length = 20)
	private String mobile;

	/**
	 * 密码
	 */
	@TableField("password")
	@Column(name = "password", length = 64)
	private String password;

	/**
	 * 创建时间
	 */
	@TableField("create_time")
	@Temporal(TemporalType.TIMESTAMP)
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "Asia/Shanghai")
	@Column(name = "create_time")
	private Date createTime;

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
	 * 用户名
	 */
	public void setUsername(String value) {
		this.username = value;
    }

	/**
	 * 属性的公用get方法<br/>
	 * 用户名
	 */
    public String getUsername() {
		return this.username;
	}

	/**
	 * 属性的公用set方法<br/>
	 * 手机号
	 */
	public void setMobile(String value) {
		this.mobile = value;
    }

	/**
	 * 属性的公用get方法<br/>
	 * 手机号
	 */
    public String getMobile() {
		return this.mobile;
	}

	/**
	 * 属性的公用set方法<br/>
	 * 密码
	 */
	public void setPassword(String value) {
		this.password = value;
    }

	/**
	 * 属性的公用get方法<br/>
	 * 密码
	 */
    public String getPassword() {
		return this.password;
	}

	/**
	 * 属性的公用set方法<br/>
	 * 创建时间
	 */
	public void setCreateTime(Date value) {
		this.createTime = value;
    }

	/**
	 * 属性的公用get方法<br/>
	 * 创建时间
	 */
    public Date getCreateTime() {
		return this.createTime;
	}

	@Override
	public String toString() {
		JSONObject object = new JSONObject();
		object.put("userId", getUserId());
		object.put("username", getUsername());
		object.put("mobile", getMobile());
		object.put("password", getPassword());
		object.put("createTime", getCreateTime());
		return object.toJSONString();
	}

}
