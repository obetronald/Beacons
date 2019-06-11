package com.example.obet.beacons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Moral extends AppCompatActivity {

    String url= "https://www.raptravel.org/informacion-arequipa15-atractivos-turisticos-info-util-casa-de-moral-arequipa.php";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moral);

        WebView web = (WebView) findViewById(R.id.btnMora);
        web.setWebViewClient(new Moral.MyWebViewClient());
        WebSettings settings = web.getSettings();
        settings.setJavaScriptEnabled(true);
        web.loadUrl(url);

    }
    private class MyWebViewClient extends WebViewClient {
        public boolean shouldOverrideUrlLoading(WebView view, String url){
            view.loadUrl(url);
            return true;
        }
    }
}
