package com.example.edorivalktugasintent;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class halamanpertama extends AppCompatActivity {
    public static final String EXTRA_MESSAGE="MESSAGE";
    public static final int TEXT_REQUEST=1;
    private EditText editText;
    private TextView textViewMessage, penerima;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halamanpertama);
        editText = findViewById(R.id.editText);
        textViewMessage = findViewById(R.id.text_message);

        penerima = findViewById(R.id.penerima);
        Intent intent = getIntent();
        String kontak = intent.getStringExtra(MainActivity.KONTAK);
        penerima.setText(kontak);
    }
    public void openSecondActivity (View view){
        Intent intent = new Intent(halamanpertama.this, halamankedua.class);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivityForResult(intent, TEXT_REQUEST);
    }
    protected void onActivityResult ( int requestCode, int resultCode,
                                      @Nullable Intent data){
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == TEXT_REQUEST && resultCode == RESULT_OK) {
            String reply = data.getStringExtra(halamankedua.EXTRA_REPLY);
            textViewMessage.setText(reply);
        }
    }
}
