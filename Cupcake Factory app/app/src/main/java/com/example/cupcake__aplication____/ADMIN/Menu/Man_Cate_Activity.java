package com.example.cupcake__aplication____.ADMIN.Menu;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;


import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.example.cupcake__aplication____.CLASS_.Admin.CategoryClass;
import com.example.cupcake__aplication____.CLASS_.User.ListAdapter;
import com.example.cupcake__aplication____.CLASS_.User.listview;
import com.example.cupcake__aplication____.DATAB_.DBHelper;
import com.example.cupcake__aplication____.R;
import com.example.cupcake__aplication____.USER_.ViewcupcakeActivity;
import com.example.cupcake__aplication____.USER_.cupcakedetailsActivity;

import java.util.ArrayList;

public class Man_Cate_Activity extends AppCompatActivity {

    ListView listView01;
    ArrayList<listview> categoryArrayList;
    ListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage_category);

        listView01 = findViewById(R.id.listview1);
        categoryArrayList = new ArrayList<>();

        categoryArrayList.add(new listview("Classic cupcakes",
                "Classic cupcakes:Timeless treats with traditional flavors, perfect for indulging in nostalgic sweetness." + "(Chocolate cupcakes,Vanilla cupcakes)" +
                        "Rs.150", R.drawable.cl));

        categoryArrayList.add(new listview("Themed cupcakes",
                "Rs.100", R.drawable.th));

        categoryArrayList.add(new listview("Birthday cupcakes",
                "Rs.200", R.drawable.b));

        categoryArrayList.add(new listview("Anniversary cupcakes",
                "Rs.250", R.drawable.image001));

        categoryArrayList.add(new listview("New Baby cupcakes",
                "Rs.200", R.drawable.n));

        categoryArrayList.add(new listview("Valentine’s Day cupcakes",
                "Rs.300", R.drawable.v));

        categoryArrayList.add(new listview("Graduation’s Day cupcakes",
                "Rs.250", R.drawable.g));

        categoryArrayList.add(new listview("Mother’s Day cupcakes",
                "Rs.150", R.drawable.m));


        adapter = new ListAdapter(Man_Cate_Activity.this, categoryArrayList);
        listView01.setAdapter(adapter);
        listView01.setClickable(true);


        listView01.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent=new Intent(Man_Cate_Activity.this, cupcakedetailsActivity.class);
                intent.putExtra(" cupcake_name",categoryArrayList.get(position).getCupcakeName());
                intent.putExtra( "details", categoryArrayList.get(position).getDetails());
                intent.putExtra( "imageID", categoryArrayList.get(position).getImageID());

                startActivity(intent);
            }
        });

        listView01.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, final int position, long id) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Man_Cate_Activity.this);
                builder.setTitle("Delete Category");
                builder.setMessage("Are you sure you want to delete this category?");
                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // Remove the item from the ArrayList
                        categoryArrayList.remove(position);
                        // Notify the adapter that the data set has changed
                        adapter.notifyDataSetChanged();
                        // Optionally, you can also delete the category from your database here
                        // Remember to update your database accordingly
                        Toast.makeText(Man_Cate_Activity.this, "Category deleted", Toast.LENGTH_SHORT).show();
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
