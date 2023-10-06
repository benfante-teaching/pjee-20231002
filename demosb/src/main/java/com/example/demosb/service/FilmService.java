package com.example.demosb.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demosb.forms.FilmForm;
import com.example.demosb.model.Film;
import com.example.demosb.model.Language;
import com.example.demosb.repository.FilmRepository;
import com.example.demosb.repository.LanguangeRepository;

@Service
public class FilmService {

    @Autowired
    private FilmRepository filmRepository;
    @Autowired
    private LanguangeRepository languageRepository;

    public Iterable<Film> getAllFilms() {
        return filmRepository.findAll();
    }

    public Film getFilmById(Long id) {
        return filmRepository.findById(id).get();
    }

    public void saveFilm(FilmForm filmForm) {
        Film film = new Film(null, filmForm.getTitle(),
            languageRepository.findById(filmForm.getLanguage()).get());
        filmRepository.save(film);
    }
}