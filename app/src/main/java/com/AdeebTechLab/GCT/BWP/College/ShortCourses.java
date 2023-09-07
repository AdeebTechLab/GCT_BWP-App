package com.AdeebTechLab.GCT.BWP.College;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ShortCourses extends AppCompatActivity {

    private WebView web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_short_courses);



        web= (android.webkit.WebView) findViewById(R.id.webivew);
        web.setWebViewClient(new WebViewClient());
        web.loadUrl("file:///android_asset/short_courses_list.html");

    }
}