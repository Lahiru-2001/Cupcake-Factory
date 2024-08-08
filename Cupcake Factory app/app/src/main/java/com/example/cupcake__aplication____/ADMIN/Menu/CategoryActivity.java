package com.example.cupcake__aplication____.ADMIN.Menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.cupcake__aplication____.R;

public class CategoryActivity extends AppCompatActivity {

    Button ButtonCategoryADD,ButtonCategory_MANAGE,ButtonBACK;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        ButtonCategoryADD=(Button) findViewById(R.id.btn_CAT_ADD);
        ButtonCategory_MANAGE=(Button) findViewById(R.id.btn_CAT_MANAGEBut);
        ButtonBACK=(Button) findViewById(R.id.btn_CAT_BACK);

        ButtonCategoryADD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentAddCategory=new Intent(CategoryActivity.this, AddCategoryActivity.class);
                startActivity(intentAddCategory);

            }
        });

        ButtonBACK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentBA=new Intent(CategoryActivity.this, AD_MENU_Activity.class);
                startActivity(intentBA);

            }
        });



        ButtonCategory_MANAGE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentMA=new Intent(CategoryActivity.this, Man_Cate_Activity.class);
                startActivity(intentMA);

            }
        });
    }
}