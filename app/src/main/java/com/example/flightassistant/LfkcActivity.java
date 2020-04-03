package com.example.flightassistant;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class LfkcActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lfkc);

        webView = (WebView) findViewById(R.id.webview);
        webView.getSettings().setSupportZoom(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setAllowContentAccess(true);
        webView.getSettings().setAppCacheEnabled(true);
        webView.getSettings().setUseWideViewPort(true);
        webView.getSettings().setDomStorageEnabled(true);



        String url = "https://www.sia.aviation-civile.gouv.fr/dvd/eAIP_26_MAR_2020/FRANCE/AIRAC-2020-03-26/pdf/FR-AD-2.LFKC-fr-FR.pdf#AD-2.eAIP.LFKC";
        webView.loadUrl("https://docs.google.com/gview?embedded=true&url="+url);
    }
}
