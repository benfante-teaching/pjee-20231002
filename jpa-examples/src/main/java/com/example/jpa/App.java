package com.example.jpa;

import java.util.List;

import com.example.jpa.entity.Film;
import com.example.jpa.entity.Language;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class App {
    public static void main(String[] args) {
        try (EntityManagerFactory emf = Persistence.createEntityManagerFactory("films");) {

            // createNewFilm(emf);
            
            // updateFilm(emf);

            getFilms(emf);
        }
    }

    private static void updateFilm(EntityManagerFactory emf) {
        Film film = null;
        try (EntityManager em = emf.createEntityManager();) {
            em.getTransaction().begin();

            film = em.find(Film.class, 1002L);
            film.setTitle("Il secondo tragico Fantozzi");

            em.getTransaction().commit();

            System.out.println(film.getLanguage().getName());

        }
        film.setTitle("Un altro cambiamento"); // No effects on the DB
        // System.out.println(film.getLanguage().getName()); // NO!! LazyInitializationException
    }

    private static void createNewFilm(EntityManagerFactory emf) {
        try (EntityManager em = emf.createEntityManager();) {
            em.getTransaction().begin();

            Film film = new Film();
            film.setTitle("Pretty Woman");
            Language english = em.getReference(Language.class, 1L);
            film.setLanguage(english);
            em.persist(film);

            em.getTransaction().commit();
        }
    }

    private static void getFilms(EntityManagerFactory emf) {
        try (EntityManager em = emf.createEntityManager();) {
            TypedQuery<Film> q = em.createQuery("SELECT f FROM Film f", Film.class);
            List<Film> films = q.getResultList();
            for (Film film : films) {
                System.out.println(film.getId() + " " + film.getTitle() + " " + film.getLanguage().getName());
            }
        }
    }
}
