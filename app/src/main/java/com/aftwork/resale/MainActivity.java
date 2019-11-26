package com.aftwork.resale;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Declare the widget
    Button buttonGet;
    Animation uptodown, downtoup;
    TextView textView;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //set the variable to a widget by id
        buttonGet = (Button)findViewById(R.id.buttonGetStarted);
        textView = (TextView)findViewById(R.id.textView);
        imageView = (ImageView)findViewById(R.id.imageView);
        uptodown = AnimationUtils.loadAnimation(this, R.anim.uptodown);
        downtoup = AnimationUtils.loadAnimation(this, R.anim.downtoup);
        //set the animation props to a variable widget
        textView.setAnimation(uptodown);
        imageView.setAnimation(uptodown);
        buttonGet.setAnimation(downtoup);
    }
}
