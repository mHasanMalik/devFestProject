package com.project.Devlot.tripcast.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.project.Devlot.tripcast.R;

public class Sign_inActivity extends AppCompatActivity {

    EditText email, password;
    Button signIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        initializeWidgets();
    }

    public void initializeWidgets(){
        email = (EditText) findViewById(R.id.eT_email_signIn_xml);
        password = (EditText) findViewById(R.id.eT_password_signIn_xml);
        signIn = (Button) findViewById(R.id.btn_signIn_xml);

    }
}
