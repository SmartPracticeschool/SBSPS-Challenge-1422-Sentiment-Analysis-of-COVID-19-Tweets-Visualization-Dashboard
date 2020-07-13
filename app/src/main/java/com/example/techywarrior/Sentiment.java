package com.example.techywarrior;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewFlipper;

public class Sentiment extends AppCompatActivity {

    ViewFlipper v_flipper;
    Button buttonl1,buttonl2,buttonl3,buttonl4,buttonl5,buttonabout;
    TextView tvtwinkle;
    LinearLayout lyfrist,lysecond,lythird;

    Animation fromtopbottom, fromtopbottomtwo, fromtopbottomthree,smtobig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sentiment);


        fromtopbottom = AnimationUtils.loadAnimation(this, R.anim.fromtopbottom);
        fromtopbottomtwo = AnimationUtils.loadAnimation(this, R.anim.fromtopbottomtwo);
        fromtopbottomthree = AnimationUtils.loadAnimation(this, R.anim.fromtopbottomthree);
        smtobig = AnimationUtils.loadAnimation(this, R.anim.smtobig);


        int images[]=
                {  R.drawable.fusion,R.drawable.fus,R.drawable.quote,R.drawable.nice2,R.drawable.nice11,R.drawable.pan,R.drawable.four,R.drawable.nurse,R.drawable.op,R.drawable.nice5,R.drawable.nice6 };

        v_flipper=findViewById(R.id.v_flipper);

        buttonl1 =  findViewById(R.id.buttonl1);
        buttonl2=  findViewById(R.id.buttonl2);
        buttonl3 =  findViewById(R.id.buttonl3);
        buttonl4=  findViewById(R.id.buttonl4);
        buttonl5 =  findViewById(R.id.buttonl5);
        buttonabout=  findViewById(R.id.buttonabout);
        tvtwinkle =  findViewById(R.id.tvtwinkle);
        lyfrist=  findViewById(R.id.lyfirst);
        lysecond =  findViewById(R.id.lysecond);
        lythird=  findViewById(R.id.lythird);



        tvtwinkle.startAnimation(smtobig);


        lyfrist.startAnimation(fromtopbottom);
        lysecond.startAnimation(fromtopbottomtwo);
        lythird.startAnimation(fromtopbottomthree);



        //for each

        for(int image:images)
        {
          flipperImages(image);
        }

        buttonabout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Sentiment.this, "App developed by TECHY WARRIORS", Toast.LENGTH_LONG).show();

            }
        });







    }//onCreate

public void flipperImages(int image)
{
    ImageView imageView=new ImageView(this);
    imageView.setBackgroundResource(image);

    v_flipper.addView(imageView);
    v_flipper.setFlipInterval(2500);
    v_flipper.setAutoStart(true);

    //animation

    v_flipper.setInAnimation(this,android.R.anim.slide_in_left);
    v_flipper.setOutAnimation(this,android.R.anim.slide_out_right);

}


    public void MySent1(View view)
    {
        openUrl("https://public.tableau.com/profile/techy.warriors#!/vizhome/TechyWarriorsLockdown3_15935107489850/Dashboard2?publish=yes");

    }
    public void MySent2(View view)
    {
        openUrl("https://public.tableau.com/profile/techy.warriors#!/vizhome/TechyWarriorsLockdown3_15935107489850/Dashboard3?publish=yes");

    }
    public void MySent3(View view)
    {
        openUrl("https://public.tableau.com/profile/techy.warriors#!/vizhome/TechyWarriorsLockdown3_15935107489850/Dashboard5?publish=yes");

    }
    public void MySent4(View view)
    {
        openUrl("https://public.tableau.com/profile/techy.warriors#!/vizhome/TechyWarriorsLockdown3_15935107489850/Dashboard6?publish=yes");

    }public void MySent5(View view)
    {
        openUrl("https://public.tableau.com/profile/techy.warriors#!/vizhome/OverallSentimentChange-7emotions_15930084055550/Dashboard1?publish=yes");

    }
    public void openUrl(String url)
    {
        Uri uri= Uri.parse(url);
        Intent launchWeb=new Intent(Intent.ACTION_VIEW,uri);
        startActivity(launchWeb);
    }



}//class Sentiment ends here