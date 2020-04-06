package com.example.nacgustavoyamashitarm82876;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class netShoesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_net_shoes);

        WebView weview6 = findViewById(R.id.webview6);
        weview6.setWebViewClient(new WebViewClient());
        weview6.getSettings().setJavaScriptEnabled(true);

        weview6.loadUrl("https://www.netshoes.com.br/");
    }
}
