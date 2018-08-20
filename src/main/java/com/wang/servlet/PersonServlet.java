package com.wang.servlet;

import com.wang.entity.Person;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Administrator on 2018/5/4 0004.
 */
public class PersonServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("WEB-INF/beans.xml");
        Person p = (Person)ctx.getBean("person");
        ctx.close();
        request.setAttribute("person", p);
        request.getRequestDispatcher("/WEB-INF/show.jsp").forward(request, response);
    }
}
