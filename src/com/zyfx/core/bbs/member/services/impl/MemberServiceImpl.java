package com.zyfx.core.bbs.member.services.impl;

import java.util.List;

import org.dozer.Mapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zyfx.core.bbs.member.controller.MemberController;
import com.zyfx.core.bbs.member.inter.IMemberOperation;
import com.zyfx.core.bbs.member.model.Member;
import com.zyfx.core.bbs.member.model.MemberInfo;
import com.zyfx.core.bbs.member.services.IMemberService;
import com.zyfx.core.framework.common.utils.Page;
import com.zyfx.core.framework.common.utils.PageUtil;

@Service
public class MemberServiceImpl implements IMemberService{

	private static final Logger logger = LoggerFactory.getLogger(MemberServiceImpl.class);
	
	@Autowired
	private Mapper dozerBeanMapper;
	
	@Autowired
	private IMemberOperation mapper;
	
	@Transactional(rollbackFor = { Exception.class })
	public void deleteMember(int memberId) {
		mapper.deleteMember(memberId);
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

	public Page queryAllMembers(MemberInfo info){
		List<Member> list = null;
		Page page = PageUtil.converPage(info);
		list = mapper.queryAllMembers(page,info);
		page.setResult(list);
		return page;
	}
	
	@Transactional(rollbackFor = { Exception.class })
	public void register(MemberInfo info) {
		Member member =  dozerBeanMapper.map(info,Member.class);
		logger.debug("转换 MemberInfo >> Member 对象..");
		mapper.addMember(member);
	}

	@Override
	public void updateMember(Member member) {
		// TODO Auto-generated method stub
		
	}

}
