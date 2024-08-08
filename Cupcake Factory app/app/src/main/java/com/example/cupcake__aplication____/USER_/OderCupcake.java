package com.example.cupcake__aplication____.USER_;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.cupcake__aplication____.R;

import java.util.ArrayList;

public class OderCupcake extends AppCompatActivity {

    Spinner spinnerCategory;
    RadioButton radioButtonItem01, radioButtonItem02;
    EditText editTextItems;
    TextView textViewPrice;
    Button buttonOrder, buttonBack;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oder_cupcake);

        spinnerCategory = findViewById(R.id.sp_category);
        radioButtonItem01 = findViewById(R.id.Item1);
        radioButtonItem02 = findViewById(R.id.item2);
        editTextItems = findViewById(R.id.txt_item_add);
        textViewPrice = findViewById(R.id.totaoprice);
        buttonOrder = findViewById(R.id.btn_oder);

        spinnerCategory.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                String item = adapterView.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Classic cupcakes");
        arrayList.add("Themed cupcakes");
        arrayList.add("Birthday cupcakes");
        arrayList.add("Anniversary cupcakes");
        arrayList.add("New Baby cupcakes");
        arrayList.add("Valentine’s Day cupcakes");
        arrayList.add("Graduation Day cupcakes");
        arrayList.add("Mother’s Day cupcakes");
        ArrayAdapter<String> adapter=new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,arrayList);



    }
}
