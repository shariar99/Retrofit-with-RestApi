package com.example.restapiwithretrofit;



public class postPojo {
    private String title;
    private String image;
    private Rating rating;
    private String price;
    private String description;

    public postPojo(String title, String image, Rating rating, String price, String description) {
        this.title = title;
        this.image = image;
        this.rating = rating;
        this.price = price;
        this.description = description;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
