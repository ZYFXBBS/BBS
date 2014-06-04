package com.zyfx.core.bbs.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("/shenhua")
public class MemberController {

	
	@RequestMapping("/test")
	public String getMember(){
		System.out.println("111111111111");
		return "";
	}
}
