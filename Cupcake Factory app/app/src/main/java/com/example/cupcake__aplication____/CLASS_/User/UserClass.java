package com.example.cupcake__aplication____.CLASS_.User;

public class UserClass {

    private String UserId;
    private String Password;


    public UserClass(){}
    public UserClass(String userId, String password) {
        UserId = userId;
        Password = password;
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
