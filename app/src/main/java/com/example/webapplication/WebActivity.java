package com.example.webapplication;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.Nullable;

public class WebActivity extends Activity {

    WebView myWebView;
    String mUrl;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        myWebView = findViewById(R.id.webView);
        mUrl = getIntent().getStringExtra("url");

//        mUrl = "http://115.236.86.197:48100/#/login";

        myWebView.loadUrl(mUrl);

        myWebView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return false;
            }
        });
    }
}