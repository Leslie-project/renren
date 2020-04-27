package com.leslie.renren.entity;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.baomidou.mybatisplus.annotation.*;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.Column;
import javax.persistence.Entity;
import com.alibaba.fastjson.JSONObject;
import javax.persistence.Id;

/**
 * <p>
 * 
 * </p>
 * 
 * @version 1.0
 * @author Focus
 * @since 2020-04-27
 */
@Entity
@DynamicInsert
@DynamicUpdate
@Table(name = "qrtz_scheduler_state")
@TableName(value =" qrtz_scheduler_state", schema = "renren")
public class QrtzSchedulerStateEntity implements java.io.Serializable {

	private static final long serialVersionUID = -1L;

	/**
	 * 
	 */
	@Id
	@Column(name = "SCHED_NAME", nullable = false, unique = true, length = 120)
	private String schedName;

	/**
	 * 
	 */
	@Id
	@Column(name = "INSTANCE_NAME", nullable = false, unique = true, length = 200)
	private String instanceName;

	/**
	 * 
	 */
	@TableField("LAST_CHECKIN_TIME")
	@Column(name = "LAST_CHECKIN_TIME", nullable = false, length = 13)
	@JsonSerialize(using = ToStringSerializer.class)
	private Long lastCheckinTime;

	/**
	 * 
	 */
	@TableField("CHECKIN_INTERVAL")
	@Column(name = "CHECKIN_INTERVAL", nullable = false, length = 13)
	@JsonSerialize(using = ToStringSerializer.class)
	private Long checkinInterval;

	/**
	 * 属性的公用set方法<br/>
	 * 
	 */
	public void setSchedName(String value) {
		this.schedName = value;
    }

	/**
	 * 属性的公用get方法<br/>
	 * 
	 */
    public String getSchedName() {
		return this.schedName;
	}

	/**
	 * 属性的公用set方法<br/>
	 * 
	 */
	public void setInstanceName(String value) {
		this.instanceName = value;
    }

	/**
	 * 属性的公用get方法<br/>
	 * 
	 */
    public String getInstanceName() {
		return this.instanceName;
	}

	/**
	 * 属性的公用set方法<br/>
	 * 
	 */
	public void setLastCheckinTime(Long value) {
		this.lastCheckinTime = value;
    }

	/**
	 * 属性的公用get方法<br/>
	 * 
	 */
    public Long getLastCheckinTime() {
		return this.lastCheckinTime;
	}

	/**
	 * 属性的公用set方法<br/>
	 * 
	 */
	public void setCheckinInterval(Long value) {
		this.checkinInterval = value;
    }

	/**
	 * 属性的公用get方法<br/>
	 * 
	 */
    public Long getCheckinInterval() {
		return this.checkinInterval;
	}

	@Override
	public String toString() {
		JSONObject object = new JSONObject();
		object.put("schedName", getSchedName());
		object.put("instanceName", getInstanceName());
		object.put("lastCheckinTime", getLastCheckinTime());
		object.put("checkinInterval", getCheckinInterval());
		return object.toJSONString();
	}

}
