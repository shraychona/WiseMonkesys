package com.shray.wisemonkeys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static android.R.attr.id;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    EditText email,password;
    Button login;
    String mEmail,mPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email=(EditText)findViewById(R.id.email);
        password=(EditText)findViewById(R.id.password);
        login=(Button)findViewById(R.id.loginBtn);
        login.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (id){
            case R.id.loginBtn:
                mEmail=email.getText().toString().trim();
                mPassword=password.getText().toString().trim();
                System.out.println(mEmail+" "+mPassword);
                break;

        }

    }
}
