package com.ahercde.aherfood.model;

public class RecommendedFood {

    String name;
    String price;
    String rating;
    String restaurantname;
    Integer imageUrl;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getRestaurantname() {
        return restaurantname;
    }

    public void setRestaurantname(String restaurantname) {
        this.restaurantname = restaurantname;
    }

    public Integer getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(Integer imageUrl) {
        this.imageUrl = imageUrl;
    }

    public RecommendedFood(String name, String price, String rating, String restaurantname, Integer imageUrl) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.restaurantname = restaurantname;
        this.imageUrl = imageUrl;
    }



}
