package com.examples.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.sql.DataSource;

import jakarta.annotation.Resource;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

    @Resource(name = "jdbc/people")
    private DataSource dataSource;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Set response content type
        resp.setContentType("text/plain");

        // Actual logic goes here.
        PrintWriter writer = resp.getWriter();
        writer.println("Hello Servlet!");
        writer.println("Data source: " + dataSource);
    }
    

}