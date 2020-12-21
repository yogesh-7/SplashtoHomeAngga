package com.example.anggarisky.splashtohomeangga;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Animation frombottom = AnimationUtils.loadAnimation(this, R.anim.frombottom);


        ImageView bgapp = (ImageView) findViewById(R.id.bgapp);
        ImageView clover = (ImageView) findViewById(R.id.clover);
        LinearLayout textsplash = (LinearLayout) findViewById(R.id.textsplash);
        LinearLayout texthome = (LinearLayout) findViewById(R.id.texthome);
        LinearLayout menus = (LinearLayout) findViewById(R.id.menus);

        bgapp.animate().translationY(-1900).setDuration(800).setStartDelay(300);
        clover.animate().alpha(0).setDuration(800).setStartDelay(600);
        textsplash.animate().translationY(140).alpha(0).setDuration(800).setStartDelay(300);

        texthome.startAnimation(frombottom);
        menus.startAnimation(frombottom);


    }
}
