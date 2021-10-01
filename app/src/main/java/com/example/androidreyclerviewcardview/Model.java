package com.example.androidreyclerviewcardview;

public class Model {

    int image1;
    String title;

    public Model() {
    }

    public Model(int image1, String title) {
        this.image1 = image1;
        this.title = title;
    }

    public int getImage1() {
        return image1;
    }

    public void setImage1(int image1) {
        this.image1 = image1;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
