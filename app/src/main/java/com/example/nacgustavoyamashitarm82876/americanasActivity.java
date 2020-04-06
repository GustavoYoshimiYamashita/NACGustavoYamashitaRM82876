package com.example.nacgustavoyamashitarm82876;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class americanasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_americanas);

        WebView webview4 = findViewById(R.id.webview4);
        webview4.setWebViewClient(new WebViewClient());
        webview4.getSettings().setJavaScriptEnabled(true);

        webview4.loadUrl("https://www.americanas.com.br/");
    }
}
