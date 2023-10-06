package com.example.demosb.forms;

public class FilmForm {
    private String title;
    private Long language;

    public FilmForm() {
    }

    public FilmForm(String title, Long language) {
        this.title = title;
        this.language = language;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getLanguage() {
        return language;
    }

    public void setLanguage(Long language) {
        this.language = language;
    }

}