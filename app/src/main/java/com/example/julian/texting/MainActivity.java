package com.example.julian.texting;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.*;
import android.webkit.*;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    Button btn = (Button) findViewById(R.id.btnDoMagic);

        btn.setOnClickListener(new View.OnClickListener() {
            //@Override
            public void onClick(View v) {
                TextView textview = (TextView)findViewById(R.id.textview1);
                textview.setText("diu");

                WebView myWebView = (WebView) findViewById(R.id.webview);
                WebSettings webSettings = myWebView.getSettings();
                webSettings.setJavaScriptEnabled(true);





            }
        });
    }

}
