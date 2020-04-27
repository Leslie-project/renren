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
 * 定时任务
 * </p>
 * 
 * @version 1.0
 * @author Focus
 * @since 2020-04-27
 */
@Entity
@DynamicInsert
@DynamicUpdate
@Table(name = "schedule_job")
@TableName(value =" schedule_job", schema = "renren")
public class ScheduleJobEntity implements java.io.Serializable {

	private static final long serialVersionUID = -1L;

	/**
	 * 任务id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@TableId(value="job_id",type=IdType.AUTO)
	@Column(name = "job_id", nullable = false, unique = true, length = 20)
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
	 * cron表达式
	 */
	@TableField("cron_expression")
	@Column(name = "cron_expression", length = 100)
	private String cronExpression;

	/**
	 * 任务状态0：正常1：暂停
	 */
	@TableField("status")
	@Column(name = "status", length = 4)
	private Integer status;

	/**
	 * 备注
	 */
	@TableField("remark")
	@Column(name = "remark", length = 255)
	private String remark;

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
	 * cron表达式
	 */
	public void setCronExpression(String value) {
		this.cronExpression = value;
    }

	/**
	 * 属性的公用get方法<br/>
	 * cron表达式
	 */
    public String getCronExpression() {
		return this.cronExpression;
	}

	/**
	 * 属性的公用set方法<br/>
	 * 任务状态0：正常1：暂停
	 */
	public void setStatus(Integer value) {
		this.status = value;
    }

	/**
	 * 属性的公用get方法<br/>
	 * 任务状态0：正常1：暂停
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
		object.put("jobId", getJobId());
		object.put("beanName", getBeanName());
		object.put("params", getParams());
		object.put("cronExpression", getCronExpression());
		object.put("status", getStatus());
		object.put("remark", getRemark());
		object.put("createTime", getCreateTime());
		return object.toJSONString();
	}

}
