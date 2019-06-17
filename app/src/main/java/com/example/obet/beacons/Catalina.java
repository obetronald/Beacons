package com.example.obet.beacons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.ImageView;
import android.widget.Toast;

import com.smarteist.autoimageslider.DefaultSliderView;
import com.smarteist.autoimageslider.IndicatorAnimations;
import com.smarteist.autoimageslider.SliderLayout;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
import java.util.List;

import ahmed.easyslider.EasySlider;
import ahmed.easyslider.SliderItem;

public class Catalina extends AppCompatActivity {


    EasySlider easySlider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalina);

        easySlider=findViewById(R.id.sliderId);

        List<SliderItem> easySliders=new ArrayList<>();

        easySliders.add(new SliderItem("mon1",R.drawable.mon1));
        easySliders.add(new SliderItem("mon2",R.drawable.mon2));
        easySliders.add(new SliderItem("mon3",R.drawable.mon7));
        easySliders.add(new SliderItem("mon4",R.drawable.mon3));
        easySliders.add(new SliderItem("mon4",R.drawable.mon8));

        easySlider.setPages(easySliders);

    }

}