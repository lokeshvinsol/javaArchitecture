package com.example.myapplication;

public class MovieDetails {

    private String mName;
    private String mYear;
    private String mLanguage;
    private String mGenre;
    private String mReleaseDate;
    private String mMovieType;
    private Boolean isMovieBlockBuster;

    public MovieDetails() {
    }

    public MovieDetails(String mName, String mYear, String mLanguage, String mGenre, String mReleaseDate, String mMovieType) {
        this.mName = mName;
        this.mYear = mYear;
        this.mLanguage = mLanguage;
        this.mGenre = mGenre;
        this.mReleaseDate = mReleaseDate;
        this.mMovieType = mMovieType;
    }

    public String getName() {
        return mName;
    }

    public void setName(String mName) {
        this.mName = mName;
    }

    public String getYear() {
        return mYear;
    }

    public void setYear(String mYear) {
        this.mYear = mYear;
    }

    public String getLanguage() {
        return mLanguage;
    }

    public void setLanguage(String mLanguage) {
        this.mLanguage = mLanguage;
    }

    public String getGenre() {
        return mGenre;
    }

    public void setGenre(String mGenre) {
        this.mGenre = mGenre;
    }

    public String getReleaseDate() {
        return mReleaseDate;
    }

    public void setReleaseDate(String mReleaseDate) {
        this.mReleaseDate = mReleaseDate;
    }

    public String getMovieType() {
        return mMovieType;
    }

    public void setMovieType(String mMovieType) {
        this.mMovieType = mMovieType;
    }

    public Boolean isMovieBlockBuster() {
        if (isMovieBlockBuster == null) {
            if (Math.random() < 0.5)
                isMovieBlockBuster = false;
            else
                isMovieBlockBuster = true;
        }

        return isMovieBlockBuster;

    }
}
