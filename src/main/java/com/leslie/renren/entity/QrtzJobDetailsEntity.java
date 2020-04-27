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
@Table(name = "qrtz_job_details")
@TableName(value =" qrtz_job_details", schema = "renren")
public class QrtzJobDetailsEntity implements java.io.Serializable {

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
	@Column(name = "JOB_NAME", nullable = false, unique = true, length = 200)
	private String jobName;

	/**
	 * 
	 */
	@Id
	@Column(name = "JOB_GROUP", nullable = false, unique = true, length = 200)
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
	@TableField("JOB_CLASS_NAME")
	@Column(name = "JOB_CLASS_NAME", nullable = false, length = 250)
	private String jobClassName;

	/**
	 * 
	 */
	@TableField("IS_DURABLE")
	@Column(name = "IS_DURABLE", nullable = false, length = 1)
	private String isDurable;

	/**
	 * 
	 */
	@TableField("IS_NONCONCURRENT")
	@Column(name = "IS_NONCONCURRENT", nullable = false, length = 1)
	private String isNonconcurrent;

	/**
	 * 
	 */
	@TableField("IS_UPDATE_DATA")
	@Column(name = "IS_UPDATE_DATA", nullable = false, length = 1)
	private String isUpdateData;

	/**
	 * 
	 */
	@TableField("REQUESTS_RECOVERY")
	@Column(name = "REQUESTS_RECOVERY", nullable = false, length = 1)
	private String requestsRecovery;

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
	public void setJobClassName(String value) {
		this.jobClassName = value;
    }

	/**
	 * 属性的公用get方法<br/>
	 * 
	 */
    public String getJobClassName() {
		return this.jobClassName;
	}

	/**
	 * 属性的公用set方法<br/>
	 * 
	 */
	public void setIsDurable(String value) {
		this.isDurable = value;
    }

	/**
	 * 属性的公用get方法<br/>
	 * 
	 */
    public String getIsDurable() {
		return this.isDurable;
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
	public void setIsUpdateData(String value) {
		this.isUpdateData = value;
    }

	/**
	 * 属性的公用get方法<br/>
	 * 
	 */
    public String getIsUpdateData() {
		return this.isUpdateData;
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
		object.put("jobName", getJobName());
		object.put("jobGroup", getJobGroup());
		object.put("description", getDescription());
		object.put("jobClassName", getJobClassName());
		object.put("isDurable", getIsDurable());
		object.put("isNonconcurrent", getIsNonconcurrent());
		object.put("isUpdateData", getIsUpdateData());
		object.put("requestsRecovery", getRequestsRecovery());
		object.put("jobData", getJobData());
		return object.toJSONString();
	}

}
