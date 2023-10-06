package com.example.demosb.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demosb.forms.FilmForm;
import com.example.demosb.model.Film;
import com.example.demosb.service.FilmService;

@RestController
@RequestMapping("/api/films")
public class FilmRestController {

    @Autowired
    private FilmService filmService;
    
    @GetMapping
    public Iterable<Film> list() {
        return filmService.getAllFilms();
    }

    @GetMapping("/{id}")
    public Film film(@PathVariable Long id) {
        return filmService.getFilmById(id);
    }

    @PostMapping
    public Film add(@RequestBody FilmForm film) {
        return filmService.saveFilm(film);
    }
}