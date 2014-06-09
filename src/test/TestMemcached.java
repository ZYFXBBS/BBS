package test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit38.AbstractJUnit38SpringContextTests;

import com.zyfx.core.bbs.member.model.Member;
import com.zyfx.core.framework.cache.IBaseCacheProxy;

@SuppressWarnings("deprecation")
@ContextConfiguration("classpath:applicationContext-*.xml")
public class TestMemcached extends AbstractJUnit38SpringContextTests{
	
	private long lineCacheTime = 120 * 60 * 1000;
	
	@Autowired
	private IBaseCacheProxy baseCacheProxy;
	
	/* 这里 对象要实现 序列化接口  zhp 20140609 */
	@Test
	public void testSaveCached(){
		Member m = new Member();
		m.setMemberName("shenhua");
		try {
			baseCacheProxy.set("shenhua", "shenhua", m, lineCacheTime);
			System.out.println("已经放入了!!1");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	/* 将 刚刚存入 缓存的对象获取出来 根据 key zhp 20140609 */
	@Test
	public void testGetCached(){
		Member m = null;
		try {
			m = (Member)baseCacheProxy.get("shenhua", "shenhua");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if(m != null){
			System.out.println(m.getMemberName()+"从缓存中获取的...");
		}else{
			System.out.println("没有获取到");
		}
	}
	
	
}
