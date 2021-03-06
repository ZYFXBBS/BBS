package com.zyfx.core.bbs.member.inter;

import java.util.List;
import java.util.Map;

import com.zyfx.core.bbs.member.model.Member;
import com.zyfx.core.bbs.member.model.MemberInfo;
import com.zyfx.core.framework.common.utils.Page;
import com.zyfx.core.framework.common.utils.PageRequest;


public interface IMemberOperation extends IBaseOperation {

	/**
	 * 根据id 查询会员信息
	 * @param 
	 * @author by zhp 2014-5-29 上午12:18:50
	 */
	public Member selectMemberById(int memberId);
	
	/**
	 * 查询所有 会员 并且分页
	 * @param page
	 * @return
	 */
	public List<Member> queryAllMembers(Page page,MemberInfo info);
	
	/**
	 * 查询 所有会员总数
	 * @return
	 */
	public int queryAllMembersCount();
	
	/**
	 * 添加 会员
	 * @param member
	 */
	public void addMember(Member member);
	
	
	/**
	 * 跟新会员信息
	 * @param member
	 */
	public void updateMember(Member member);
	
	/**
	 * 删除会员信息
	 * @param memberId
	 */
	public void deleteMember(int memberId);
	
}
