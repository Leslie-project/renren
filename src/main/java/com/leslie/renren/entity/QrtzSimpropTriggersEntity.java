package com.leslie.renren.entity;

import org.hibernate.annotations.DynamicInsert;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.Column;
import java.math.BigDecimal;
import org.hibernate.annotations.DynamicUpdate;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import javax.persistence.Table;
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
@Table(name = "qrtz_simprop_triggers")
@TableName(value =" qrtz_simprop_triggers", schema = "renren")
public class QrtzSimpropTriggersEntity implements java.io.Serializable {

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
	@TableField("STR_PROP_1")
	@Column(name = "STR_PROP_1", length = 512)
	private String strProp1;

	/**
	 * 
	 */
	@TableField("STR_PROP_2")
	@Column(name = "STR_PROP_2", length = 512)
	private String strProp2;

	/**
	 * 
	 */
	@TableField("STR_PROP_3")
	@Column(name = "STR_PROP_3", length = 512)
	private String strProp3;

	/**
	 * 
	 */
	@TableField("INT_PROP_1")
	@Column(name = "INT_PROP_1", length = 11)
	private Integer intProp1;

	/**
	 * 
	 */
	@TableField("INT_PROP_2")
	@Column(name = "INT_PROP_2", length = 11)
	private Integer intProp2;

	/**
	 * 
	 */
	@TableField("LONG_PROP_1")
	@Column(name = "LONG_PROP_1", length = 20)
	@JsonSerialize(using = ToStringSerializer.class)
	private Long longProp1;

	/**
	 * 
	 */
	@TableField("LONG_PROP_2")
	@Column(name = "LONG_PROP_2", length = 20)
	@JsonSerialize(using = ToStringSerializer.class)
	private Long longProp2;

	/**
	 * 
	 */
	@TableField("DEC_PROP_1")
	@Column(name = "DEC_PROP_1", precision = 13, scale = 4)
	@JsonSerialize(using = ToStringSerializer.class)
	private BigDecimal decProp1;

	/**
	 * 
	 */
	@TableField("DEC_PROP_2")
	@Column(name = "DEC_PROP_2", precision = 13, scale = 4)
	@JsonSerialize(using = ToStringSerializer.class)
	private BigDecimal decProp2;

	/**
	 * 
	 */
	@TableField("BOOL_PROP_1")
	@Column(name = "BOOL_PROP_1", length = 1)
	private String boolProp1;

	/**
	 * 
	 */
	@TableField("BOOL_PROP_2")
	@Column(name = "BOOL_PROP_2", length = 1)
	private String boolProp2;

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
	public void setStrProp1(String value) {
		this.strProp1 = value;
    }

	/**
	 * 属性的公用get方法<br/>
	 * 
	 */
    public String getStrProp1() {
		return this.strProp1;
	}

	/**
	 * 属性的公用set方法<br/>
	 * 
	 */
	public void setStrProp2(String value) {
		this.strProp2 = value;
    }

	/**
	 * 属性的公用get方法<br/>
	 * 
	 */
    public String getStrProp2() {
		return this.strProp2;
	}

	/**
	 * 属性的公用set方法<br/>
	 * 
	 */
	public void setStrProp3(String value) {
		this.strProp3 = value;
    }

	/**
	 * 属性的公用get方法<br/>
	 * 
	 */
    public String getStrProp3() {
		return this.strProp3;
	}

	/**
	 * 属性的公用set方法<br/>
	 * 
	 */
	public void setIntProp1(Integer value) {
		this.intProp1 = value;
    }

	/**
	 * 属性的公用get方法<br/>
	 * 
	 */
    public Integer getIntProp1() {
		return this.intProp1;
	}

	/**
	 * 属性的公用set方法<br/>
	 * 
	 */
	public void setIntProp2(Integer value) {
		this.intProp2 = value;
    }

	/**
	 * 属性的公用get方法<br/>
	 * 
	 */
    public Integer getIntProp2() {
		return this.intProp2;
	}

	/**
	 * 属性的公用set方法<br/>
	 * 
	 */
	public void setLongProp1(Long value) {
		this.longProp1 = value;
    }

	/**
	 * 属性的公用get方法<br/>
	 * 
	 */
    public Long getLongProp1() {
		return this.longProp1;
	}

	/**
	 * 属性的公用set方法<br/>
	 * 
	 */
	public void setLongProp2(Long value) {
		this.longProp2 = value;
    }

	/**
	 * 属性的公用get方法<br/>
	 * 
	 */
    public Long getLongProp2() {
		return this.longProp2;
	}

	/**
	 * 属性的公用set方法<br/>
	 * 
	 */
	public void setDecProp1(BigDecimal value) {
		this.decProp1 = value;
    }

	/**
	 * 属性的公用get方法<br/>
	 * 
	 */
    public BigDecimal getDecProp1() {
		return this.decProp1;
	}

	/**
	 * 属性的公用set方法<br/>
	 * 
	 */
	public void setDecProp2(BigDecimal value) {
		this.decProp2 = value;
    }

	/**
	 * 属性的公用get方法<br/>
	 * 
	 */
    public BigDecimal getDecProp2() {
		return this.decProp2;
	}

	/**
	 * 属性的公用set方法<br/>
	 * 
	 */
	public void setBoolProp1(String value) {
		this.boolProp1 = value;
    }

	/**
	 * 属性的公用get方法<br/>
	 * 
	 */
    public String getBoolProp1() {
		return this.boolProp1;
	}

	/**
	 * 属性的公用set方法<br/>
	 * 
	 */
	public void setBoolProp2(String value) {
		this.boolProp2 = value;
    }

	/**
	 * 属性的公用get方法<br/>
	 * 
	 */
    public String getBoolProp2() {
		return this.boolProp2;
	}

	@Override
	public String toString() {
		JSONObject object = new JSONObject();
		object.put("schedName", getSchedName());
		object.put("triggerName", getTriggerName());
		object.put("triggerGroup", getTriggerGroup());
		object.put("strProp1", getStrProp1());
		object.put("strProp2", getStrProp2());
		object.put("strProp3", getStrProp3());
		object.put("intProp1", getIntProp1());
		object.put("intProp2", getIntProp2());
		object.put("longProp1", getLongProp1());
		object.put("longProp2", getLongProp2());
		object.put("decProp1", getDecProp1());
		object.put("decProp2", getDecProp2());
		object.put("boolProp1", getBoolProp1());
		object.put("boolProp2", getBoolProp2());
		return object.toJSONString();
	}

}
