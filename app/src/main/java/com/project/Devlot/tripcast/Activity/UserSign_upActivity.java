package com.project.Devlot.tripcast.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.project.Devlot.tripcast.R;

public class UserSign_upActivity extends AppCompatActivity {

    EditText username, password, email, confirmPassword;
    Button signUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_sign_up);

        initializeWidgets();


    }

    public void initializeWidgets(){
        username = (EditText) findViewById(R.id.eT_userName_signUp_xml);
        email = (EditText) findViewById(R.id.eT_email_signUp_xml);
        password = (EditText) findViewById(R.id.eT_password_signUp_xml);
        confirmPassword = (EditText) findViewById(R.id.eT_confirmPassword_signUp_xml);
        signUp = (Button) findViewById(R.id.btn_signUp_xml);
    }

}
