package com.example.flightassistant;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class AirbusActivity extends AppCompatActivity {
    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_airbus);
        webView = (WebView) findViewById(R.id.webview);
        webView.getSettings().setSupportZoom(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setAllowContentAccess(true);
        webView.getSettings().setAppCacheEnabled(true);
        webView.getSettings().setUseWideViewPort(true);
        webView.getSettings().setDomStorageEnabled(true);



        String url = "https://mijon.pagesperso-orange.fr/A320X/Procedures_normales_FR.pdf";
        webView.loadUrl("https://docs.google.com/gview?embedded=true&url="+url);
    }
}
