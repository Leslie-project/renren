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
 * 系统日志
 * </p>
 * 
 * @version 1.0
 * @author Focus
 * @since 2020-04-27
 */
@Entity
@DynamicInsert
@DynamicUpdate
@Table(name = "sys_log")
@TableName(value =" sys_log", schema = "renren")
public class SysLogEntity implements java.io.Serializable {

	private static final long serialVersionUID = -1L;

	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@TableId(value="id",type=IdType.AUTO)
	@Column(name = "id", nullable = false, unique = true, length = 20)
	@JsonSerialize(using = ToStringSerializer.class)
	private Long id;

	/**
	 * 用户名
	 */
	@TableField("username")
	@Column(name = "username", length = 50)
	private String username;

	/**
	 * 用户操作
	 */
	@TableField("operation")
	@Column(name = "operation", length = 50)
	private String operation;

	/**
	 * 请求方法
	 */
	@TableField("method")
	@Column(name = "method", length = 200)
	private String method;

	/**
	 * 请求参数
	 */
	@TableField("params")
	@Column(name = "params", length = 5000)
	private String params;

	/**
	 * 执行时长(毫秒)
	 */
	@TableField("time")
	@Column(name = "time", nullable = false, length = 20)
	@JsonSerialize(using = ToStringSerializer.class)
	private Long time;

	/**
	 * IP地址
	 */
	@TableField("ip")
	@Column(name = "ip", length = 64)
	private String ip;

	/**
	 * 创建时间
	 */
	@TableField("create_date")
	@Temporal(TemporalType.TIMESTAMP)
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "Asia/Shanghai")
	@Column(name = "create_date")
	private Date createDate;

	/**
	 * 属性的公用set方法<br/>
	 * 
	 */
	public void setId(Long value) {
		this.id = value;
    }

	/**
	 * 属性的公用get方法<br/>
	 * 
	 */
    public Long getId() {
		return this.id;
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
	 * 用户操作
	 */
	public void setOperation(String value) {
		this.operation = value;
    }

	/**
	 * 属性的公用get方法<br/>
	 * 用户操作
	 */
    public String getOperation() {
		return this.operation;
	}

	/**
	 * 属性的公用set方法<br/>
	 * 请求方法
	 */
	public void setMethod(String value) {
		this.method = value;
    }

	/**
	 * 属性的公用get方法<br/>
	 * 请求方法
	 */
    public String getMethod() {
		return this.method;
	}

	/**
	 * 属性的公用set方法<br/>
	 * 请求参数
	 */
	public void setParams(String value) {
		this.params = value;
    }

	/**
	 * 属性的公用get方法<br/>
	 * 请求参数
	 */
    public String getParams() {
		return this.params;
	}

	/**
	 * 属性的公用set方法<br/>
	 * 执行时长(毫秒)
	 */
	public void setTime(Long value) {
		this.time = value;
    }

	/**
	 * 属性的公用get方法<br/>
	 * 执行时长(毫秒)
	 */
    public Long getTime() {
		return this.time;
	}

	/**
	 * 属性的公用set方法<br/>
	 * IP地址
	 */
	public void setIp(String value) {
		this.ip = value;
    }

	/**
	 * 属性的公用get方法<br/>
	 * IP地址
	 */
    public String getIp() {
		return this.ip;
	}

	/**
	 * 属性的公用set方法<br/>
	 * 创建时间
	 */
	public void setCreateDate(Date value) {
		this.createDate = value;
    }

	/**
	 * 属性的公用get方法<br/>
	 * 创建时间
	 */
    public Date getCreateDate() {
		return this.createDate;
	}

	@Override
	public String toString() {
		JSONObject object = new JSONObject();
		object.put("id", getId());
		object.put("username", getUsername());
		object.put("operation", getOperation());
		object.put("method", getMethod());
		object.put("params", getParams());
		object.put("time", getTime());
		object.put("ip", getIp());
		object.put("createDate", getCreateDate());
		return object.toJSONString();
	}

}
