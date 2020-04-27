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
 * 定时任务日志
 * </p>
 * 
 * @version 1.0
 * @author Focus
 * @since 2020-04-27
 */
@Entity
@DynamicInsert
@DynamicUpdate
@Table(name = "schedule_job_log")
@TableName(value =" schedule_job_log", schema = "renren")
public class ScheduleJobLogEntity implements java.io.Serializable {

	private static final long serialVersionUID = -1L;

	/**
	 * 任务日志id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@TableId(value="log_id",type=IdType.AUTO)
	@Column(name = "log_id", nullable = false, unique = true, length = 20)
	@JsonSerialize(using = ToStringSerializer.class)
	private Long logId;

	/**
	 * 任务id
	 */
	@TableField("job_id")
	@Column(name = "job_id", nullable = false, length = 20)
	@JsonSerialize(using = ToStringSerializer.class)
	private Long jobId;

	/**
	 * springbean名称
	 */
	@TableField("bean_name")
	@Column(name = "bean_name", length = 200)
	private String beanName;

	/**
	 * 参数
	 */
	@TableField("params")
	@Column(name = "params", length = 2000)
	private String params;

	/**
	 * 任务状态0：成功1：失败
	 */
	@TableField("status")
	@Column(name = "status", nullable = false, length = 4)
	private Integer status;

	/**
	 * 失败信息
	 */
	@TableField("error")
	@Column(name = "error", length = 2000)
	private String error;

	/**
	 * 耗时(单位：毫秒)
	 */
	@TableField("times")
	@Column(name = "times", nullable = false, length = 11)
	private Integer times;

	/**
	 * 创建时间
	 */
	@TableField("create_time")
	@Temporal(TemporalType.TIMESTAMP)
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "Asia/Shanghai")
	@Column(name = "create_time")
	private Date createTime;

	/**
	 * 属性的公用set方法<br/>
	 * 任务日志id
	 */
	public void setLogId(Long value) {
		this.logId = value;
    }

	/**
	 * 属性的公用get方法<br/>
	 * 任务日志id
	 */
    public Long getLogId() {
		return this.logId;
	}

	/**
	 * 属性的公用set方法<br/>
	 * 任务id
	 */
	public void setJobId(Long value) {
		this.jobId = value;
    }

	/**
	 * 属性的公用get方法<br/>
	 * 任务id
	 */
    public Long getJobId() {
		return this.jobId;
	}

	/**
	 * 属性的公用set方法<br/>
	 * springbean名称
	 */
	public void setBeanName(String value) {
		this.beanName = value;
    }

	/**
	 * 属性的公用get方法<br/>
	 * springbean名称
	 */
    public String getBeanName() {
		return this.beanName;
	}

	/**
	 * 属性的公用set方法<br/>
	 * 参数
	 */
	public void setParams(String value) {
		this.params = value;
    }

	/**
	 * 属性的公用get方法<br/>
	 * 参数
	 */
    public String getParams() {
		return this.params;
	}

	/**
	 * 属性的公用set方法<br/>
	 * 任务状态0：成功1：失败
	 */
	public void setStatus(Integer value) {
		this.status = value;
    }

	/**
	 * 属性的公用get方法<br/>
	 * 任务状态0：成功1：失败
	 */
    public Integer getStatus() {
		return this.status;
	}

	/**
	 * 属性的公用set方法<br/>
	 * 失败信息
	 */
	public void setError(String value) {
		this.error = value;
    }

	/**
	 * 属性的公用get方法<br/>
	 * 失败信息
	 */
    public String getError() {
		return this.error;
	}

	/**
	 * 属性的公用set方法<br/>
	 * 耗时(单位：毫秒)
	 */
	public void setTimes(Integer value) {
		this.times = value;
    }

	/**
	 * 属性的公用get方法<br/>
	 * 耗时(单位：毫秒)
	 */
    public Integer getTimes() {
		return this.times;
	}

	/**
	 * 属性的公用set方法<br/>
	 * 创建时间
	 */
	public void setCreateTime(Date value) {
		this.createTime = value;
    }

	/**
	 * 属性的公用get方法<br/>
	 * 创建时间
	 */
    public Date getCreateTime() {
		return this.createTime;
	}

	@Override
	public String toString() {
		JSONObject object = new JSONObject();
		object.put("logId", getLogId());
		object.put("jobId", getJobId());
		object.put("beanName", getBeanName());
		object.put("params", getParams());
		object.put("status", getStatus());
		object.put("error", getError());
		object.put("times", getTimes());
		object.put("createTime", getCreateTime());
		return object.toJSONString();
	}

}
