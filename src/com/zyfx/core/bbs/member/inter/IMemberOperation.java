package com.zyfx.core.bbs.member.inter;

import java.util.List;
import java.util.Map;

import com.zyfx.core.bbs.member.model.Member;
import com.zyfx.core.framework.common.utils.Page;


public interface IMemberOperation extends IBaseOperation {

	/**
	 * 根据id 查询会员信息
	 * @param 
	 * @author by zhp 2014-5-29 上午12:18:50
	 */
	public Member selectMemberByID(int memberId);
	
	/**
	 * 查询所有 会员 并且分页
	 * @param page
	 * @return
	 */
	public List<Member> queryAllMembers(Page page);
}
