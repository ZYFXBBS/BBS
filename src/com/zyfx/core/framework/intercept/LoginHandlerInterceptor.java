package com.zyfx.core.framework.intercept;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import com.zyfx.core.bbs.member.model.Member;
 

public class LoginHandlerInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session=request.getSession();
        Member user=(Member)session.getAttribute("user");
        if(user==null){
            response.sendRedirect(request.getContextPath());
            return false;
        }
        return true;
    }

}
