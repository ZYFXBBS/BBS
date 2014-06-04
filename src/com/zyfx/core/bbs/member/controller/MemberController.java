package com.zyfx.core.bbs.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zyfx.core.bbs.member.services.IMemberService;
import com.zyfx.core.framework.common.utils.Page;

@Controller("/memberController")
public class MemberController {

	@Autowired
	private IMemberService iMemberService;
	
	@RequestMapping("/queryAllMember")
	@ResponseBody
	public Page queryAllMember(){
		Page page = new Page();
		page.setCurrentPage(1);
		page =iMemberService.queryAllMembers(page);
		return page;
	}
}
