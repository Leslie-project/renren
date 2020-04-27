package com.leslie.renren.entity;

import org.hibernate.annotations.DynamicInsert;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;
import javax.persistence.GenerationType;
import org.hibernate.annotations.DynamicUpdate;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import javax.persistence.Table;
import javax.persistence.Entity;
import com.alibaba.fastjson.JSONObject;
import javax.persistence.Id;

/**
 * <p>
 * 系统配置信息表
 * </p>
 * 
 * @version 1.0
 * @author Focus
 * @since 2020-04-27
 */
@Entity
@DynamicInsert
@DynamicUpdate
@Table(name = "sys_config")
@TableName(value =" sys_config", schema = "renren")
public class SysConfigEntity implements java.io.Serializable {

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
	 * key
	 */
	@TableField("param_key")
	@Column(name = "param_key", length = 50)
	private String paramKey;

	/**
	 * value
	 */
	@TableField("param_value")
	@Column(name = "param_value", length = 2000)
	private String paramValue;

	/**
	 * 状态0：隐藏1：显示
	 */
	@TableField("status")
	@Column(name = "status", length = 4)
	private Integer status;

	/**
	 * 备注
	 */
	@TableField("remark")
	@Column(name = "remark", length = 500)
	private String remark;

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
	 * key
	 */
	public void setParamKey(String value) {
		this.paramKey = value;
    }

	/**
	 * 属性的公用get方法<br/>
	 * key
	 */
    public String getParamKey() {
		return this.paramKey;
	}

	/**
	 * 属性的公用set方法<br/>
	 * value
	 */
	public void setParamValue(String value) {
		this.paramValue = value;
    }

	/**
	 * 属性的公用get方法<br/>
	 * value
	 */
    public String getParamValue() {
		return this.paramValue;
	}

	/**
	 * 属性的公用set方法<br/>
	 * 状态0：隐藏1：显示
	 */
	public void setStatus(Integer value) {
		this.status = value;
    }

	/**
	 * 属性的公用get方法<br/>
	 * 状态0：隐藏1：显示
	 */
    public Integer getStatus() {
		return this.status;
	}

	/**
	 * 属性的公用set方法<br/>
	 * 备注
	 */
	public void setRemark(String value) {
		this.remark = value;
    }

	/**
	 * 属性的公用get方法<br/>
	 * 备注
	 */
    public String getRemark() {
		return this.remark;
	}

	@Override
	public String toString() {
		JSONObject object = new JSONObject();
		object.put("id", getId());
		object.put("paramKey", getParamKey());
		object.put("paramValue", getParamValue());
		object.put("status", getStatus());
		object.put("remark", getRemark());
		return object.toJSONString();
	}

}
