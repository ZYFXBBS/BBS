/** 
 * Copyright (c) 2012,　六动力（福建）网络科技有限公司  All rights reserved。
 * 
 * GoodsMapperTest.java
 */

package test;

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


/**  
 *
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
    @Test  
    public void testqueryAllMember() {  
    	Object o = memberController.queryAllMember();
    	ObjectMapper objectMapper = new ObjectMapper();
		try {
			String str = objectMapper.writeValueAsString(o);
			System.out.println(str);
		} catch (Exception e) {
		e.printStackTrace();
		}
    }
    
    @Test  
    public void testSelectMemberByID(){  
    	
    	try {
    		Member m = mapper.selectMemberByID(1);
    		System.out.println(m.getMemberName());
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    
    @Test  
    public void testqueryAllMembersCount(){  
    	
    	try {
    		int count = mapper.queryAllMembersCount();
    		System.out.println(count);
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}
