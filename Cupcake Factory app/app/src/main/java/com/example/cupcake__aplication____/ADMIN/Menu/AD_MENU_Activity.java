package com.example.cupcake__aplication____.ADMIN.Menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.cupcake__aplication____.MAIN_.MainActivity;
import com.example.cupcake__aplication____.R;

public class AD_MENU_Activity extends AppCompatActivity {

    Button ButtonCategory,ButtonCupCake,ButtonLogOut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ad_menu);

        ButtonCategory=(Button) findViewById(R.id.btn_ADM_Category);
        ButtonCupCake=(Button) findViewById(R.id.btn_ADM_CupCake);
        ButtonLogOut=(Button) findViewById(R.id.btn_ADM_logOut);

        ButtonCategory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentCategory=new Intent(AD_MENU_Activity.this, CategoryActivity.class);
                startActivity(intentCategory);
            }
        });

        ButtonCupCake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentcup=new Intent(AD_MENU_Activity.this, cupcake_Activity.class);
                startActivity(intentcup);
            }
        });

        ButtonLogOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentout=new Intent(AD_MENU_Activity.this, MainActivity .class);
                startActivity(intentout);
            }
        });

    }
}