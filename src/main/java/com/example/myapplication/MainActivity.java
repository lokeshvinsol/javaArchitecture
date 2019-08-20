package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Movies movies;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        movies = new Movies();
        List<MovieDetails> tollyWoodMoviesList = movies.getParticularCategoryMovie(MovieType.TOLLYWOOD.name());
        List<MovieDetails> bollyWoodMoviesList = movies.getParticularCategoryMovie(MovieType.BOLLYWOOD.name());
        List<MovieDetails> hollyWoodMoviesList = movies.getParticularCategoryMovie(MovieType.HOLLYWOOD.name());



    }
}
