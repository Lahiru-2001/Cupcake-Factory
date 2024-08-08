package com.example.cupcake__aplication____.USER_;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.cupcake__aplication____.ADMIN.Menu.AD_MENU_Activity;
import com.example.cupcake__aplication____.ADMIN.Menu.CategoryActivity;
import com.example.cupcake__aplication____.R;

public class UserMenuActivity extends AppCompatActivity {

    Button ButtonView_cup_cake,ButtonOder_CupCake,Button_logout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_menu);


        ButtonView_cup_cake=(Button) findViewById(R.id.btn_USER_CUPCAKE);
        ButtonOder_CupCake=(Button) findViewById(R.id.btn_USER_ODER_CUPCAKE);

        Button_logout=(Button) findViewById(R.id.btn_USER_logOut);

        //about the cupcakes
        ButtonView_cup_cake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentViewcup=new Intent(UserMenuActivity.this,ViewcupcakeActivity.class);
                startActivity(intentViewcup);


            }
        });

        //oder the cupcakes

        ButtonOder_CupCake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentmenu=new Intent(UserMenuActivity.this, OderCupcake.class);
                startActivity(intentmenu);

            }
        });
    }
}