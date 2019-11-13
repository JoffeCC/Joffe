package com.woniu.entity;

import java.util.List;

public class TestBean {
	private List<User> list;  // 模拟的是批量上传两个user

	public TestBean() {
		super();
	}

	public List<User> getList() {
		return list;
	}

	public void setList(List<User> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "TestBean [list=" + list + "]";
	}
	
}
