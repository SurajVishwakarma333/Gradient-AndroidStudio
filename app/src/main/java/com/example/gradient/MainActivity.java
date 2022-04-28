package com.example.gradient;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}


/*  how to add gradient color as a background:-
1. right click on drawable and create new Drawable Resource FIle and give any name here i named as gradient.
2.write this line of code in gradient.xml file

<?xml version="1.0" encoding="utf-8"?>
<selector xmlns:android="http://schemas.android.com/apk/res/android">
    <item>
        <shape>
            <gradient android:angle="270"
                android:startColor="#D291BC"
                android:endColor="#FF6700"/>

        </shape>
    </item>
</selector>

3. now go to .xml file and set background as
    android:background="@drawable/gradient"
*/