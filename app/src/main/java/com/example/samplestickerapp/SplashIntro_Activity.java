package com.example.samplestickerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.facebook.common.executors.HandlerExecutorService;

public class SplashIntro_Activity extends AppCompatActivity {
    private MediaPlayer nMP;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_intro_);
        nMP = MediaPlayer.create(SplashIntro_Activity.this, R.raw.audio);
        nMP.start();

        //agregar animaciones
        Animation animacion1 = AnimationUtils.loadAnimation(this,R.anim.desplazamiento_arriba);
        Animation animacion2 = AnimationUtils.loadAnimation(this,R.anim.desplazamiento_abajo);

        ImageView logo = findViewById(R.id.logo);
        ImageView textoLogo = findViewById(R.id.textoLogo);

        logo.setAnimation(animacion1);
        textoLogo.setAnimation(animacion2);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashIntro_Activity.this,select_activity.class);
                startActivity(intent);
            }
        },5000);
    }
}