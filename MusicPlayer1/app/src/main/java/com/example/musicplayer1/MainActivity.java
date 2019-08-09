package com.example.musicplayer1;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button play,pause,stop,album;
    MediaPlayer mediaPlayer;
    int pauseSong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        play = (Button)findViewById(R.id.btn_play);
        pause = (Button)findViewById(R.id.btn_pause);
        stop = (Button)findViewById(R.id.btn_stop);
        album = (Button)findViewById(R.id.music_info);


        play.setOnClickListener(this);
        stop.setOnClickListener(this);
        pause.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.btn_play:
                if(mediaPlayer==null) {
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.tone);
                    mediaPlayer.start();
                }

                else if(!mediaPlayer.isPlaying()){
                    mediaPlayer.seekTo(pauseSong);
                    mediaPlayer.start();
                    }

                break;

            case R.id.btn_pause:
                if(mediaPlayer!=null){
                    mediaPlayer.pause();
                    pauseSong = mediaPlayer.getCurrentPosition();
                }

                break;

            case R.id.btn_stop:
                if(mediaPlayer!=null){
                mediaPlayer.stop();
                mediaPlayer = null;
                }
                break;
        }
    }
}
