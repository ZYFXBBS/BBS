/** 
 * Copyright (c) 2012,　六动力（福建）网络科技有限公司  All rights reserved。
 * 
 * GoodsMapperTest.java
 */

package test;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit38.AbstractJUnit38SpringContextTests;

import com.zyfx.core.bbs.member.controller.MemberController;
import com.zyfx.core.bbs.member.inter.IMemberOperation;
import com.zyfx.core.bbs.member.model.Member;
import com.zyfx.core.framework.common.utils.Page;
import com.zyfx.core.framework.common.utils.PageRequest;



/**  
 * @author Administrator
 * @date 2013-1-31 上午10:44:38 
 */
@SuppressWarnings("deprecation")
@ContextConfiguration("classpath:applicationContext-*.xml")
public class MapperTest extends AbstractJUnit38SpringContextTests{

    @Autowired
    private IMemberOperation mapper;
    
    @Autowired
    private MemberController memberController;
    
    /**
     * 测试
     */
//    @Test  
//    public void testqueryAllMember() {  
//    	PageRequest page = new PageRequest();
//    	page.setPage("1");
//    	page.setLimit("10");
//    	page.setSort("memberName");
//    	Page o = memberController.queryAllMember(page);
//    	System.out.println(o.getTotalCount()+"总数！！");
//    	ObjectMapper objectMapper = new ObjectMapper();
//		try {
//			String str = objectMapper.writeValueAsString(o);
//			System.out.println(str);
//		} catch (Exception e) {
//		e.printStackTrace();
//		}
//    }
    
    @Test  
    public void testqueryAllMember1() {  
    	Page page = new Page();
    	page.setPageSize(10);
    	page.setCurrentPage(1);
    	Map map = new HashMap<String, String>();
    	Member m = new Member();
    	//m.setMemberName("memberName");
    	//page.setSort("memberName");
//    	mapper.queryAllMembers1(page,m);
    }
//    @Test  
//    public void testSelectMemberByID(){  
//    	
//    	try {
//    		Member m = mapper.selectMemberById(1);
//    		System.out.println(m.getMemberName());
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//    }
    
//    @Test  
//    public void testqueryAllMembersCount(){  
//    	
//    	try {
//    		int count = mapper.queryAllMembersCount();
//    		System.out.println(count);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//    }
    
//    @Test
//    public void testaddMember(){  
//    	Member m = new Member();
//    	m.setMemberName("zhp");
//    	m.setMemberPWD("123");
//    	m.setMemberRealName("sssssss");
//    	try {
//    	   mapper.addMember(m);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//    }
//    
//    @Test
//    public void testupdateMember(){  
//    	Member m = new Member();
//    	m.setMemberName("zhp1111111111111111");
//    	m.setMemberPWD("1231111111");
//    	m.setMemberRealName("22222222222222");
//    	m.setDate(new Date());
//    	m.setMemberId(1);
//    	m.setTopicCount(100);
//    	try {
//    	   mapper.updateMember(m);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//    }
    
    public static void main(String[] args) {
		String sort = "shenhau.desc";
		if(sort.indexOf(".") != -1){
			String _order = sort.substring(sort.lastIndexOf(".")+1, sort.length());
			_order =_order.toLowerCase();
			if(sort.endsWith("desc")){
    			sort = sort.substring(0, sort.length() - 5);
    			System.out.println("sort数值："+sort);
    		}else if(sort.endsWith("asc")){
    			sort = sort.substring(0, sort.length() - 4);
    		}
		}
		System.out.println(sort+"最终数值........");
	}
}
