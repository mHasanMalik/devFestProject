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

public class UserSign_upActivity extends AppCompatActivity implements View.OnClickListener{

    RequestQueue requestQueue;
    inputValidation _refValidation;

    TextInputEditText username, password, email, confirmPassword;
    TextInputLayout username_textView, password_textView, email_textView, confirmPassword_textView;
    Button signUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_sign_up);

        initializeWidgets();

        initializeObject();

    }

    public void initializeWidgets()
    {
        username        = (TextInputEditText) findViewById(R.id.eT_userName_signUp_xml);
        email           = (TextInputEditText) findViewById(R.id.eT_email_signUp_xml);
        password        = (TextInputEditText) findViewById(R.id.eT_password_signUp_xml);
        confirmPassword = (TextInputEditText) findViewById(R.id.eT_confirmPassword_signUp_xml);

        username_textView = (TextInputLayout) findViewById(R.id.tv_userName_signUp_xml);
        email_textView    = (TextInputLayout) findViewById(R.id.tv_email_signUp_xml);
        password_textView = (TextInputLayout) findViewById(R.id.tv_password_signUp_xml);
        confirmPassword_textView = (TextInputLayout) findViewById(R.id.tv_confirmPassword_signUp_xml);

        signUp = (Button) findViewById(R.id.btn_signUp_xml);
    }

    private void initializeObject()
    {
        _refValidation = new inputValidation(this);
        requestQueue = Volley.newRequestQueue(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btn_signUp_xml)
        {

            if(!_refValidation.isInputEditTextFilled(username, username_textView, "Enter Name"))
            {
                return;
            }
            if(!_refValidation.isInputEditTextFilled(email, email_textView, "Enter Email"))
            {
                return;
            }
            if(!_refValidation.isInputEditTextFilled(password, password_textView, "Enter Password"))
            {
                return;
            }
            if(!_refValidation.isInputEditTextFilled(confirmPassword, confirmPassword_textView, "Enter Password Again"))
            {
                return;
            }
            if(!_refValidation.isInputEditTextMatches(password,confirmPassword,confirmPassword_textView,"Entered Password do not match"))
            {
                return;
            }
            if(!_refValidation.isInputEditTextEmail(email,email_textView,"Enter Valid Email"))
            {
                return;
            }

            /**
             * ACCESSING EXTERNAL DATABASE HERE
             *
             * @func insertUser();
             * */

            insertUser();
        }
    }

    private void insertUser()
    {
        StringRequest request = new StringRequest(Request.Method.POST, URL.INSERT_USER, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {

                if(response.contains("Failed"))
                {
                    Toast.makeText(getApplicationContext(),"There Appears to be a problem, Please try again later",Toast.LENGTH_SHORT).show();
                    return;
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getApplicationContext(),"There Appears to be a problem, Please try again later",Toast.LENGTH_SHORT).show();
            }
        }){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String,String> parameters = new HashMap<String, String>();
                parameters.put("name",username.getText().toString().trim());
                parameters.put("email",email.getText().toString().trim());
                parameters.put("password",password.getText().toString().trim());

                return parameters;
            }
        };

        requestQueue.add(request);
    }
}
