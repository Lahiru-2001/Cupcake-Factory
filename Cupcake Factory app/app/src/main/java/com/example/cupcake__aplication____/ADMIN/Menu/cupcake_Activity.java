package com.example.cupcake__aplication____.ADMIN.Menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.cupcake__aplication____.R;

public class cupcake_Activity extends AppCompatActivity {

    Button ButtonCupcakeADD,Buttoncupcake_MANAGE,ButtonBACK;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cupcake);

        ButtonCupcakeADD=(Button) findViewById(R.id.btn_CUP_ADD);
        Buttoncupcake_MANAGE=(Button) findViewById(R.id.btn_CUP_MANAGEBut);
        ButtonBACK=(Button) findViewById(R.id.btn_CUP_BACK);


        ButtonCupcakeADD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentAddC=new Intent(cupcake_Activity.this, AddCupcakeActivity.class);
                startActivity(intentAddC);
            }
        });

        Buttoncupcake_MANAGE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentAddC=new Intent(cupcake_Activity.this, manage_cupcake_Activity.class);
                startActivity(intentAddC);
            }
        });

        ButtonBACK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentAddC=new Intent(cupcake_Activity.this, AD_MENU_Activity.class);
                startActivity(intentAddC);
            }
        });
    }
}