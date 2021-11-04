package com.example.app_mid_13;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void but_click(View view){
        EditText et=findViewById(R.id.editTextNumber);
        ImageView iv=findViewById(R.id.imageView);
        int[] images=new int[10];
        images[0]=R.drawable._1;
        images[1]=R.drawable._2;
        images[2]=R.drawable._3;
        images[3]=R.drawable._4;
        images[4]=R.drawable._5;
        images[5]=R.drawable._6;
        images[6]=R.drawable._7;
        images[7]=R.drawable._8;
        images[8]=R.drawable._9;
        images[9]=R.drawable._10;
        iv.setImageResource(images[(Integer.parseInt(et.getText().toString())-1)]);
    }
}