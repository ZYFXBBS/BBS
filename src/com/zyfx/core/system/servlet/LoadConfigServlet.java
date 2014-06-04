package com.zyfx.core.system.servlet;


import javax.servlet.ServletConfig;
import javax.servlet.ServletException;

/**
 * 载入配置文件使用（需要在web.xml配置加载、避免使用监听、减少耦合）
 *  <servlet>
 *       <servlet-name>loadConfig</servlet-name>
 *       <servlet-class>com.funo.common.servlet.LoadConfigServlet</servlet-class>
 *       <load-on-startup>0</load-on-startup>
 *  </servlet>
 *  
 */
@SuppressWarnings("serial")
public class LoadConfigServlet  extends LoadConfigBaseServlet{
	private String contextConfigLocation; 
	public void init(ServletConfig conf) throws ServletException
	{	
		super.init(conf);
		try {
			super.init(this.getServletConfig());
		} catch (ServletException e1) {
			e1.printStackTrace();
		}
		super.startApplication();
	}
	
	public String getContextConfigLocation() {
		return contextConfigLocation;
	}

	public void setContextConfigLocation(String contextConfigLocation) {
		this.contextConfigLocation = contextConfigLocation;
	}
}
