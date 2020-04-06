package com.example.nacgustavoyamashitarm82876;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class magaluActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_magalu);

        WebView webview = findViewById(R.id.webview);
        webview.setWebViewClient(new WebViewClient());

        webview.getSettings().setJavaScriptEnabled(true);

        webview.loadUrl("https://www.magazineluiza.com.br/");


    }

}
