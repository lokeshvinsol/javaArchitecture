package com.example.myapplication;

public enum MovieType {

    TOLLYWOOD("Dosa"), BOLLYWOOD("Dal Makhani"), HOLLYWOOD("Pepper Steak") ;

    private String mFreeFoodDish;

    MovieType(String mFreeFoodDish) {
        this.mFreeFoodDish = mFreeFoodDish;
    }

    public String getFreeFoodDish() {
        return mFreeFoodDish;
    }
}
