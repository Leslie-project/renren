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
@Table(name = "qrtz_triggers")
@TableName(value =" qrtz_triggers", schema = "renren")
public class QrtzTriggersEntity implements java.io.Serializable {

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
	@Column(name = "TRIGGER_NAME", nullable = false, unique = true, length = 200)
	private String triggerName;

	/**
	 * 
	 */
	@Id
	@Column(name = "TRIGGER_GROUP", nullable = false, unique = true, length = 200)
	private String triggerGroup;

	/**
	 * 
	 */
	@TableField("JOB_NAME")
	@Column(name = "JOB_NAME", nullable = false, length = 200)
	private String jobName;

	/**
	 * 
	 */
	@TableField("JOB_GROUP")
	@Column(name = "JOB_GROUP", nullable = false, length = 200)
	private String jobGroup;

	/**
	 * 
	 */
	@TableField("DESCRIPTION")
	@Column(name = "DESCRIPTION", length = 250)
	private String description;

	/**
	 * 
	 */
	@TableField("NEXT_FIRE_TIME")
	@Column(name = "NEXT_FIRE_TIME", length = 13)
	@JsonSerialize(using = ToStringSerializer.class)
	private Long nextFireTime;

	/**
	 * 
	 */
	@TableField("PREV_FIRE_TIME")
	@Column(name = "PREV_FIRE_TIME", length = 13)
	@JsonSerialize(using = ToStringSerializer.class)
	private Long prevFireTime;

	/**
	 * 
	 */
	@TableField("PRIORITY")
	@Column(name = "PRIORITY", length = 11)
	private Integer priority;

	/**
	 * 
	 */
	@TableField("TRIGGER_STATE")
	@Column(name = "TRIGGER_STATE", nullable = false, length = 16)
	private String triggerState;

	/**
	 * 
	 */
	@TableField("TRIGGER_TYPE")
	@Column(name = "TRIGGER_TYPE", nullable = false, length = 8)
	private String triggerType;

	/**
	 * 
	 */
	@TableField("START_TIME")
	@Column(name = "START_TIME", nullable = false, length = 13)
	@JsonSerialize(using = ToStringSerializer.class)
	private Long startTime;

	/**
	 * 
	 */
	@TableField("END_TIME")
	@Column(name = "END_TIME", length = 13)
	@JsonSerialize(using = ToStringSerializer.class)
	private Long endTime;

	/**
	 * 
	 */
	@TableField("CALENDAR_NAME")
	@Column(name = "CALENDAR_NAME", length = 200)
	private String calendarName;

	/**
	 * 
	 */
	@TableField("MISFIRE_INSTR")
	@Column(name = "MISFIRE_INSTR", length = 2)
	private Integer misfireInstr;

	/**
	 * 
	 */
	@TableField("JOB_DATA")
	@Column(name = "JOB_DATA")
	private byte[] jobData;

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
	public void setDescription(String value) {
		this.description = value;
    }

	/**
	 * 属性的公用get方法<br/>
	 * 
	 */
    public String getDescription() {
		return this.description;
	}

	/**
	 * 属性的公用set方法<br/>
	 * 
	 */
	public void setNextFireTime(Long value) {
		this.nextFireTime = value;
    }

	/**
	 * 属性的公用get方法<br/>
	 * 
	 */
    public Long getNextFireTime() {
		return this.nextFireTime;
	}

	/**
	 * 属性的公用set方法<br/>
	 * 
	 */
	public void setPrevFireTime(Long value) {
		this.prevFireTime = value;
    }

	/**
	 * 属性的公用get方法<br/>
	 * 
	 */
    public Long getPrevFireTime() {
		return this.prevFireTime;
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
	public void setTriggerState(String value) {
		this.triggerState = value;
    }

	/**
	 * 属性的公用get方法<br/>
	 * 
	 */
    public String getTriggerState() {
		return this.triggerState;
	}

	/**
	 * 属性的公用set方法<br/>
	 * 
	 */
	public void setTriggerType(String value) {
		this.triggerType = value;
    }

	/**
	 * 属性的公用get方法<br/>
	 * 
	 */
    public String getTriggerType() {
		return this.triggerType;
	}

	/**
	 * 属性的公用set方法<br/>
	 * 
	 */
	public void setStartTime(Long value) {
		this.startTime = value;
    }

	/**
	 * 属性的公用get方法<br/>
	 * 
	 */
    public Long getStartTime() {
		return this.startTime;
	}

	/**
	 * 属性的公用set方法<br/>
	 * 
	 */
	public void setEndTime(Long value) {
		this.endTime = value;
    }

	/**
	 * 属性的公用get方法<br/>
	 * 
	 */
    public Long getEndTime() {
		return this.endTime;
	}

	/**
	 * 属性的公用set方法<br/>
	 * 
	 */
	public void setCalendarName(String value) {
		this.calendarName = value;
    }

	/**
	 * 属性的公用get方法<br/>
	 * 
	 */
    public String getCalendarName() {
		return this.calendarName;
	}

	/**
	 * 属性的公用set方法<br/>
	 * 
	 */
	public void setMisfireInstr(Integer value) {
		this.misfireInstr = value;
    }

	/**
	 * 属性的公用get方法<br/>
	 * 
	 */
    public Integer getMisfireInstr() {
		return this.misfireInstr;
	}

	/**
	 * 属性的公用set方法<br/>
	 * 
	 */
	public void setJobData(byte[] value) {
		this.jobData = value;
    }

	/**
	 * 属性的公用get方法<br/>
	 * 
	 */
    public byte[] getJobData() {
		return this.jobData;
	}

	@Override
	public String toString() {
		JSONObject object = new JSONObject();
		object.put("schedName", getSchedName());
		object.put("triggerName", getTriggerName());
		object.put("triggerGroup", getTriggerGroup());
		object.put("jobName", getJobName());
		object.put("jobGroup", getJobGroup());
		object.put("description", getDescription());
		object.put("nextFireTime", getNextFireTime());
		object.put("prevFireTime", getPrevFireTime());
		object.put("priority", getPriority());
		object.put("triggerState", getTriggerState());
		object.put("triggerType", getTriggerType());
		object.put("startTime", getStartTime());
		object.put("endTime", getEndTime());
		object.put("calendarName", getCalendarName());
		object.put("misfireInstr", getMisfireInstr());
		object.put("jobData", getJobData());
		return object.toJSONString();
	}

}
