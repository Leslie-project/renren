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
@Table(name = "qrtz_simple_triggers")
@TableName(value =" qrtz_simple_triggers", schema = "renren")
public class QrtzSimpleTriggersEntity implements java.io.Serializable {

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
	@TableField("REPEAT_COUNT")
	@Column(name = "REPEAT_COUNT", nullable = false, length = 7)
	@JsonSerialize(using = ToStringSerializer.class)
	private Long repeatCount;

	/**
	 * 
	 */
	@TableField("REPEAT_INTERVAL")
	@Column(name = "REPEAT_INTERVAL", nullable = false, length = 12)
	@JsonSerialize(using = ToStringSerializer.class)
	private Long repeatInterval;

	/**
	 * 
	 */
	@TableField("TIMES_TRIGGERED")
	@Column(name = "TIMES_TRIGGERED", nullable = false, length = 10)
	@JsonSerialize(using = ToStringSerializer.class)
	private Long timesTriggered;

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
	public void setRepeatCount(Long value) {
		this.repeatCount = value;
    }

	/**
	 * 属性的公用get方法<br/>
	 * 
	 */
    public Long getRepeatCount() {
		return this.repeatCount;
	}

	/**
	 * 属性的公用set方法<br/>
	 * 
	 */
	public void setRepeatInterval(Long value) {
		this.repeatInterval = value;
    }

	/**
	 * 属性的公用get方法<br/>
	 * 
	 */
    public Long getRepeatInterval() {
		return this.repeatInterval;
	}

	/**
	 * 属性的公用set方法<br/>
	 * 
	 */
	public void setTimesTriggered(Long value) {
		this.timesTriggered = value;
    }

	/**
	 * 属性的公用get方法<br/>
	 * 
	 */
    public Long getTimesTriggered() {
		return this.timesTriggered;
	}

	@Override
	public String toString() {
		JSONObject object = new JSONObject();
		object.put("schedName", getSchedName());
		object.put("triggerName", getTriggerName());
		object.put("triggerGroup", getTriggerGroup());
		object.put("repeatCount", getRepeatCount());
		object.put("repeatInterval", getRepeatInterval());
		object.put("timesTriggered", getTimesTriggered());
		return object.toJSONString();
	}

}
