package com.example.cupcake__aplication____.USER_;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cupcake__aplication____.R;

public class cupcakedetailsActivity extends AppCompatActivity {

    ImageView details_image;

    TextView cupcakename,details;

    String name,details_;

    int im_01;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cupcakedetails);

        cupcakename = findViewById(R.id.txt_name);
        details = findViewById(R.id.txt_details);
        details_image = findViewById(R.id.details_image);

        Intent intent=getIntent();
        name=intent.getStringExtra("cupcake_name");
        details_=intent.getStringExtra("details");
        im_01=intent.getIntExtra("imageID", 0);

        cupcakename.setText(name);
        details.setText(details_);
        details_image.setImageResource(im_01);
    }
}