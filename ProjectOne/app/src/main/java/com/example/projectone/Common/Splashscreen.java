package com.example.projectone.Common;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.example.projectone.R;
import com.example.projectone.User.UserDashboard;

@SuppressLint("CustomSplashScreen")
public class Splashscreen extends AppCompatActivity {

     private static final int SPLASH_TIME= 5000;
    //variables
    TextView powered_by_line;
    TextView logo;

    Animation sideanim,bottomanim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.splash_screen);

        //hooks

        powered_by_line=findViewById(R.id.powered_by_line);
        logo =findViewById(R.id.logo);

        //Animations

        sideanim= AnimationUtils.loadAnimation(this,R.anim.side_animation);
        bottomanim=AnimationUtils.loadAnimation(this,R.anim.bottom_anim);

        // set Animation on elements

        powered_by_line.setAnimation(bottomanim);
        logo.setAnimation(sideanim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent= new Intent(Splashscreen.this, UserDashboard.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_TIME);

    }
}