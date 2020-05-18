package main.filter;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
@Order(1)
public class HeaderFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        HttpServletResponse newResponse = (HttpServletResponse) servletResponse;
        newResponse.addHeader("radek", "janiak");
        System.out.println("Header Filter");
        filterChain.doFilter(servletRequest,newResponse);

    }
}
