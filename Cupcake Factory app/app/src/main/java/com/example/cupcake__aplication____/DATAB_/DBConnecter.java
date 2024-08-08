package com.example.cupcake__aplication____.DATAB_;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBConnecter extends SQLiteOpenHelper {

    public DBConnecter(Context context) {

        super(context, "FACTORY_DB__01", null, 1);


    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table User_Info_Table (UserID VARCHAR PRIMARY KEY NOT NULL, Password VARCHAR)");
        db.execSQL("CREATE TABLE Category (CategoryID VARCHAR PRIMARY KEY NOT NULL, CategoryName VARCHAR)");
        db.execSQL("create table Cup_Cake_Table (CupCakeID VARCHAR PRIMARY KEY NOT NULL, CupCakeName VARCHAR, CategoryID VARCHAR, Price VARCHAR,FOREIGN KEY(CategoryID) REFERENCES CategoryTable(CategoryID))");



    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
