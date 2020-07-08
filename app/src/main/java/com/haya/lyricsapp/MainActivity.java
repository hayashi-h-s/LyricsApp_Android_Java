package com.haya.lyricsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText edtArtistName, edtArtistSong;
    private Button btnGetLyrics;
    private TextView txtLyrics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtArtistName = findViewById(R.id.edtArtistName);
        edtArtistSong = findViewById(R.id.edtArtistSongTitle);
        btnGetLyrics = findViewById(R.id.btnGetLyrics);
        txtLyrics = findViewById(R.id.txtLyrics);

        btnGetLyrics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, "test", Toast.LENGTH_SHORT).show();
                String url = "https://api.lyrics.ovh/v1/" + edtArtistName.getText().toString() + "/" + edtArtistSong.getText().toString();
            }
        });
    }
}