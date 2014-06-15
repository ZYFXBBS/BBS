package com.zyfx.core.framework.common.httpmodel;

public class JsonResult {

	private boolean state = false;// 状态 true 成功 false 失败
	private String msg = "";// 返回信息
	private Object data = null;// 返回数据
	public boolean isState() {
		return state;
	}
	public void setState(boolean state) {
		this.state = state;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	
	
	
	
}
