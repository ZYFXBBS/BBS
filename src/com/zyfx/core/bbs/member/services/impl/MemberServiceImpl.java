package com.zyfx.core.bbs.member.services.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zyfx.core.bbs.member.controller.MemberController;
import com.zyfx.core.bbs.member.inter.IMemberOperation;
import com.zyfx.core.bbs.member.model.Member;
import com.zyfx.core.bbs.member.services.IMemberService;
import com.zyfx.core.framework.common.utils.Page;

@Service
public class MemberServiceImpl implements IMemberService{

	private static final Logger logger = LoggerFactory.getLogger(MemberServiceImpl.class);
	
	@Autowired
	private IMemberOperation mapper;
	
	public boolean delUsers(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * 查询会员信息 
	 */
	public Member getMemberById(int memberId) {
		
		return mapper.selectMemberById(memberId);
	}

	public boolean getMemberByName(String name) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean login(Member member) {
		// TODO Auto-generated method stub
		return false;
	}

	public Page queryAllMembers(Page page) {
		List<Member> list = null;
		try {
			list = mapper.queryAllMembers(page);
			page.setResult(list);
		} catch (Exception e) {
			logger.error("查询会员列表出错", e);
		}
	
		return page;
	}

	public boolean register(Member member) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void updateMember(Member member) {
		// TODO Auto-generated method stub
		
	}

}
