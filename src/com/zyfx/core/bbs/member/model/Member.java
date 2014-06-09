package com.zyfx.core.bbs.member.model;

import java.io.Serializable;
import java.util.Date;

public class Member implements Serializable{
	
	private int memberId;
	private String memberName;//会员名称
	private String memberPWD;//密码
	private String memberIcon;//会员图标
	private String memberRealName;//真实姓名
	private String email;//邮箱
	private String mobile;//手机
	private String homephone;//家庭电话
	private String qq;//qq
	private String address;//地址
	private String postCode;//邮编
	private String isAdmin;//是否管理员
	private String isPower;//是否版主
	private String mark;//积分
	private String action;//是否在线
	private int topicCount;//发帖数量
	private int replyCount;//回帖数量
	private Date date;//注册时间
	private Date LastVist;//最后登出时间
	
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getMemberPWD() {
		return memberPWD;
	}
	public void setMemberPWD(String memberPWD) {
		this.memberPWD = memberPWD;
	}
	public String getMemberIcon() {
		return memberIcon;
	}
	public void setMemberIcon(String memberIcon) {
		this.memberIcon = memberIcon;
	}
	public String getMemberRealName() {
		return memberRealName;
	}
	public void setMemberRealName(String memberRealName) {
		this.memberRealName = memberRealName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getHomephone() {
		return homephone;
	}
	public void setHomephone(String homephone) {
		this.homephone = homephone;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	public String getIsAdmin() {
		return isAdmin;
	}
	public void setIsAdmin(String isAdmin) {
		this.isAdmin = isAdmin;
	}
	public String getIsPower() {
		return isPower;
	}
	public void setIsPower(String isPower) {
		this.isPower = isPower;
	}
	public String getMark() {
		return mark;
	}
	public void setMark(String mark) {
		this.mark = mark;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public int getTopicCount() {
		return topicCount;
	}
	public void setTopicCount(int topicCount) {
		this.topicCount = topicCount;
	}
	public int getReplyCount() {
		return replyCount;
	}
	public void setReplyCount(int replyCount) {
		this.replyCount = replyCount;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Date getLastVist() {
		return LastVist;
	}
	public void setLastVist(Date lastVist) {
		LastVist = lastVist;
	}
	
	
}
