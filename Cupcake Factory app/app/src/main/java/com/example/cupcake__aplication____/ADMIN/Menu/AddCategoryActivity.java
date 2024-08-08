package com.example.cupcake__aplication____.ADMIN.Menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.cupcake__aplication____.CLASS_.Admin.CategoryClass;
import com.example.cupcake__aplication____.DATAB_.DBHelper;
import com.example.cupcake__aplication____.R;

public class AddCategoryActivity extends AppCompatActivity {

    EditText EdittextCategoryId,EdittextCategoryName;

    Button ButtonAdd,ButtonBack;

    private DBHelper dbHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_category);

        EdittextCategoryId=(EditText)findViewById(R.id.txt_ADC_ID) ;
        EdittextCategoryName=(EditText) findViewById(R.id.txt_ADC_NAME);
        ButtonAdd=(Button) findViewById(R.id.btn_ADC_ADD);
        ButtonBack=(Button) findViewById(R.id.btn_ADC_BACK);

        dbHelper= new DBHelper(this);
        dbHelper.OpenDB();

        ButtonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(EdittextCategoryId.getText().toString().isEmpty() ||
                        EdittextCategoryName.getText().toString().isEmpty()  )
                {
                    Toast.makeText(getApplicationContext(),
                            "Fields Can't be blank",Toast.LENGTH_LONG).show();
                }
                else {
                    CategoryClass category = new CategoryClass(
                            EdittextCategoryId.getText().toString(),
                            EdittextCategoryName.getText().toString());

                    if (dbHelper.CreateNewCategory(category)) {
                        Toast.makeText(getApplicationContext(),
                                "New Category insert ", Toast.LENGTH_LONG).show();

                    } else {
                        Toast.makeText(getApplicationContext(), "Failed",
                                Toast.LENGTH_LONG).show();
                    }
                }



            }
        });

        ButtonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentAddCategory=new Intent(AddCategoryActivity.this, CategoryActivity.class);
                startActivity(intentAddCategory);

            }
        });



    }
}