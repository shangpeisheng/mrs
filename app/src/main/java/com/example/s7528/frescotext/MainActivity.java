package com.example.s7528.frescotext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.facebook.drawee.view.SimpleDraweeView;

public class MainActivity extends AppCompatActivity {

    private SimpleDraweeView img;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String uri = "http://img4.imgtn.bdimg.com/it/u=1303119997,412613691&fm=21&gp=0.jpg";
        img.setImageURI(uri);
        img = (SimpleDraweeView) findViewById(R.id.sdview);
        abc a = new abc();
    }
}
