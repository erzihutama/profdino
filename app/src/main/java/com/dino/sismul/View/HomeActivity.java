package com.dino.sismul.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.dino.sismul.R;

public class HomeActivity extends AppCompatActivity {

    ImageView imageEnsiklopedi,imageQuiz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        imageEnsiklopedi  = findViewById(R.id.ensiklopedi);
        imageEnsiklopedi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ensik = new Intent(HomeActivity.this, EnsiklopediActivity.class);
                startActivity(ensik);

            }
        });
        imageQuiz = findViewById(R.id.quiz);
        imageQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent quiz = new Intent(HomeActivity.this,QuisActivity.class);
                startActivity(quiz);
//                Toast.makeText(HomeActivity.this, "Hallo Ini Quiz", Toast.LENGTH_LONG).show();
            }
        });

    }
}
