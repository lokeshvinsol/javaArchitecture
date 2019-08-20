package com.example.myapplication;

public class Food {
    private String mFoodName;
    private Double mPrice;

    public Food(String mFoodName, Double mPrice) {
        this.mFoodName = mFoodName;
        this.mPrice = mPrice;
    }

    public String getmFoodName() {
        return mFoodName;
    }

    public void setmFoodName(String mFoodName) {
        this.mFoodName = mFoodName;
    }

    public Double getmPrice() {
        return mPrice;
    }

    public void setmPrice(Double mPrice) {
        this.mPrice = mPrice;
    }
}
