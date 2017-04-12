package com.singularity.javaexamples.androidjavaexamples;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class AndroidExamples extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_examples);
        fakeMain("Not used");
    }

    public void fakeMain(String fakeInput){
        System.out.println("Hello World");
    }
}
