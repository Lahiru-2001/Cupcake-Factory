package com.example.cupcake__aplication____.ADMIN.Login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.cupcake__aplication____.ADMIN.Menu.AD_MENU_Activity;
import com.example.cupcake__aplication____.MAIN_.MainActivity;
import com.example.cupcake__aplication____.R;

public class ADLoginActivity extends AppCompatActivity {

    EditText EditTextUserName,EditeTextPassword;

    Button ButtonAdminLogin,ButtonAdminBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adlogin);

        EditTextUserName=(EditText) findViewById(R.id.txt_AD_Usernam);
        EditeTextPassword=(EditText) findViewById(R.id.txt_AD_Password);
        ButtonAdminLogin=(Button) findViewById(R.id.btn_AD_login);
        ButtonAdminBack=(Button) findViewById(R.id.btn_AD_Back);

        ButtonAdminLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (EditTextUserName.getText().toString().equals("")){

                    Toast.makeText(getApplicationContext(),"filed can not be blank",Toast.LENGTH_LONG).show();

                } else if (EditeTextPassword.getText().toString().equals("")) {

                    Toast.makeText(getApplicationContext(),"filed can not be blank",Toast.LENGTH_LONG).show();

                } else if (EditTextUserName.getText().toString().equals("Admin") &&(EditeTextPassword.getText().toString().equals("1234"))){

                    Toast.makeText(getApplicationContext(),"Valide login",Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(getApplicationContext(),"your password or username is wrong",Toast.LENGTH_LONG).show();
                }
                if(EditTextUserName.getText().toString().equals("Admin")&&(EditeTextPassword.getText().toString().equals("1234")))
                {
                    Intent intentMenu=new Intent(ADLoginActivity.this, AD_MENU_Activity.class);
                    startActivity(intentMenu);
                }else {
                    Toast.makeText(getApplicationContext(),"your password or username is wrong",Toast.LENGTH_LONG).show();
                }
            }

        });

        ButtonAdminBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentMenu=new Intent(ADLoginActivity.this, MainActivity.class);
                startActivity(intentMenu);

            }
        });
    }
}