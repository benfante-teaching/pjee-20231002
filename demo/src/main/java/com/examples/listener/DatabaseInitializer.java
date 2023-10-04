package com.examples.listener;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Logger;

import javax.sql.DataSource;

import jakarta.annotation.Resource;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener("Creates the database tables and populates them with some data")
public class DatabaseInitializer implements ServletContextListener {
    private static final Logger log = Logger.getLogger(DatabaseInitializer.class.getName());

    @Resource(name = "jdbc/people")
    private DataSource dataSource;

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        log.info("Initializing database...");
        try (Connection conn = dataSource.getConnection();
            var stmt = conn.createStatement()) {
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS people (id SERIAL, name VARCHAR(255))");
            stmt.executeUpdate("INSERT INTO people (name) VALUES ('Alice')");
            stmt.executeUpdate("INSERT INTO people (name) VALUES ('Bob')");
            stmt.executeUpdate("INSERT INTO people (name) VALUES ('Charlie')");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}