package test;

import org.dozer.Mapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit38.AbstractJUnit38SpringContextTests;

import com.zyfx.core.bbs.member.model.Member;
import com.zyfx.core.bbs.member.model.MemberInfo;

@SuppressWarnings("deprecation")
@ContextConfiguration("classpath:applicationContext-*.xml")
public class DozerBeanMapperTest extends AbstractJUnit38SpringContextTests{

	@Autowired
	private Mapper dozerBeanMapper;
	
	@Test
	public void testDozer(){
		MemberInfo mi = new MemberInfo();
		mi.setMemberName("shenhua");
		mi.setEmail("111@qq.com");
		mi.setMemberId("100");
		mi.setAddress("地址");
		mi.setDate("1987-12-31 12:12:12");
		Member m = new Member();
		try {
			m = dozerBeanMapper.map(mi,Member.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("MemberName:"+m.getMemberName());
		System.out.println("Email:"+m.getEmail());
		System.out.println("Address:"+m.getAddress());
		System.out.println("MemberId:"+m.getMemberId());
		System.out.println("Date:"+m.getDate());
//		ystem.out.println(m.getMemberName());
		
	}
}
