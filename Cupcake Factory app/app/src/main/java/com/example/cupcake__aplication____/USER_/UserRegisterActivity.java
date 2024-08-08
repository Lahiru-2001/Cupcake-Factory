package com.example.cupcake__aplication____.USER_;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.cupcake__aplication____.CLASS_.User.UserClass;
import com.example.cupcake__aplication____.DATAB_.DBHelper;
import com.example.cupcake__aplication____.R;

public class UserRegisterActivity extends AppCompatActivity {

    EditText EdiTextUserID,EdiTextPassword,EdiTextConPassword;

    Button ButtonRegister,ButtonBack;

    private DBHelper dbHelper;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_register);

        EdiTextUserID=(EditText) findViewById(R.id.txt_USR_ID);
        EdiTextPassword=(EditText) findViewById(R.id.txt_USR_password);
        EdiTextConPassword=(EditText) findViewById(R.id.txt_USR_Confirm);
        ButtonRegister=(Button) findViewById(R.id.btn_USR_Register);
        ButtonBack=(Button) findViewById(R.id.btn_USR_Back);

        dbHelper=new DBHelper(this);
        dbHelper.OpenDB();


        ButtonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(EdiTextUserID.getText().toString().isEmpty()||EdiTextPassword.getText().toString().isEmpty()||
                EdiTextConPassword.getText().toString().isEmpty()){

                    Toast.makeText(getApplicationContext(), "FIELD CANNOT BE EMPTY", Toast.LENGTH_LONG).show();

                } else if (EdiTextPassword.getText().toString().length() < 4) {

                    Toast.makeText(getApplicationContext(), "Password must have more than 3 characters", Toast.LENGTH_LONG).show();
                } else if (!EdiTextPassword.getText().toString().
                        equals( EdiTextConPassword.getText().toString())) {
                    Toast.makeText(getApplicationContext(), "Password and confirm password should match", Toast.LENGTH_LONG).show();
                    
                }else {
                    UserClass user= new UserClass(EdiTextUserID.getText().toString(),EdiTextPassword.getText().toString());

                    if(dbHelper.Create_New_User(user)){
                        Toast.makeText(getApplicationContext(), "user create", Toast.LENGTH_LONG).show();

                    }else {
                        Toast.makeText(getApplicationContext(), "User failed", Toast.LENGTH_LONG).show();
                    }
                }
            }
        });

    }
}