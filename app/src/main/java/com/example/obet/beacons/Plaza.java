package com.example.obet.beacons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.util.ArrayList;
import java.util.List;

import ahmed.easyslider.EasySlider;
import ahmed.easyslider.SliderItem;

public class Plaza extends AppCompatActivity {

    //String url= "http://www.museocatedralarequipa.org.pe/index.html";

    EasySlider easySlider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plaza);

        //WebView web = (WebView) findViewById(R.id.btnCatdr);
        //web.setWebViewClient(new Plaza.MyWebViewClient());
        //WebSettings settings = web.getSettings();
        //settings.setJavaScriptEnabled(true);
        //web.loadUrl(url);
        //private class MyWebViewClient extends WebViewClient {
        //public boolean shouldOverrideUrlLoading(WebView view, String url){
        //view.loadUrl(url);
        //return true;
        //}
        //}

        easySlider=findViewById(R.id.sliderId);

        List<SliderItem> easySliders=new ArrayList<>();

        easySliders.add(new SliderItem("mon1",R.drawable.catedral6));
        easySliders.add(new SliderItem("mon2",R.drawable.catedral4));
        easySliders.add(new SliderItem("mon3",R.drawable.catedral3));
        easySliders.add(new SliderItem("mon4",R.drawable.catedral2));
        easySliders.add(new SliderItem("mon4",R.drawable.catedral5));

        easySlider.setPages(easySliders);

    }

}


