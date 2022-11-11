package com.example.edorivalktugasintent;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView penerima;
    public static final String KONTAK="NAMA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        penerima = (TextView) findViewById(R.id.penerima);
    }
    public void pageTom(View view){
        Intent page1 = new Intent(MainActivity.this, halamanpertama.class);
        page1.putExtra(KONTAK, "Tom");
        startActivity(page1);
    }
    public void pageChris(View view){
        Intent page1 = new Intent(MainActivity.this, halamanpertama.class);
        page1.putExtra(KONTAK, "Chris");
        startActivity(page1);
    }
    public void pageSteve(View view){
        Intent page1 = new Intent(MainActivity.this, halamanpertama.class);
        page1.putExtra(KONTAK, "Steve");
        startActivity(page1);
    }
}