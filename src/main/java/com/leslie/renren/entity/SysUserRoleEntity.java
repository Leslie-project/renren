package com.leslie.renren.entity;

import org.hibernate.annotations.DynamicInsert;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;
import javax.persistence.GenerationType;
import org.hibernate.annotations.DynamicUpdate;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import javax.persistence.Table;
import javax.persistence.Entity;
import com.alibaba.fastjson.JSONObject;
import javax.persistence.Id;

/**
 * <p>
 * 用户与角色对应关系
 * </p>
 * 
 * @version 1.0
 * @author Focus
 * @since 2020-04-27
 */
@Entity
@DynamicInsert
@DynamicUpdate
@Table(name = "sys_user_role")
@TableName(value =" sys_user_role", schema = "renren")
public class SysUserRoleEntity implements java.io.Serializable {

	private static final long serialVersionUID = -1L;

	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@TableId(value="id",type=IdType.AUTO)
	@Column(name = "id", nullable = false, unique = true, length = 20)
	@JsonSerialize(using = ToStringSerializer.class)
	private Long id;

	/**
	 * 用户ID
	 */
	@TableField("user_id")
	@Column(name = "user_id", length = 20)
	@JsonSerialize(using = ToStringSerializer.class)
	private Long userId;

	/**
	 * 角色ID
	 */
	@TableField("role_id")
	@Column(name = "role_id", length = 20)
	@JsonSerialize(using = ToStringSerializer.class)
	private Long roleId;

	/**
	 * 属性的公用set方法<br/>
	 * 
	 */
	public void setId(Long value) {
		this.id = value;
    }

	/**
	 * 属性的公用get方法<br/>
	 * 
	 */
    public Long getId() {
		return this.id;
	}

	/**
	 * 属性的公用set方法<br/>
	 * 用户ID
	 */
	public void setUserId(Long value) {
		this.userId = value;
    }

	/**
	 * 属性的公用get方法<br/>
	 * 用户ID
	 */
    public Long getUserId() {
		return this.userId;
	}

	/**
	 * 属性的公用set方法<br/>
	 * 角色ID
	 */
	public void setRoleId(Long value) {
		this.roleId = value;
    }

	/**
	 * 属性的公用get方法<br/>
	 * 角色ID
	 */
    public Long getRoleId() {
		return this.roleId;
	}

	@Override
	public String toString() {
		JSONObject object = new JSONObject();
		object.put("id", getId());
		object.put("userId", getUserId());
		object.put("roleId", getRoleId());
		return object.toJSONString();
	}

}
