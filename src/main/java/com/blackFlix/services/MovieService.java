package com.blackFlix.services;

import com.blackFlix.dao.MovieDAO;
import com.blackFlix.jooq.enums.Genre;
import com.blackFlix.models.Movie;
import io.micrometer.core.instrument.util.StringUtils;
import org.apache.commons.io.IOUtils;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.LogManager;
import java.util.logging.Logger;

@Service
public class MovieService {
    @Autowired
    private MovieDAO movieDAO;

    public List<Movie> fetchMovieList() {
        return movieDAO.fetchAll();
    }

    public void loadMoviesFromFile() throws IOException {

        File f = new File("jsonData.json");
        if (f.exists()) {
            InputStream is = new FileInputStream("jsonData.json");
            String jsonTxt = IOUtils.toString(is, "UTF-8");
//            System.out.println(jsonTxt);
            JSONArray array = new JSONArray(jsonTxt);
            for(Object o : array) {

                JSONObject movieJsonObj = (JSONObject) o;
                if(movieJsonObj.optInt("id", 0) != 0) {
                    Movie movie = new Movie(movieJsonObj);
                    movieDAO.insert(movie);
                }
            }
            System.out.println("aaa");
        }
    }

    public void addGenresToMovie(int movieId, List<Genre> genreList) {
        movieDAO.deleteAllMovieGenre(movieId);
        for(Genre genre : genreList) {
            movieDAO.insertGenreRelation(movieId, genre);
        }
    }

    public List<Genre> fetchAllGenre() {
        return movieDAO.fetchAllGenres();
    }

}
