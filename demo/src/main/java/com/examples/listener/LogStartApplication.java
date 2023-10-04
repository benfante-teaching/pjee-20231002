package com.examples.listener;

import java.util.logging.Logger;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.ServletRequestAttributeEvent;
import jakarta.servlet.ServletRequestAttributeListener;
import jakarta.servlet.ServletRequestEvent;
import jakarta.servlet.ServletRequestListener;
import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSessionAttributeListener;
import jakarta.servlet.http.HttpSessionBindingEvent;

@WebListener("Questo listener logga delle informazioni all'avvio e allo stop della webapp")
public class LogStartApplication implements ServletContextListener, ServletRequestListener,
        ServletRequestAttributeListener, HttpSessionAttributeListener {
    private static final Logger log = Logger.getLogger(LogStartApplication.class.getName());

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        log.info("L'applicazione sta terminando!!!");
    }

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        log.info("L'applicazione sta partendo!!!");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        log.info("E' arrivata una request: " + sre.getServletRequest().getScheme()+sre.getServletRequest().getServletContext());
    }

    @Override
    public void attributeAdded(ServletRequestAttributeEvent srae) {
        log.info("Added request attribute: " + srae.getName() + "=" + srae.getValue());
    }

    @Override
    public void attributeAdded(HttpSessionBindingEvent event) {
        log.info("Added session attribute: " + event.getName() + "=" + event.getValue());
    }

    

    
}