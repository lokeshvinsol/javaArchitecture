package com.example.myapplication;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Movies {

    private static HashMap<String, List<MovieDetails>> mMovieList;


    static {
        mMovieList.put(MovieType.TOLLYWOOD.name(), new ArrayList<MovieDetails>());
        mMovieList.put(MovieType.BOLLYWOOD.name(), new ArrayList<MovieDetails>());
        mMovieList.put(MovieType.HOLLYWOOD.name(), new ArrayList<MovieDetails>());
    }


    public List<MovieDetails> getParticularCategoryMovie(String category) {
        return mMovieList.get(category);
    }

    public HashMap<String, List<MovieDetails>> getAllMoviesList() {
        return mMovieList;
    }

    public List<MovieDetails> getAllMovieDetailsList() {
        List<MovieDetails> mAllMovieDetailsList = new ArrayList<>();
        for (Map.Entry<String, List<MovieDetails>> entry : mMovieList.entrySet()) {
            List<MovieDetails> details = entry.getValue();
            mAllMovieDetailsList.addAll(details);
        }
        return mAllMovieDetailsList;
    }
}
