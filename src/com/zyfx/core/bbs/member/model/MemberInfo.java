package com.zyfx.core.bbs.member.model;

import java.io.Serializable;
import java.util.Date;

import com.zyfx.core.framework.common.utils.PageParameters;

public class MemberInfo implements Serializable,PageParameters{
	
	private String memberId;
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
	private String topicCount;//发帖数量
	private String replyCount;//回帖数量
	private String date;//注册时间
	private String LastVist;//最后登出时间
	
	private String page = null; //这个是 currentPage
	private String limit = null;// 这个是 pageSize
	private String sort = null;//排序字段
	private String order = null;
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
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
	public String getTopicCount() {
		return topicCount;
	}
	public void setTopicCount(String topicCount) {
		this.topicCount = topicCount;
	}
	public String getReplyCount() {
		return replyCount;
	}
	public void setReplyCount(String replyCount) {
		this.replyCount = replyCount;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getLastVist() {
		return LastVist;
	}
	public void setLastVist(String lastVist) {
		LastVist = lastVist;
	}
	public String getPage() {
		return page;
	}
	public void setPage(String page) {
		this.page = page;
	}
	public String getLimit() {
		return limit;
	}
	public void setLimit(String limit) {
		this.limit = limit;
	}
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	public String getOrder() {
		return order;
	}
	public void setOrder(String order) {
		this.order = order;
	}
	
	
	
}
