package com.example.restapiwithretrofit;

public class Rating {
    private String rate;
    private String count;

    public Rating(String rate, String count) {
        this.rate = rate;
        this.count = count;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }
}
