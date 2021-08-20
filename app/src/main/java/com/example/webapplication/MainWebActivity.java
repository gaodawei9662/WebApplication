package com.example.webapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class MainWebActivity extends Activity {

    TextView tv_url;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_url = findViewById(R.id.tv_url);

        String url = tv_url.getText().toString().trim();
        tv_url.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainWebActivity.this, WebActivity.class);
                intent.putExtra("url", url);
                startActivity(intent);
            }
        });
    }
}
