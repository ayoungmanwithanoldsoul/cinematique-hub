package edu.umindanao.cinematiquehub.controllers;
/*

import edu.umindanao.cinematiquehub.models.Movie;
import edu.umindanao.cinematiquehub.ui.components.MovieCardSample;
import javafx.fxml.Initializable;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.nio.file.Files;
import java.nio.file.Paths;

import edu.umindanao.cinematiquehub.ui.components.*;

import com.fasterxml.jackson.databind.ObjectMapper;

public class MovieCardController implements Initializable {
    //    private final String filePath = "edu\\umindanao\\cinematiquehub";
    private MovieCardSample movieCardSample;

    public MovieCardController(MovieCardSample movieCardSample) {
        this.movieCardSample = movieCardSample;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {
            // Read JSON data from movies.json
            String jsonData = new String(Files.readAllBytes(Paths.get("romancewithatwist.json")));

            // Parse JSON data to create a Movie object
            ObjectMapper objectMapper = new ObjectMapper();
            Movie movie = objectMapper.readValue(jsonData, Movie.class);

            // Set movie details to the MovieCardSample
            movieCardSample.setMovieDetails(movie);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
*/


import edu.umindanao.cinematiquehub.models.Movie;
import edu.umindanao.cinematiquehub.ui.components.MovieCardSample;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

public class MovieCardController implements Initializable {

    private MovieCardSample movieCardSample;

    public MovieCardController(MovieCardSample movieCardSample) {
        this.movieCardSample = movieCardSample;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Create test data
        Movie movie = createTestData();

        // Set movie details to the MovieCardSample
        movieCardSample.setMovieDetails(movie);
    }

    private Movie createTestData() {
        Movie movie = new Movie();
        movie.setTitle("Test Movie");
        movie.setDescription("This is a test movie description.");
        movie.setYear(2022);
        movie.setRatings(4.8);
        movie.setCast(Arrays.asList("Actor1", "Actor2", "Actor3"));
        movie.setProducer("Test Productions");
        movie.setImageUri("https://www.spypoint.com/img/products/trail-cameras/cellulaire/LM2_2.png");

        return movie;
    }
}

