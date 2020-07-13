package com.example.techywarrior;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Tweet extends AppCompatActivity {

    TextView textView;
    Animation fromtopbottom, fromtopbottomtwo, fromtopbottomthree;
    LinearLayout lvone,lvtwo;
    ImageView imageView;
    Button btnlock1,btnlock2,btnlock3,btnlock4,btnlock5,btntonxt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tweet);


        fromtopbottom = AnimationUtils.loadAnimation(this, R.anim.fromtopbottom);
        fromtopbottomtwo = AnimationUtils.loadAnimation(this, R.anim.fromtopbottomtwo);
        fromtopbottomthree = AnimationUtils.loadAnimation(this, R.anim.fromtopbottomthree);

        btnlock1= findViewById(R.id.btnlock1);
        btnlock1= findViewById(R.id.btnlock1);
        btnlock2= findViewById(R.id.btnlock2);
        btnlock3= findViewById(R.id.btnlock3);
        btnlock4    = findViewById(R.id.btnlock4);
        btnlock5= findViewById(R.id.btnlock5);
        btntonxt= findViewById(R.id.btntonxt);
       textView= findViewById(R.id.textView);
       lvone= findViewById(R.id.lvone);
        lvtwo= findViewById(R.id.lvtwo);
        imageView= findViewById(R.id.imageView);



        textView.startAnimation(fromtopbottom);


       imageView.startAnimation(fromtopbottom);

        lvone.startAnimation(fromtopbottomtwo);
        lvtwo.startAnimation(fromtopbottomthree);


        btntonxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Tweet.this,Sentiment.class);
                a.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(a);
            }
        });


    }

    public void MyLock1(View view)
    {
        openUrl("https://public.tableau.com/profile/techy.warriors#!/vizhome/TechyWarriorsLockdown1/Dashboard3?publish=yes");

    }
    public void MyLock2(View view)
    {
        openUrl("https://public.tableau.com/profile/techy.warriors#!/vizhome/TechyWarriorsTweetL1/Dashboard4?publish=yes");

    }
    public void MyLock3(View view)
    {
        openUrl("https://public.tableau.com/profile/techy.warriors#!/vizhome/TechyWarriorsLockdown1/Dashboard4?publish=yes");

    }
    public void MyLock4(View view)
    {
        openUrl("https://public.tableau.com/profile/techy.warriors#!/vizhome/TechyWarriorsLockdown1/Dashboard5?publish=yes");

    }
    public void MyLock5(View view)
    {
        openUrl("https://public.tableau.com/profile/techy.warriors#!/vizhome/Covid-19RelatedTweetsIndia_15929951157150/Dashboard2?publish=yes");

    }
    public void openUrl(String url)
    {
        Uri uri= Uri.parse(url);
        Intent launchWeb=new Intent(Intent.ACTION_VIEW,uri);
        startActivity(launchWeb);
    }



}