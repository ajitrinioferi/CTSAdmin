/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package afa.login_gui;

/**
 *
 * @author ajitrinioferi
 */
public class Movie { //namanya enkapsulasi
    private String Title, Genre, ReleaseDate, ProductionBy, FilmDirector, Duration, AgeRestriction, StartDate, EndDate;

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String Genre) {
        this.Genre = Genre;
    }

    public String getReleaseDate() {
        return ReleaseDate;
    }

    public void setReleaseDate(String ReleaseDate) {
        this.ReleaseDate = ReleaseDate;
    }

    public String getProductionBy() {
        return ProductionBy;
    }

    public void setProductionBy(String ProductionBy) {
        this.ProductionBy = ProductionBy;
    }

    public String getFilmDirector() {
        return FilmDirector;
    }

    public void setFilmDirector(String FilmDirector) {
        this.FilmDirector = FilmDirector;
    }

    public String getDuration() {
        return Duration;
    }

    public void setDuration(String Duration) {
        this.Duration = Duration;
    }

    public String getAgeRestriction() {
        return AgeRestriction;
    }

    public void setAgeRestriction(String AgeRestriction) {
        this.AgeRestriction = AgeRestriction;
    }

    public String getStartDate() {
        return StartDate;
    }

    public void setStartDate(String StartDate) {
        this.StartDate = StartDate;
    }

    public String getEndDate() {
        return EndDate;
    }

    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;
    }
}
