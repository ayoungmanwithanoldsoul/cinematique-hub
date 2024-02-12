package edu.umindanao.cinematiquehub.controllers;

import edu.umindanao.cinematiquehub.models.Movie;
import edu.umindanao.cinematiquehub.ui.components.HoverCard;
import edu.umindanao.cinematiquehub.ui.components.MovieCardSample;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

public class MovieCardController implements Initializable {

    private HoverCard hoverCardSample;

    public MovieCardController(HoverCard hoverCardSample) {
        this.hoverCardSample = hoverCardSample;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Create test data
        Movie movie = createTestData();

        // Set movie details to the MovieCardSample
        hoverCardSample.setMovieDetails(movie);
    }

    private Movie createTestData() {
        Movie movie = new Movie();
        movie.setTitle("Test Movie");
        movie.setDescription("This is a test movie description. Dolor Sit Amet. Hello World, how is it going?");
        movie.setYear(2022);
        movie.setRatings(4.8);
        movie.setDuration(112.3);
        movie.setCast(Arrays.asList("Actor1", "Actor2", "Actor3"));
        movie.setProducer("Test Productions");
        movie.setImageUri("https://www.spypoint.com/img/products/trail-cameras/cellulaire/LM2_2.png");
        movie.setPrice(404.23);
        movie.setCategory("Action");

        return movie;
    }
}

