package org.wildfly.swarm.examples.opentracing.servlet;

import org.joda.time.DateTime;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Bob McWhirter
 * @author Juraci Paixão Kröhling
 */
@WebServlet("/*")
public class MyServlet extends HttpServlet {

    @EJB
    Service service;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        service.doSomething();
        resp.getWriter().write("Howdy at " + new DateTime());
    }
}
