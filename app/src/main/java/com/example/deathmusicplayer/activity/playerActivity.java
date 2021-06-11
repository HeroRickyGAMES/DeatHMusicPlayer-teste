package com.example.deathmusicplayer.activity;
//Programado por HeroRicky_Games
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.deathmusicplayer.R;

public class playerActivity extends AppCompatActivity {

    MediaPlayer mp;
    Button Botão;
    TextView textView;
    TextView duration;
    TextView timelimit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);

        mp = MediaPlayer.create(this, R.raw.bentohell);
        Botão = findViewById(R.id.buttonplaypause2);
        textView = findViewById(R.id.textView);
        duration = findViewById(R.id.Duration);
        timelimit = findViewById(R.id.timelimit);
    }
    public void playerButton(View v){

    if(mp.isPlaying()){
        textView.setText("Ben to Hell - Hollywood Undead");
        duration.setText("Duração");
        mp.pause();
        Botão.setBackgroundResource(R.drawable.ic_baseline_play_arrow_48);
        Toast.makeText(this, "Pause", Toast.LENGTH_SHORT).show();
    }else{
        textView.setText("Ben to Hell - Hollywood Undead");
        mp.start();
        Botão.setBackgroundResource(R.drawable.ic_baseline_pause_48);
        Toast.makeText(this, "Reproduza a musica", Toast.LENGTH_SHORT).show();
    }

    }
    public void mimize(View v){
        Intent intent = new Intent( this,MainActivity.class );
        startActivity(intent);

    }
}