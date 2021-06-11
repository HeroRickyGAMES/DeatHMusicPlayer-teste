package com.example.deathmusicplayer.activity;

//Programado por HeroRicky_Games

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.ContentUris;
import android.content.Intent;
import android.database.Cursor;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ListView;

import com.example.deathmusicplayer.R;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerMusica;
    private ListView listmusic;
    private int duration;
    private String name;
    private Uri uri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listmusic = findViewById(R.id.listmusic);

    }

    public void Onclick(View v) {
        Intent intent = new Intent(this, playerActivity.class);
        startActivity(intent);
    }

    /*public void listmuss(Uri uri, String name, int duration) {
        this.uri = uri;
        this.name = name;
        this.duration = duration;
    }

    List<MediaPlayer> mediaPlayerList = new ArrayList<MediaPlayer>();
    String[] projection = new String[]{
            MediaStore.Audio.Media.DOCUMENT_ID,
            MediaStore.Audio.Media.ARTIST_ID,
            MediaStore.Audio.Media.GENRE_ID
    };
    String selecion = MediaStore.Audio.Media.DURATION + ">= ?";

    String[] selectionArgs = new String[]{
            String.valueOf(TimeUnit.MILLISECONDS.convert(5, TimeUnit.MINUTES))
    };
    String sortOrder = MediaStore.Video.Media.DISPLAY_NAME + " ASC";*/

}

