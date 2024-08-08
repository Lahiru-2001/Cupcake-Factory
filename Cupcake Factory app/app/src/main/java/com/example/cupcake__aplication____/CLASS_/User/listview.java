package com.example.cupcake__aplication____.CLASS_.User;

public class listview {

    private String cupcake_name;
    private String details;
    private int imageID;

    public listview(String cupcake_name, String details, int imageID) {
        this.cupcake_name = cupcake_name;
        this.details = details;
        this.imageID = imageID;
    }

    public String getCupcakeName() {
        return cupcake_name;
    }

    public String getDetails() {
        return details;
    }

    public int getImageID() {
        return imageID;

    }
}
