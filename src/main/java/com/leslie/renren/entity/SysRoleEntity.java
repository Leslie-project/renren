package com.leslie.renren.entity;

import org.hibernate.annotations.DynamicInsert;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;
import javax.persistence.GenerationType;
import java.util.Date;
import java.util.List;

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
 * 角色
 * </p>
 * 
 * @version 1.0
 * @author Focus
 * @since 2020-04-27
 */
@Entity
@DynamicInsert
@DynamicUpdate
@Table(name = "sys_role")
@TableName(value =" sys_role", schema = "renren")
public class SysRoleEntity implements java.io.Serializable {

	private static final long serialVersionUID = -1L;

	@TableField(exist=false)
	private List<Long> menuIdList;

	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@TableId(value="role_id",type=IdType.AUTO)
	@Column(name = "role_id", nullable = false, unique = true, length = 20)
	@JsonSerialize(using = ToStringSerializer.class)
	private Long roleId;

	/**
	 * 角色名称
	 */
	@TableField("role_name")
	@Column(name = "role_name", length = 100)
	private String roleName;

	/**
	 * 备注
	 */
	@TableField("remark")
	@Column(name = "remark", length = 100)
	private String remark;

	/**
	 * 创建者ID
	 */
	@TableField("create_user_id")
	@Column(name = "create_user_id", length = 20)
	@JsonSerialize(using = ToStringSerializer.class)
	private Long createUserId;

	/**
	 * 创建时间
	 */
	@TableField("create_time")
	@Temporal(TemporalType.TIMESTAMP)
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "Asia/Shanghai")
	@Column(name = "create_time")
	private Date createTime;

	public List<Long> getMenuIdList() {
		return menuIdList;
	}

	public void setMenuIdList(List<Long> menuIdList) {
		this.menuIdList = menuIdList;
	}

	/**
	 * 属性的公用set方法<br/>
	 * 
	 */
	public void setRoleId(Long value) {
		this.roleId = value;
    }

	/**
	 * 属性的公用get方法<br/>
	 * 
	 */
    public Long getRoleId() {
		return this.roleId;
	}

	/**
	 * 属性的公用set方法<br/>
	 * 角色名称
	 */
	public void setRoleName(String value) {
		this.roleName = value;
    }

	/**
	 * 属性的公用get方法<br/>
	 * 角色名称
	 */
    public String getRoleName() {
		return this.roleName;
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
	 * 创建者ID
	 */
	public void setCreateUserId(Long value) {
		this.createUserId = value;
    }

	/**
	 * 属性的公用get方法<br/>
	 * 创建者ID
	 */
    public Long getCreateUserId() {
		return this.createUserId;
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
		object.put("roleId", getRoleId());
		object.put("roleName", getRoleName());
		object.put("remark", getRemark());
		object.put("createUserId", getCreateUserId());
		object.put("createTime", getCreateTime());
		return object.toJSONString();
	}

}
