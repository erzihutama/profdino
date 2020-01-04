package com.dino.sismul.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.dino.sismul.R;

public class HomeActivity extends AppCompatActivity {

    ImageView imageEnsiklopedi,imageQuiz;
    MediaPlayer audioBackground;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        audioBackground = MediaPlayer.create(this, R.raw.harvest);
        //Set looping ke true untuk mengulang audio jika telah selesai
        audioBackground.setLooping(true);
        //Set volume audio agar berbunyi
        audioBackground.setVolume(1,1);
        //Memulai audio
        audioBackground.start();

        imageEnsiklopedi  = findViewById(R.id.ensiklopedi);
        imageEnsiklopedi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ensik = new Intent(HomeActivity.this, EnsiklopediActivity.class);
                startActivity(ensik);
                audioBackground.stop();

            }
        });
        imageQuiz = findViewById(R.id.quiz);
        imageQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent quiz = new Intent(HomeActivity.this,QuisActivity.class);
                startActivity(quiz);
                audioBackground.stop();
//                Toast.makeText(HomeActivity.this, "Hallo Ini Quiz", Toast.LENGTH_LONG).show();
            }
        });

    }
}
