package com.example.obet.beacons;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class Conexion extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conexion);



        Button Sant =(Button) findViewById(R.id.btnSancat);
        Button Cate =(Button) findViewById(R.id.btnCated);
        Button Morall =(Button) findViewById(R.id.btnMor);


        Sant.setOnClickListener(new View.OnClickListener(){

            public void onClick(View arg0) {
                Intent inten = new Intent(Conexion.this, Catalina.class);
                Conexion.this.startActivity(inten);

            }

        });

        Cate.setOnClickListener(new View.OnClickListener(){

            public void onClick(View arg0) {
                Intent cate = new Intent(Conexion.this, Plaza.class);
                Conexion.this.startActivity(cate);

            }

        });


        Morall.setOnClickListener(new View.OnClickListener(){

            public void onClick(View arg0) {
                Intent btnmor = new Intent(Conexion.this, Moral.class);
                Conexion.this.startActivity(btnmor);

            }

        });


    }

}
