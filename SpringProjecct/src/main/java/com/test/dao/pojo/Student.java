package com.test.dao.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {

	@Id
	private Integer sno;
	private String sname;
	private String course;
	private Integer fee;

	public Integer getSno() {
		return sno;
	}

	public void setSno(Integer sno) {
		this.sno = sno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public Integer getFee() {
		return fee;
	}

	public void setFee(Integer fee) {
		this.fee = fee;
	}

	public Student(Integer sno, String sname, String course, Integer fee) { // Row
		this.sno = sno;
		this.sname = sname;
		this.course = course;
		this.fee = fee;
	}

	public Student(Integer sno) { //Primary Key
		this.sno = sno;
	}

	public Student() {//Empty
	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", course="
				+ course + ", fee=" + fee + "]";
	}

}
