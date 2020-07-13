package com.example.techywarrior;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvSplash, tvtagline;
    Button btnSplash;
    ImageView imageView2;
    Animation fromtopbottom, smtobig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fromtopbottom = AnimationUtils.loadAnimation(this, R.anim.fromtopbottom);
        smtobig = AnimationUtils.loadAnimation(this, R.anim.smtobig);
        imageView2 = (ImageView) findViewById(R.id.imageView2);

        Typeface MMedium = Typeface.createFromAsset(getAssets(), "fonts/MMedium.ttf");
        Typeface MLight = Typeface.createFromAsset(getAssets(), "fonts/MLight.ttf");
        Typeface MRegular = Typeface.createFromAsset(getAssets(), "fonts/MRegular.ttf");


        tvSplash =  findViewById(R.id.tvSplash);

        tvtagline =  findViewById(R.id.tvtagline);
         btnSplash = findViewById(R.id.btnSplash);

        btnSplash.setTypeface(MMedium);


        tvSplash.startAnimation(fromtopbottom);
        btnSplash.startAnimation(fromtopbottom);

        imageView2.startAnimation(smtobig);
        tvtagline.startAnimation(smtobig);

        btnSplash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivity.this,HomeAct.class);
                a.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(a);
            }
        });


    }
}