package com.example.demosb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demosb.forms.FilmForm;
import com.example.demosb.model.Film;
import com.example.demosb.service.FilmService;

@Controller
@RequestMapping("/films")
public class FilmController {

    @Autowired
    private FilmService filmService;
   
    @GetMapping
    public String list(Model model) {
        Iterable<Film> films = filmService.getAllFilms();
        model.addAttribute("films", films);
        return "films/list";
    }

    @GetMapping("/new")
    public String addForm(Model model) {
        model.addAttribute("filmForm", new FilmForm());
        return "films/addForm";
    }

    @GetMapping("/{id}")
    public String detail(@PathVariable(name = "id") Long id, Model model) {
        Film film = filmService.getFilmById(id);
        model.addAttribute("film", film);
        return "films/detail";
    }

    @PostMapping
    public String save(@ModelAttribute FilmForm filmForm, BindingResult errors, Model model) {
        filmService.saveFilm(filmForm);
        return "redirect:/films";
    }
}