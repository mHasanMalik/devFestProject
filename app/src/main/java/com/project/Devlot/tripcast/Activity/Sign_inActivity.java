package com.project.Devlot.tripcast.Activity;

import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.project.Devlot.tripcast.Helper.inputValidation;
import com.project.Devlot.tripcast.Model.URL;
import com.project.Devlot.tripcast.R;
import java.util.HashMap;
import java.util.Map;

public class Sign_inActivity extends AppCompatActivity implements View.OnClickListener {

    RequestQueue requestQueue;

    TextInputEditText email, password;
    TextInputLayout email_textView, password_textView;
    Button signIn;

    inputValidation _refValidation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        initializeWidgets();
        intializeObjects();
    }


    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.btn_signIn_xml)
        {
            if(!_refValidation.isInputEditTextFilled(email, email_textView,"Enter Email"))
            {
                return;
            }
            if(!_refValidation.isInputEditTextFilled(password, password_textView,"Enter Password"))
            {
                return;
            }


            /**
             *
             * CALLING PUBLIC DATABASE HERE
             * @func confirmUser();
             *
             * */

            confirmUser();
        }
    }


    private void confirmUser()
    {
        StringRequest request = new StringRequest(Request.Method.POST, URL.CHECK_USER, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {

                if(response.contains("false"))
                {
                    Toast.makeText(getApplicationContext(),"Wrong credentials",Toast.LENGTH_SHORT).show();
                    return;
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

                Toast.makeText(getApplicationContext(),"There appears to be a problem, Please try again", Toast.LENGTH_SHORT).show();
            }
        }) {

            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String,String> parameters = new HashMap<String, String>();

                parameters.put("email",email.getText().toString().trim());
                parameters.put("password",password.getText().toString().trim());

                return parameters;
            }
        };

        requestQueue.add(request);

    }


    private void intializeObjects(){

        requestQueue = Volley.newRequestQueue(this);
        _refValidation = new inputValidation(this);
    }


    public void initializeWidgets(){
        email = (TextInputEditText) findViewById(R.id.eT_email_signIn_xml);
        password = (TextInputEditText) findViewById(R.id.eT_password_signIn_xml);

        email_textView = (TextInputLayout) findViewById(R.id.tv_email_signIn_xml);
        password_textView = (TextInputLayout) findViewById(R.id.tv_password_signIn_xml);

        signIn = (Button) findViewById(R.id.btn_signIn_xml);

    }
}
