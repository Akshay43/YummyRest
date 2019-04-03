package com.example.akluv.firebasesampleapp;

public class CategoryItem
{
        public String restaurantName, restaurantLocation, restaurantTimings;

    public CategoryItem(String restaurantName, String restaurantLocation, String restaurantTimings) {
        this.restaurantName = restaurantName;
        this.restaurantLocation = restaurantLocation;
        this.restaurantTimings = restaurantTimings;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getRestaurantLocation() {
        return restaurantLocation;
    }

    public void setRestaurantLocation(String restaurantLocation) {
        this.restaurantLocation = restaurantLocation;
    }

    public String getRestaurantTimings() {
        return restaurantTimings;
    }

    public void setRestaurantTimings(String restaurantTimings) {
        this.restaurantTimings = restaurantTimings;
    }
}
