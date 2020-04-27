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
@Table(name = "qrtz_calendars")
@TableName(value =" qrtz_calendars", schema = "renren")
public class QrtzCalendarsEntity implements java.io.Serializable {

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
	@Column(name = "CALENDAR_NAME", nullable = false, unique = true, length = 200)
	private String calendarName;

	/**
	 * 
	 */
	@TableField("CALENDAR")
	@Column(name = "CALENDAR", nullable = false)
	private byte[] calendar;

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
	public void setCalendar(byte[] value) {
		this.calendar = value;
    }

	/**
	 * 属性的公用get方法<br/>
	 * 
	 */
    public byte[] getCalendar() {
		return this.calendar;
	}

	@Override
	public String toString() {
		JSONObject object = new JSONObject();
		object.put("schedName", getSchedName());
		object.put("calendarName", getCalendarName());
		object.put("calendar", getCalendar());
		return object.toJSONString();
	}

}
