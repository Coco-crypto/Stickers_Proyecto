package com.example.samplestickerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;

public class select_activity extends AppCompatActivity {
    ImageButton img,img2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_activity);


    img =(ImageButton) findViewById(R.id.imageButton3);
    img2 =(ImageButton)findViewById(R.id.imageButton4);
        Animation animacion1 = AnimationUtils.loadAnimation(this,R.anim.desplazamiento_arriba);
        Animation animacion2 = AnimationUtils.loadAnimation(this,R.anim.desplazamiento_abajo);

       img.setAnimation(animacion1);
       img2.setAnimation(animacion1);

    img.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent ventry = getPackageManager().getLaunchIntentForPackage("com.idoideas.stickermaker");
            startActivity(ventry);

        }
    });
    img2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            llamarEntry();
        }
    });



    }

    private void llamarEntry(){

Intent ventrar = new Intent(select_activity.this,EntryActivity.class);
startActivity(ventrar);
    }
}