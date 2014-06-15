package test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit38.AbstractJUnit38SpringContextTests;

import com.zyfx.core.bbs.member.inter.IMemberOperation;
import com.zyfx.core.bbs.member.model.Member;
import com.zyfx.core.bbs.member.services.IMemberService;


@SuppressWarnings("deprecation")
@ContextConfiguration("classpath:applicationContext-*.xml")
public class TranscationTest extends AbstractJUnit38SpringContextTests{

	@Autowired
	private IMemberService iMemberService;
	
	@Autowired
    private IMemberOperation mapper;
	
	@Test
	public void testSaveMember(){
		Member member = new Member();
		member.setMemberName("zhp");
		member.setMemberId(59);
			try {
				iMemberService.register(member);
			} catch (Exception e) {
				e.printStackTrace();
			}
		
	}

}
