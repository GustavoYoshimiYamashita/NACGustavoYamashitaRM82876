package com.example.nacgustavoyamashitarm82876;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class mercadoLivreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mercado_livre);

        WebView webview3 = findViewById(R.id.webview3);
        webview3.setWebViewClient(new WebViewClient());
        webview3.getSettings().setJavaScriptEnabled(true);

        webview3.loadUrl("https://www.mercadolivre.com.br/");
    }
}
