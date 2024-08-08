package com.example.cupcake__aplication____.DATAB_;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.cupcake__aplication____.CLASS_.Admin.CategoryClass;
import com.example.cupcake__aplication____.CLASS_.Admin.Cupcake_Class;
import com.example.cupcake__aplication____.CLASS_.User.UserClass;

import java.util.ArrayList;
import java.util.Vector;

public class DBHelper {

    private Context context;

    private SQLiteDatabase dbDatabase;


    public DBHelper(Context context) {
        this.context = context;


    }

    public DBHelper OpenDB() {

        DBConnecter dbCon = new DBConnecter(context);
        dbDatabase = dbCon.getWritableDatabase();
        return this;


    }
    ////////////////////////////////////////////////////////////////////////

    //User login
    public boolean  Create_New_User(UserClass userClass) {

        try {
            String query = "INSERT INTO User_Info_Table (UserID, Password) VALUES (?, ?)";
            dbDatabase.execSQL(query, new Object[]{userClass.getUserId(), userClass.getPassword()});
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }

    }

    public ArrayList<UserClass> ValidLogin(String UserId, String Password)
    {
        ArrayList<UserClass> userList = new ArrayList<UserClass>();
        try {
            Cursor cursor = dbDatabase.rawQuery("Select * from User_Info_Table where UserId= '" +  UserId+ "' and Password='" + Password + "' ", null);

            if (cursor.moveToFirst()) //True
            {
                do {
                    UserClass user = new UserClass();
                    user.setUserId(cursor.getString(0)); //U001
                    user.setPassword(cursor.getString(1)); //123
                    userList.add(user);
                }
                while (cursor.moveToNext()); //False
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return userList;
    }

    /////////////////////////////////////////////////////////////////////////////////////

    //Category add
    public boolean CreateNewCategory(CategoryClass categoryClass) {
        try {
            String query = "INSERT INTO Category (CategoryID, CategoryName) VALUES (?, ?)";
            dbDatabase.execSQL(query, new Object[]{categoryClass.getCategoryId(), categoryClass.getCategoryName()});
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    //new CupCake add
    public boolean CreateNewCupcake(Cupcake_Class cupcake_class) {

        try {
            dbDatabase.execSQL("insert into Cup_Cake_Table values('" + cupcake_class.getCupCakeId() + "','" + cupcake_class.getCupCakeName() + "','" + cupcake_class.getCupCakeId() +"','"+cupcake_class.getCup_Price()+ "')");
            return true;

        } catch (Exception ex) {
            ex.printStackTrace();

            return false;

        }
    }


}
