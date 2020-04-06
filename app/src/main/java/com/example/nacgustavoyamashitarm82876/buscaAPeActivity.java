package com.example.nacgustavoyamashitarm82876;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class buscaAPeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_busca_a_pe);

        WebView webview5 = findViewById(R.id.webview5);
        webview5.setWebViewClient(new WebViewClient());
        webview5.getSettings().setJavaScriptEnabled(true);

        webview5.loadUrl("https://www.buscape.com.br/");
    }
}
