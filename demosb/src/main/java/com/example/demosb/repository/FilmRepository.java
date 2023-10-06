package com.example.demosb.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demosb.model.Film;

public interface FilmRepository extends CrudRepository<Film, Long> {
    
}