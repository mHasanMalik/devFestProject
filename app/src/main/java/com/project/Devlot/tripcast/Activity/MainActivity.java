package com.project.Devlot.tripcast.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.project.Devlot.tripcast.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button getStarted_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createView();
        initializeObjects();
    }


    private void createView()
    {
        getStarted_button = (Button) findViewById(R.id.getStarted_Button_main_xml);
    }

    private void initializeObjects()
    {

    }

    @Override
    public void onClick(View v) {
        //if(v.getId()
    }
}
