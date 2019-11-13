package com.woniu.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String uname;
	private String password;
	private Integer gender;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date birthday;  // 以后在封装这个属性时都会通过默认的日期类型转换器来进行格式校验
	private Float salary;

	public User() {
		super();
	}

	public User(Long id, String uname, String password) {
		super();
		this.id = id;
		this.uname = uname;
		this.password = password;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Float getSalary() {
		return salary;
	}

	public void setSalary(Float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", uname=" + uname + ", password=" + password + ", gender=" + gender + ", birthday="
				+ birthday + ", salary=" + salary + "]";
	}

}
