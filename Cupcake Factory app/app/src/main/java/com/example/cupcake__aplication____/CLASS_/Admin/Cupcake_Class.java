package com.example.cupcake__aplication____.CLASS_.Admin;

public class Cupcake_Class {

    private String CupCakeId;
    private String CupCakeName;
    private String CategoryId;

    private String Cup_Price;



    public Cupcake_Class(){}
    public Cupcake_Class(String cupcakeId, String cupcakeName,String categoryId, String cup_price) {

        CupCakeId=cupcakeId;
        CupCakeName= cupcakeName;
        CategoryId = categoryId;
        Cup_Price=cup_price;


    }

    public String getCupCakeId() {
        return CupCakeId;
    }

    public void setCupCakeId(String cupCakeId) {
        CupCakeId = cupCakeId;
    }

    public String getCupCakeName() {
        return CupCakeName;
    }

    public void setCupCakeName(String cupCakeName) {
        CupCakeName = cupCakeName;
    }

    public String getCategoryId() {
        return CategoryId;
    }

    public void setCategoryId(String categoryId) {
        CategoryId = categoryId;
    }

    public String getCup_Price() {
        return Cup_Price;
    }

    public void setCup_Price(String cup_Price) {
        Cup_Price = cup_Price;
    }
}
