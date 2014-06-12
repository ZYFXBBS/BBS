package test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit38.AbstractJUnit38SpringContextTests;

import com.zyfx.core.bbs.member.model.Member;
@SuppressWarnings("deprecation")
@ContextConfiguration("classpath:applicationContext-*.xml")
public class IbatisTest extends AbstractJUnit38SpringContextTests{

	@Autowired
	private SqlMapClientTemplate sqlMapClientTemplate;
	
	/**
	 * 工作中 用到了 ibatis  主要是原来老网站 我用这个 测试了一下 
	 * 学习了一下 ibatis 着实觉得mybatis 方便很多 的却是 ibatis 的进化版本
	 * 保留ibatis 完全为了 今后 学习和测试
	 *  测试的时候 需要包 配置文件 ibatis 部门的配置 打开 并且 去掉 mybatis 的配置
	 */
	@Test
	public void testInsertMember(){
		String SQLMAPPATH = "Member.";
		Member m = new Member();
		m.setMemberName("springJDBC");
		try {
			sqlMapClientTemplate.insert(SQLMAPPATH + "addMember", m);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
