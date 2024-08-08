package com.example.cupcake__aplication____.ADMIN.Menu;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.cupcake__aplication____.CLASS_.User.ListAdapter;
import com.example.cupcake__aplication____.CLASS_.User.listview;
import com.example.cupcake__aplication____.R;
import com.example.cupcake__aplication____.USER_.cupcakedetailsActivity;

import java.util.ArrayList;

public class manage_cupcake_Activity extends AppCompatActivity {

    ListView listView01;
    ArrayList<listview> categoryArrayList;
    ListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage_cupcake);

        listView01 = findViewById(R.id.listview2);
        categoryArrayList = new ArrayList<>();

        categoryArrayList.add(new listview("Peppermint Chocolate Cupcake",

                        "", R.drawable.cl));

        categoryArrayList.add(new listview("Carrot Cake Cupcake",
                "", R.drawable.th));

        categoryArrayList.add(new listview("Chocolate Birthday Cupcake",
                "", R.drawable.b));

        categoryArrayList.add(new listview("Mexican Hot Chocolate Cupcake",
                "", R.drawable.image001));

        categoryArrayList.add(new listview("Red Velvet Cupcake",
                "", R.drawable.n));

        categoryArrayList.add(new listview("Rose Garden Cupcake",
                "", R.drawable.v));


        adapter = new ListAdapter(manage_cupcake_Activity.this, categoryArrayList);
        listView01.setAdapter(adapter);
        listView01.setClickable(true);


        listView01.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent=new Intent(manage_cupcake_Activity.this, cupcakedetailsActivity.class);
                intent.putExtra(" cupcake_name",categoryArrayList.get(position).getCupcakeName());
                intent.putExtra( "details", categoryArrayList.get(position).getDetails());
                intent.putExtra( "imageID", categoryArrayList.get(position).getImageID());

                startActivity(intent);
            }
        });

        listView01.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, final int position, long id) {
                AlertDialog.Builder builder = new AlertDialog.Builder(manage_cupcake_Activity.this);
                builder.setTitle("Delete Cupcake");
                builder.setMessage("Are you sure you want to delete this cupcake?");
                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // Remove the item from the ArrayList
                        categoryArrayList.remove(position);
                        // Notify the adapter that the data set has changed
                        adapter.notifyDataSetChanged();
                        // Optionally, you can also delete the category from your database here
                        // Remember to update your database accordingly
                        Toast.makeText(manage_cupcake_Activity.this, "cupcake deleted", Toast.LENGTH_SHORT).show();
                    }
                });
                builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
                builder.create().show();
                return true;
            }
        });


    }

}
