package com.example.cupcake__aplication____.CLASS_.Admin;

public class CategoryClass {


    private String CategoryId;
    private String CategoryName;

    public CategoryClass(){}
    public CategoryClass(String categoryId, String categoryName) {
        CategoryId = categoryId;
        CategoryName = categoryName;
    }

    public String getCategoryId() {
        return CategoryId;
    }

    public void setCategoryId(String categoryId) {
        CategoryId = categoryId;
    }

    public String getCategoryName() {
        return CategoryName;
    }

    public void setCategoryName(String categoryName) {
        CategoryName = categoryName;
    }
}
