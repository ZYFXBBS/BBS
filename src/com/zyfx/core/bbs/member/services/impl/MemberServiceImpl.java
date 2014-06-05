package com.zyfx.core.bbs.member.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zyfx.core.bbs.member.inter.IMemberOperation;
import com.zyfx.core.bbs.member.model.Member;
import com.zyfx.core.bbs.member.services.IMemberService;
import com.zyfx.core.framework.common.utils.Page;

@Service
public class MemberServiceImpl implements IMemberService{

	@Autowired
	private IMemberOperation mapper;
	
	public boolean delUsers(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	public Member getMemberById(int id) {
		// TODO Auto-generated method stub
		return null;
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
		List<Member> list = mapper.queryAllMembers(page);
		if(list != null){
			int totalRows = mapper.queryAllMembersCount();
			page.setTotalRows(totalRows);
			page.setResult(list);
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
