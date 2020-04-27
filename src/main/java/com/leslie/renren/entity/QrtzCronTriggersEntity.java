package com.leslie.renren.entity;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
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
@Table(name = "qrtz_cron_triggers")
@TableName(value =" qrtz_cron_triggers", schema = "renren")
public class QrtzCronTriggersEntity implements java.io.Serializable {

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
	@TableField("CRON_EXPRESSION")
	@Column(name = "CRON_EXPRESSION", nullable = false, length = 120)
	private String cronExpression;

	/**
	 * 
	 */
	@TableField("TIME_ZONE_ID")
	@Column(name = "TIME_ZONE_ID", length = 80)
	private String timeZoneId;

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
	public void setCronExpression(String value) {
		this.cronExpression = value;
    }

	/**
	 * 属性的公用get方法<br/>
	 * 
	 */
    public String getCronExpression() {
		return this.cronExpression;
	}

	/**
	 * 属性的公用set方法<br/>
	 * 
	 */
	public void setTimeZoneId(String value) {
		this.timeZoneId = value;
    }

	/**
	 * 属性的公用get方法<br/>
	 * 
	 */
    public String getTimeZoneId() {
		return this.timeZoneId;
	}

	@Override
	public String toString() {
		JSONObject object = new JSONObject();
		object.put("schedName", getSchedName());
		object.put("triggerName", getTriggerName());
		object.put("triggerGroup", getTriggerGroup());
		object.put("cronExpression", getCronExpression());
		object.put("timeZoneId", getTimeZoneId());
		return object.toJSONString();
	}

}
