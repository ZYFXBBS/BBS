package com.zyfx.core.bbs.member.inter;

import java.util.Map;

import com.zyfx.core.bbs.member.model.Member;


public interface IMemberOperation extends IBaseOperation {

	/**
	 * 根据id 查询会员信息
	 * @param 
	 * @author by zhp 2014-5-29 上午12:18:50
	 */
	public Map selectMemberByID(int memberId);
}
