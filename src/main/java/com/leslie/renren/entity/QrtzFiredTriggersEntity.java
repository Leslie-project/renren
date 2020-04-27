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
@Table(name = "qrtz_fired_triggers")
@TableName(value =" qrtz_fired_triggers", schema = "renren")
public class QrtzFiredTriggersEntity implements java.io.Serializable {

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
	@Column(name = "ENTRY_ID", nullable = false, unique = true, length = 95)
	private String entryId;

	/**
	 * 
	 */
	@TableField("TRIGGER_NAME")
	@Column(name = "TRIGGER_NAME", nullable = false, length = 200)
	private String triggerName;

	/**
	 * 
	 */
	@TableField("TRIGGER_GROUP")
	@Column(name = "TRIGGER_GROUP", nullable = false, length = 200)
	private String triggerGroup;

	/**
	 * 
	 */
	@TableField("INSTANCE_NAME")
	@Column(name = "INSTANCE_NAME", nullable = false, length = 200)
	private String instanceName;

	/**
	 * 
	 */
	@TableField("FIRED_TIME")
	@Column(name = "FIRED_TIME", nullable = false, length = 13)
	@JsonSerialize(using = ToStringSerializer.class)
	private Long firedTime;

	/**
	 * 
	 */
	@TableField("SCHED_TIME")
	@Column(name = "SCHED_TIME", nullable = false, length = 13)
	@JsonSerialize(using = ToStringSerializer.class)
	private Long schedTime;

	/**
	 * 
	 */
	@TableField("PRIORITY")
	@Column(name = "PRIORITY", nullable = false, length = 11)
	private Integer priority;

	/**
	 * 
	 */
	@TableField("STATE")
	@Column(name = "STATE", nullable = false, length = 16)
	private String state;

	/**
	 * 
	 */
	@TableField("JOB_NAME")
	@Column(name = "JOB_NAME", length = 200)
	private String jobName;

	/**
	 * 
	 */
	@TableField("JOB_GROUP")
	@Column(name = "JOB_GROUP", length = 200)
	private String jobGroup;

	/**
	 * 
	 */
	@TableField("IS_NONCONCURRENT")
	@Column(name = "IS_NONCONCURRENT", length = 1)
	private String isNonconcurrent;

	/**
	 * 
	 */
	@TableField("REQUESTS_RECOVERY")
	@Column(name = "REQUESTS_RECOVERY", length = 1)
	private String requestsRecovery;

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
	public void setEntryId(String value) {
		this.entryId = value;
    }

	/**
	 * 属性的公用get方法<br/>
	 * 
	 */
    public String getEntryId() {
		return this.entryId;
	}

	/**
	 * 属性的公用set方法<br/>
	 * 
	 */
	public void setTriggerName(String value) {
		this.triggerName = value;
    }

	/**
	 * 属性的公用get方法<br/>
	 * 
	 */
    public String getTriggerName() {
		return this.triggerName;
	}

	/**
	 * 属性的公用set方法<br/>
	 * 
	 */
	public void setTriggerGroup(String value) {
		this.triggerGroup = value;
    }

	/**
	 * 属性的公用get方法<br/>
	 * 
	 */
    public String getTriggerGroup() {
		return this.triggerGroup;
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
	public void setFiredTime(Long value) {
		this.firedTime = value;
    }

	/**
	 * 属性的公用get方法<br/>
	 * 
	 */
    public Long getFiredTime() {
		return this.firedTime;
	}

	/**
	 * 属性的公用set方法<br/>
	 * 
	 */
	public void setSchedTime(Long value) {
		this.schedTime = value;
    }

	/**
	 * 属性的公用get方法<br/>
	 * 
	 */
    public Long getSchedTime() {
		return this.schedTime;
	}

	/**
	 * 属性的公用set方法<br/>
	 * 
	 */
	public void setPriority(Integer value) {
		this.priority = value;
    }

	/**
	 * 属性的公用get方法<br/>
	 * 
	 */
    public Integer getPriority() {
		return this.priority;
	}

	/**
	 * 属性的公用set方法<br/>
	 * 
	 */
	public void setState(String value) {
		this.state = value;
    }

	/**
	 * 属性的公用get方法<br/>
	 * 
	 */
    public String getState() {
		return this.state;
	}

	/**
	 * 属性的公用set方法<br/>
	 * 
	 */
	public void setJobName(String value) {
		this.jobName = value;
    }

	/**
	 * 属性的公用get方法<br/>
	 * 
	 */
    public String getJobName() {
		return this.jobName;
	}

	/**
	 * 属性的公用set方法<br/>
	 * 
	 */
	public void setJobGroup(String value) {
		this.jobGroup = value;
    }

	/**
	 * 属性的公用get方法<br/>
	 * 
	 */
    public String getJobGroup() {
		return this.jobGroup;
	}

	/**
	 * 属性的公用set方法<br/>
	 * 
	 */
	public void setIsNonconcurrent(String value) {
		this.isNonconcurrent = value;
    }

	/**
	 * 属性的公用get方法<br/>
	 * 
	 */
    public String getIsNonconcurrent() {
		return this.isNonconcurrent;
	}

	/**
	 * 属性的公用set方法<br/>
	 * 
	 */
	public void setRequestsRecovery(String value) {
		this.requestsRecovery = value;
    }

	/**
	 * 属性的公用get方法<br/>
	 * 
	 */
    public String getRequestsRecovery() {
		return this.requestsRecovery;
	}

	@Override
	public String toString() {
		JSONObject object = new JSONObject();
		object.put("schedName", getSchedName());
		object.put("entryId", getEntryId());
		object.put("triggerName", getTriggerName());
		object.put("triggerGroup", getTriggerGroup());
		object.put("instanceName", getInstanceName());
		object.put("firedTime", getFiredTime());
		object.put("schedTime", getSchedTime());
		object.put("priority", getPriority());
		object.put("state", getState());
		object.put("jobName", getJobName());
		object.put("jobGroup", getJobGroup());
		object.put("isNonconcurrent", getIsNonconcurrent());
		object.put("requestsRecovery", getRequestsRecovery());
		return object.toJSONString();
	}

}
