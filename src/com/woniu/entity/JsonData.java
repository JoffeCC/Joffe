package com.woniu.entity;

import java.io.Serializable;

public class JsonData implements Serializable {
	private static final long serialVersionUID = 1L;
	private String content;
	private Integer state;
	private String msg;

	public JsonData() {
		super();
	}

	public JsonData(String content, Integer state, String msg) {
		super();
		this.content = content;
		this.state = state;
		this.msg = msg;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "JsonData [content=" + content + ", state=" + state + ", msg=" + msg + "]";
	}

}
