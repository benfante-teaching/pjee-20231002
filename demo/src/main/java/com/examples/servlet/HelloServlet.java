package com.examples.servlet;

import java.io.IOException;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        String name = (String)session.getAttribute("name");
        if (name == null) {
            req.setAttribute("name", "User (da get)");
        }
        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/hello.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        if (name == null || name.isBlank()) {
            name = "User";
        }
        HttpSession session = req.getSession();
        session.setAttribute("name", name);
        resp.sendRedirect("/demo/hello");
    }
    

}