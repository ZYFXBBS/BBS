package com.zyfx.core.bbs.member.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zyfx.core.bbs.member.model.Member;
import com.zyfx.core.bbs.member.model.MemberInfo;
import com.zyfx.core.bbs.member.services.IMemberService;
import com.zyfx.core.framework.common.utils.Page;
import com.zyfx.core.framework.common.utils.PageRequest;
import com.zyfx.core.framework.common.utils.PageUtil;

@Controller
@RequestMapping("/memberController")
public class MemberController {

	/**
	 * 这里日志 要加上
	 */
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@Autowired
	private IMemberService iMemberService;
	
	/**
	 * 获取 会员
	 * @param page
	 * @return
	 */
	@RequestMapping(value = "/queryAllMember")
	@ResponseBody
	public Page queryAllMember(MemberInfo info){
//		Page page = null;
//		page = PageUtil.converPage(pageReq);
//		System.out.println("哈哈哈哈："+page.getSort());
		Page page =iMemberService.queryAllMembers(info);
		return page;
	}
}
