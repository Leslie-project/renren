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
 * 菜单管理
 * </p>
 * 
 * @version 1.0
 * @author Focus
 * @since 2020-04-27
 */
@Entity
@DynamicInsert
@DynamicUpdate
@Table(name = "sys_menu")
@TableName(value =" sys_menu", schema = "renren")
public class SysMenuEntity implements java.io.Serializable {

	private static final long serialVersionUID = -1L;

	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@TableId(value="menu_id",type=IdType.AUTO)
	@Column(name = "menu_id", nullable = false, unique = true, length = 20)
	@JsonSerialize(using = ToStringSerializer.class)
	private Long menuId;

	/**
	 * 父菜单ID，一级菜单为0
	 */
	@TableField("parent_id")
	@Column(name = "parent_id", length = 20)
	@JsonSerialize(using = ToStringSerializer.class)
	private Long parentId;

	/**
	 * 菜单名称
	 */
	@TableField("name")
	@Column(name = "name", length = 50)
	private String name;

	/**
	 * 菜单URL
	 */
	@TableField("url")
	@Column(name = "url", length = 200)
	private String url;

	/**
	 * 授权(多个用逗号分隔，如：user:list,user:create)
	 */
	@TableField("perms")
	@Column(name = "perms", length = 500)
	private String perms;

	/**
	 * 类型0：目录1：菜单2：按钮
	 */
	@TableField("type")
	@Column(name = "type", length = 11)
	private Integer type;

	/**
	 * 菜单图标
	 */
	@TableField("icon")
	@Column(name = "icon", length = 50)
	private String icon;

	/**
	 * 排序
	 */
	@TableField("order_num")
	@Column(name = "order_num", length = 11)
	private Integer orderNum;

	/**
	 * 属性的公用set方法<br/>
	 * 
	 */
	public void setMenuId(Long value) {
		this.menuId = value;
    }

	/**
	 * 属性的公用get方法<br/>
	 * 
	 */
    public Long getMenuId() {
		return this.menuId;
	}

	/**
	 * 属性的公用set方法<br/>
	 * 父菜单ID，一级菜单为0
	 */
	public void setParentId(Long value) {
		this.parentId = value;
    }

	/**
	 * 属性的公用get方法<br/>
	 * 父菜单ID，一级菜单为0
	 */
    public Long getParentId() {
		return this.parentId;
	}

	/**
	 * 属性的公用set方法<br/>
	 * 菜单名称
	 */
	public void setName(String value) {
		this.name = value;
    }

	/**
	 * 属性的公用get方法<br/>
	 * 菜单名称
	 */
    public String getName() {
		return this.name;
	}

	/**
	 * 属性的公用set方法<br/>
	 * 菜单URL
	 */
	public void setUrl(String value) {
		this.url = value;
    }

	/**
	 * 属性的公用get方法<br/>
	 * 菜单URL
	 */
    public String getUrl() {
		return this.url;
	}

	/**
	 * 属性的公用set方法<br/>
	 * 授权(多个用逗号分隔，如：user:list,user:create)
	 */
	public void setPerms(String value) {
		this.perms = value;
    }

	/**
	 * 属性的公用get方法<br/>
	 * 授权(多个用逗号分隔，如：user:list,user:create)
	 */
    public String getPerms() {
		return this.perms;
	}

	/**
	 * 属性的公用set方法<br/>
	 * 类型0：目录1：菜单2：按钮
	 */
	public void setType(Integer value) {
		this.type = value;
    }

	/**
	 * 属性的公用get方法<br/>
	 * 类型0：目录1：菜单2：按钮
	 */
    public Integer getType() {
		return this.type;
	}

	/**
	 * 属性的公用set方法<br/>
	 * 菜单图标
	 */
	public void setIcon(String value) {
		this.icon = value;
    }

	/**
	 * 属性的公用get方法<br/>
	 * 菜单图标
	 */
    public String getIcon() {
		return this.icon;
	}

	/**
	 * 属性的公用set方法<br/>
	 * 排序
	 */
	public void setOrderNum(Integer value) {
		this.orderNum = value;
    }

	/**
	 * 属性的公用get方法<br/>
	 * 排序
	 */
    public Integer getOrderNum() {
		return this.orderNum;
	}

	@Override
	public String toString() {
		JSONObject object = new JSONObject();
		object.put("menuId", getMenuId());
		object.put("parentId", getParentId());
		object.put("name", getName());
		object.put("url", getUrl());
		object.put("perms", getPerms());
		object.put("type", getType());
		object.put("icon", getIcon());
		object.put("orderNum", getOrderNum());
		return object.toJSONString();
	}

}
