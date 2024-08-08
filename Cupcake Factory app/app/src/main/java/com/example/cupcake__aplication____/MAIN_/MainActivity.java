package com.example.cupcake__aplication____.MAIN_;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.cupcake__aplication____.ADMIN.Login.ADLoginActivity;
import com.example.cupcake__aplication____.R;
import com.example.cupcake__aplication____.USER_.USERLoginActivity;

public class MainActivity extends AppCompatActivity {

    Button ButtonAdminLogin,ButtonUserLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButtonAdminLogin=(Button) findViewById(R.id.btn_MAIN_AD_);
        ButtonUserLogin=(Button) findViewById(R.id.btn_MA_User__);


        ButtonAdminLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentAdminLogin=new Intent(MainActivity.this, ADLoginActivity.class);
                startActivity(intentAdminLogin);
            }
        });

        ButtonUserLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentUserLogin=new Intent(MainActivity.this, USERLoginActivity.class);
                startActivity(intentUserLogin);

            }
        });

    }
}