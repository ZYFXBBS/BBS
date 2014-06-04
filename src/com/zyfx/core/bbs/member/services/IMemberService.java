package com.zyfx.core.bbs.member.services;

import java.util.List;
import com.zyfx.core.bbs.member.model.Member;

/**
 * @author Administrator
 */
public interface IMemberService {

	
    public List<Member> queryAllMembers();
    
    /**
     * 登录
     * @param 
     * @author by zhp 2014-5-29 上午12:14:36
     */
    public boolean login(Member member);
    
    /**
     * 注册
     * @param 
     * @author by zhp 2014-5-29 上午12:14:49
     */
    public boolean register(Member member);
    
    /**
     * 根据用户名查找用户
     * @param 
     * @author by zhp 2014-5-29 上午12:15:16
     */
    public boolean getMemberByName(String name);
    
   /**
    * 根据用户 id 删除会员
    * @param 
    * @author by zhp 2014-5-29 上午12:15:40
    */
    public boolean delUsers(int id);
    
    /**
     * 根据ID查询会员
     * @param 
     * @author by zhp 2014-5-29 上午12:16:14
     */
    public Member getMemberById(int id);
    
    /**
     * 修改会员信息
     * @param 
     * @author by zhp 2014-5-29 上午12:16:40
     */
    public void updateMember(Member member);
}
