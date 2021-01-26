package com.blackFlix.controllers;

import com.blackFlix.jooq.enums.Genre;
import com.blackFlix.models.Movie;
import com.blackFlix.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
//@RequestMapping("/movie")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @CrossOrigin
    @RequestMapping("/movie")
    public List<Movie> fetchMovies() {
        return movieService.fetchMovieList();
    }

    @RequestMapping("/movie/load")
    public void loadMovies() throws IOException { movieService.loadMoviesFromFile(); }

    @CrossOrigin
    @PostMapping("/movie/add-genres")
    public void addGenresToMovie(@RequestParam(name = "id") int id, @RequestBody Movie movie) throws IOException {
        movieService.addGenresToMovie(id, movie.getGenreList());
    }

    @CrossOrigin
    @GetMapping("/movie/genre-list")
    public List<Genre> fetchAllGenre() {
        return movieService.fetchAllGenre();
    }

}
