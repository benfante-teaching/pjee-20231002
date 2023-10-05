package com.examples.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.logging.Logger;

import javax.management.RuntimeErrorException;
import javax.sql.DataSource;

import jakarta.annotation.Resource;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/people/add")
public class AddPersonServlet extends HttpServlet {
    private static final Logger log = Logger.getLogger(AddPersonServlet.class.getName());
    
    @Resource(name = "jdbc/people")
    private DataSource dataSource;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/jsp/people/new.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("newName");
        if (name == null || name.isBlank() || name.length() < 3) {
            req.setAttribute("nameError", "Il nome deve essere più lungo di 2 caratteri");
            req.getRequestDispatcher("/WEB-INF/jsp/people/new.jsp").forward(req, resp);
            return;
        }
        try (Connection conn = dataSource.getConnection();
            PreparedStatement pstmt = conn.prepareStatement("INSERT INTO people (name) VALUES (?)");
        ) {
            pstmt.setString(1, name);
            pstmt.executeUpdate();
        } catch (Exception e) {
            log.severe(e.getMessage());
            throw new RuntimeException(e);
        }
        resp.sendRedirect("/demo/people");
    }


}