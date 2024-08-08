package com.example.cupcake__aplication____.USER_;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.cupcake__aplication____.CLASS_.User.UserClass;
import com.example.cupcake__aplication____.DATAB_.DBHelper;
import com.example.cupcake__aplication____.MAIN_.MainActivity;
import com.example.cupcake__aplication____.R;

import java.util.ArrayList;

public class USERLoginActivity extends AppCompatActivity {

    EditText EdittextUserID,EdittextPassword;

    Button ButtonLogin,ButtonRegister,ButtonBack;

    private DBHelper dbHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userlogin);

        EdittextUserID=(EditText) findViewById(R.id.txt_US_Name);
        EdittextPassword=(EditText) findViewById(R.id.txt_US_password);
        ButtonLogin=(Button) findViewById(R.id.btn_US_login);
        ButtonRegister=(Button) findViewById(R.id.btn_US_Register);
        ButtonBack=(Button) findViewById(R.id.btn_US_Back);

        dbHelper=new DBHelper(this);
        dbHelper.OpenDB();

        ButtonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ArrayList<UserClass> userDetails =
                        dbHelper.ValidLogin(EdittextUserID.getText().toString(), EdittextPassword.getText().toString());
                Toast.makeText(getApplicationContext(), "FIELD CANNOT BE EMPTY", Toast.LENGTH_LONG).show();
                if(userDetails.size()!=0)
                {
                    UserClass user= userDetails.get(0);
                    String UserId= user.getUserId(); //Admin

                    Toast.makeText(getApplicationContext(), "User Found"+ UserId, Toast.LENGTH_LONG).show();

                        Intent intentAdmin= new Intent(USERLoginActivity.this, UserMenuActivity.class);
                        startActivity(intentAdmin);
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Invalid User", Toast.LENGTH_LONG).show();
                }
            }
        });

        ButtonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRegister=new Intent(USERLoginActivity.this, UserRegisterActivity.class);
                startActivity(intentRegister);
            }
        });

        ButtonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentLoginb=new Intent(USERLoginActivity.this, MainActivity.class);
                startActivity(intentLoginb);
            }
        });
    }
}