package com.project.Devlot.tripcast.Activity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.project.Devlot.tripcast.R;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TripDetailsActivity extends AppCompatActivity {

    private static final int CAM_REQUEST = 200;
    private static final int GALLERY_REQUEST = 400;

    private Boolean isFabOpen = false;
    private FloatingActionButton addFab,cameraFab,locationFab,noteFab,tagFriendFab,photosFab;
    private Animation fab_open,fab_close,rotate_forward,rotate_backward;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addFab = (FloatingActionButton)findViewById(R.id.ic_addFab_tripDetails_xml);
        cameraFab = (FloatingActionButton)findViewById(R.id.ic_cameraFab_tripDetails_xml);
        locationFab = (FloatingActionButton)findViewById(R.id.ic_locationsFab_tripDetails_xml);
        noteFab = (FloatingActionButton)findViewById(R.id.ic_noteFab_tripDetails_xml);
        tagFriendFab = (FloatingActionButton)findViewById(R.id.ic_tag_friendsFab_tripDetails_xml);
        photosFab = (FloatingActionButton)findViewById(R.id.ic_photosFab_tripDetails_xml);


        fab_open = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fab_open);
        fab_close = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fab_close);
        rotate_forward = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate_forward);
        rotate_backward = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate_backward);
        addFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animateFAB();

            }
        });
        cameraFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                startActivityForResult(intent,CAM_REQUEST);
            }
        });
        locationFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        noteFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        tagFriendFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        photosFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(intent,GALLERY_REQUEST);

            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == CAM_REQUEST && resultCode == RESULT_OK){

            Bitmap bitmap = (Bitmap)data.getExtras().get("data");   //YEH HE WOH PHOTO JO SERVER PER BHEJNI HE
            String pathFileName = currentDateFormat();
            storeCameraPhotoInSDCard(bitmap,pathFileName);

        }
        else if(requestCode == GALLERY_REQUEST && resultCode == RESULT_OK){

            Uri uri = data.getData();
            try {
                Bitmap bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(),uri);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private String currentDateFormat(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_HH_mm_ss");
        String  currentTimeStamp = dateFormat.format(new Date());
        return currentTimeStamp;

    }

    private void storeCameraPhotoInSDCard(Bitmap bitmap, String currentDate){
        MediaStore.Images.Media.insertImage(getContentResolver(), bitmap, "photo_" + currentDate + ".jpg" , "abc");
    }


    public void animateFAB(){

        if(isFabOpen){

            addFab.startAnimation(rotate_backward);
            cameraFab.startAnimation(fab_close);
            tagFriendFab.startAnimation(fab_close);
            photosFab.startAnimation(fab_close);
            locationFab.startAnimation(fab_close);
            noteFab.startAnimation(fab_close);

            cameraFab.setClickable(false);
            tagFriendFab.setClickable(false);
            photosFab.setClickable(false);
            locationFab.setClickable(false);
            noteFab.setClickable(false);
            isFabOpen = false;

        } else {

            addFab.startAnimation(rotate_forward);
            cameraFab.startAnimation(fab_open);
            tagFriendFab.startAnimation(fab_open);
            photosFab.startAnimation(fab_open);
            locationFab.startAnimation(fab_open);
            noteFab.startAnimation(fab_open);

            cameraFab.setClickable(true);
            tagFriendFab.setClickable(true);
            photosFab.setClickable(true);
            locationFab.setClickable(true);
            noteFab.setClickable(true);
            isFabOpen = true;

        }
    }
}
