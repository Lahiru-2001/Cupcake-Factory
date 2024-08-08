package com.example.cupcake__aplication____.ADMIN.Menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.cupcake__aplication____.CLASS_.Admin.CategoryClass;
import com.example.cupcake__aplication____.CLASS_.Admin.Cupcake_Class;
import com.example.cupcake__aplication____.DATAB_.DBHelper;
import com.example.cupcake__aplication____.R;

import java.util.Vector;

public class AddCupcakeActivity extends AppCompatActivity {


    EditText EditTextCupID,EditTextCupName,EditTextCategory_ID,EditTextPrice;

    Button ButtonCupAdd,ButtonCupBack;



    private DBHelper dbHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_cupcake);

        EditTextCupID=(EditText) findViewById(R.id.txt_CUP_ID);
        EditTextCupName=(EditText) findViewById(R.id.txt_CUP_NAME);
        EditTextCategory_ID=(EditText) findViewById(R.id.txt_CUP_CAT_ID);
        EditTextPrice=(EditText) findViewById(R.id.txt_CUP_PRICE);
        ButtonCupAdd=(Button) findViewById(R.id.btn_CUP_ADD);
        ButtonCupBack=(Button) findViewById(R.id.btn_CUP_BACK);

        dbHelper= new DBHelper(this);
        dbHelper.OpenDB();



        ButtonCupAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(EditTextCupID.getText().toString().isEmpty()|| EditTextCupName.getText().toString().isEmpty()||EditTextCategory_ID.getText().toString().isEmpty()||
                EditTextPrice.getText().toString().isEmpty()){

                    Toast.makeText(getApplicationContext(), "FIELD CANNOT BE EMPTY", Toast.LENGTH_LONG).show();
                }else {

                    Cupcake_Class cupcake = new Cupcake_Class(EditTextCupID.getText().toString(),EditTextCupName.getText().toString(),
                            EditTextCategory_ID.getText().toString(),EditTextPrice.getText().toString());

                    if (dbHelper.CreateNewCupcake(cupcake)) {
                        Toast.makeText(getApplicationContext(), "NEW CUPCAKE ADDED ", Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(getApplicationContext(), "CUPCAKE ADDING FAILED", Toast.LENGTH_LONG).show();
                    }
                }




            }
        });

        ButtonCupBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intentcup=new Intent(AddCupcakeActivity.this, AD_MENU_Activity.class);
                startActivity(intentcup);
            }
        });
    }
}