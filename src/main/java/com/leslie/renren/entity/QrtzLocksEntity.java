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
@Table(name = "qrtz_locks")
@TableName(value =" qrtz_locks", schema = "renren")
public class QrtzLocksEntity implements java.io.Serializable {

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
	@Column(name = "LOCK_NAME", nullable = false, unique = true, length = 40)
	private String lockName;

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
	public void setLockName(String value) {
		this.lockName = value;
    }

	/**
	 * 属性的公用get方法<br/>
	 * 
	 */
    public String getLockName() {
		return this.lockName;
	}

	@Override
	public String toString() {
		JSONObject object = new JSONObject();
		object.put("schedName", getSchedName());
		object.put("lockName", getLockName());
		return object.toJSONString();
	}

}
