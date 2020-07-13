package com.example.techywarrior;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class HomeAct extends AppCompatActivity {

    TextView tvSweet,  tvRare, tvItemOne, tvItemTwo, tvItemThree,tvCate, tvItemFour;
    Animation fromtopbottom, fromtopbottomtwo, fromtopbottomthree;
    LinearLayout itemOne, itemTwo, itemThree,itemFour;
    HorizontalScrollView categoryItem;
    Button btnd1,btnd2,btnscr3,btnscr4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        fromtopbottom = AnimationUtils.loadAnimation(this, R.anim.fromtopbottom);
        fromtopbottomtwo = AnimationUtils.loadAnimation(this, R.anim.fromtopbottomtwo);
        fromtopbottomthree = AnimationUtils.loadAnimation(this, R.anim.fromtopbottomthree);



        Typeface MMedium = Typeface.createFromAsset(getAssets(), "fonts/MMedium.ttf");
        Typeface MLight = Typeface.createFromAsset(getAssets(), "fonts/MLight.ttf");
        Typeface MRegular = Typeface.createFromAsset(getAssets(), "fonts/MRegular.ttf");

        tvSweet = (TextView) findViewById(R.id.tvSweet);
        tvRare = (TextView) findViewById(R.id.tvRare);
        tvItemOne = (TextView) findViewById(R.id.tvItemOne);
        tvItemTwo = (TextView) findViewById(R.id.tvItemTwo);
        tvItemThree = (TextView) findViewById(R.id.tvItemThree);
        itemOne =  findViewById(R.id.itemOne);
        itemTwo =  findViewById(R.id.itemTwo);
        itemThree =  findViewById(R.id.itemThree);

        itemFour =  findViewById(R.id.itemFour);

        tvItemFour =  findViewById(R.id.tvItemFour);
        btnscr4 =  findViewById(R.id.btnscr4);
        tvCate=findViewById(R.id.tvCate);


        btnd1 =  findViewById(R.id.btnd1);
        btnd2 =  findViewById(R.id.btnd2);
        btnscr3 =  findViewById(R.id.btnscr3);
        categoryItem = (HorizontalScrollView) findViewById(R.id.categoryItem);

        tvSweet.setTypeface(MMedium);
        tvItemOne.setTypeface(MRegular);
        tvItemTwo.setTypeface(MRegular);
        tvItemThree.setTypeface(MRegular);
        tvItemFour.setTypeface(MRegular);
        tvRare.setTypeface(MLight);
        btnd1.setTypeface(MLight);
        btnd2.setTypeface(MLight);
        btnscr3.setTypeface(MLight);
        btnscr4.setTypeface(MLight);


        tvSweet.startAnimation(fromtopbottom);


        tvCate.startAnimation(fromtopbottom);
        tvRare.startAnimation(fromtopbottom);

        categoryItem.startAnimation(fromtopbottom);

        itemOne.startAnimation(fromtopbottom);
        itemTwo.startAnimation(fromtopbottomtwo);
        itemThree.startAnimation(fromtopbottomthree);


        categoryItem.postDelayed(new Runnable() {
                @Override
                public void run() {
                    //hsv.fullScroll(HorizontalScrollView.FOCUS_RIGHT);
                    categoryItem.smoothScrollBy(1000, 0);

                }
            },2500);

        btnscr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(HomeAct.this,Tweet.class);
                a.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(a);
            }
        });


        btnscr4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(HomeAct.this,Sentiment.class);
                a.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(a);
            }
        });

    }
    public void MyDash1(View view)
    {
        openUrl("https://public.tableau.com/profile/techy.warriors#!/vizhome/covid-1_15935876110210/Dashboard3?publish=yes");

    }
    public void MyDash2(View view)
    {
        openUrl("https://public.tableau.com/profile/techy.warriors#!/vizhome/Dashboard-1CONFIRMEDCASESINDIA/Dashboard2?publish=yes");

    }
    public void openUrl(String url)
    {
        Uri uri= Uri.parse(url);
        Intent launchWeb=new Intent(Intent.ACTION_VIEW,uri);
        startActivity(launchWeb);
    }
}