package com.test.dao.pojo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Course generated by hbm2java
 */
@Entity
@Table(name = "course", catalog = "jandb")
public class Course implements java.io.Serializable {

	private Integer cid;
	private String cname;
	private String duration;
	private List<User> users;

	public Course() {
	}

	public Course(String cname, String duration, List<User> users) {
		this.cname = cname;
		this.duration = duration;
		this.users = users;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cid", unique = true, nullable = false)
	public Integer getCid() {
		return this.cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	@Column(name = "cname", length = 45)
	public String getCname() {
		return this.cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	@Column(name = "duration", length = 45)
	public String getDuration() {
		return this.duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "course")
	public List<User> getUsers() {
		return this.users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
	
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", duration="
				+ duration + "]";
	}


}
