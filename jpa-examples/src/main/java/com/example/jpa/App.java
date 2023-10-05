package com.example.jpa;

import java.util.List;

import com.example.jpa.entity.Film;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class App {
    public static void main(String[] args) {
        try (EntityManagerFactory emf = Persistence.createEntityManagerFactory("films");
                EntityManager em = emf.createEntityManager();) {
            TypedQuery<Film> q = em.createQuery("SELECT f FROM Film f", Film.class);
            List<Film> films = q.getResultList();
            for (Film film : films) {
                System.out.println(film.getId() + " " + film.getTitle() + " " + film.getLanguage().getName());
            }
        }
    }
}
