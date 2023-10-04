package com.examples.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        String name = "Lucio";
        req.setAttribute("name", name);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/hello.jsp");
        dispatcher.forward(req, resp);
    }
    

}