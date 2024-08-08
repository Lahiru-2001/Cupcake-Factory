package com.example.cupcake__aplication____.USER_;


import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.cupcake__aplication____.CLASS_.User.ListAdapter;
import com.example.cupcake__aplication____.CLASS_.User.listview;
import com.example.cupcake__aplication____.R;

import java.util.ArrayList;


public class ViewcupcakeActivity extends AppCompatActivity {

    ListView listView01;
    ArrayList<listview> categoryArrayList;
    ListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewcupcake);

        listView01=findViewById(R.id.listview);
        categoryArrayList=new ArrayList<>();

        categoryArrayList.add(new listview("Classic cupcakes",
                "Classic cupcakes:Timeless treats with traditional flavors, perfect for indulging in nostalgic sweetness." +"(Chocolate cupcakes,Vanilla cupcakes)"+
                        "Rs.150",R.drawable.cl));

        categoryArrayList.add(new listview("Themed cupcakes",
                "Rs.100",R.drawable.th));

        categoryArrayList.add(new listview("Birthday cupcakes",
                "Rs.200",R.drawable.b));

        categoryArrayList.add(new listview("Anniversary cupcakes",
                "Rs.250",R.drawable.image001));

        categoryArrayList.add(new listview("New Baby cupcakes",
        "Rs.200",R.drawable.n));

         categoryArrayList.add(new listview("Valentine’s Day cupcakes",
        "Rs.300", R.drawable.v));

         categoryArrayList.add(new listview("Graduation’s Day cupcakes",
        "Rs.250",R.drawable.g));

         categoryArrayList.add(new listview("Mother’s Day cupcakes",
        "Rs.150",R.drawable.m));


        adapter = new ListAdapter(ViewcupcakeActivity.this, categoryArrayList);
        listView01.setAdapter(adapter);
        listView01.setClickable(true);


        listView01.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent=new Intent(ViewcupcakeActivity.this,cupcakedetailsActivity.class);
                intent.putExtra(" cupcake_name",categoryArrayList.get(position).getCupcakeName());
                intent.putExtra( "details", categoryArrayList.get(position).getDetails());
                intent.putExtra( "imageID", categoryArrayList.get(position).getImageID());

                startActivity(intent);
            }
        });
     }

        }









