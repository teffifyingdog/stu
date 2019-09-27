package com.wjc.stu.filter;

import javax.servlet.*;
import java.io.IOException;

public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("过滤器启动");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("开始过滤");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("过滤结束");
    }

    @Override
    public void destroy() {
        System.out.println("关闭过滤");
    }
}
