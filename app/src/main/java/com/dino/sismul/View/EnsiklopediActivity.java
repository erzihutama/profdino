package com.dino.sismul.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.dino.sismul.AllosaurusActivity;
import com.dino.sismul.AnkylosaurusActivity;
import com.dino.sismul.BrachiosaurusActivity;
import com.dino.sismul.DeinonychusActivity;
import com.dino.sismul.HypsilophodonActivity;
import com.dino.sismul.IguanadonActivity;
import com.dino.sismul.ParasaurolopusActivity;
import com.dino.sismul.PlesiosaurusActivity;
import com.dino.sismul.PteranodonActivity;
import com.dino.sismul.R;
import com.dino.sismul.RhamphorhynchusActivity;
import com.dino.sismul.SpinosaurusActivity;
import com.dino.sismul.StegosaurusActivity;
import com.dino.sismul.TriceraptorsActivity;
import com.dino.sismul.VelociraptorActivity;

public class EnsiklopediActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esiklopedi);

        ImageView showAllosaurus = (ImageView) findViewById(R.id.Allosaurus);
        ImageView showAnkylosaurus = (ImageView) findViewById(R.id.ankylosaurus);
        ImageView showBrachiosaurus = (ImageView) findViewById(R.id.Brachiosaurus);
        ImageView showDeinonychus = (ImageView) findViewById(R.id.Deinonychus);
        ImageView showHypsilophodon = (ImageView) findViewById(R.id.Hypsilophodon);
        ImageView showIguanadon = (ImageView) findViewById(R.id.Iguanadon);
        ImageView showParasaurolopus = (ImageView) findViewById(R.id.parasaurolopos);
        ImageView showPlesiosaurus = (ImageView) findViewById(R.id.Plesiosaurus);
        ImageView showPteranodon = (ImageView) findViewById(R.id.Pteranodon);
        ImageView showRhamphorhynchus = (ImageView) findViewById(R.id.Rhamphorhynchus);
        ImageView showSpinosaurus = (ImageView) findViewById(R.id.spinosaurus);
        ImageView showStegosaurus = (ImageView) findViewById(R.id.Stegosaurus);
        ImageView showTriceraptors = (ImageView) findViewById(R.id.Triceraptors);
        ImageView showVelociraptor = (ImageView) findViewById(R.id.Velociraptor);
        showAllosaurus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EnsiklopediActivity.this, AllosaurusActivity.class);
                startActivity(intent);
            }
        });

        showAnkylosaurus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EnsiklopediActivity.this, AnkylosaurusActivity.class);
                startActivity(intent);
            }
        });
        showBrachiosaurus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EnsiklopediActivity.this, BrachiosaurusActivity.class);
                startActivity(intent);
            }
        });
        showDeinonychus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EnsiklopediActivity.this, DeinonychusActivity.class);
                startActivity(intent);
            }
        });
        showHypsilophodon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EnsiklopediActivity.this, HypsilophodonActivity.class);
                startActivity(intent);
            }
        });
        showIguanadon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EnsiklopediActivity.this, IguanadonActivity.class);
                startActivity(intent);
            }
            });
        showParasaurolopus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EnsiklopediActivity.this, ParasaurolopusActivity.class);
                startActivity(intent);
            }
        });
        showPlesiosaurus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EnsiklopediActivity.this, PlesiosaurusActivity.class);
                startActivity(intent);

            }
        });
        showPteranodon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EnsiklopediActivity.this, PteranodonActivity.class);
                startActivity(intent);

            }
        });
        showRhamphorhynchus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EnsiklopediActivity.this, RhamphorhynchusActivity.class);
                startActivity(intent);
            }
        });

        showSpinosaurus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EnsiklopediActivity.this, SpinosaurusActivity.class);
                startActivity(intent);
            }
        });

        showStegosaurus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EnsiklopediActivity.this, StegosaurusActivity.class);
                startActivity(intent);
            }
        });

        showTriceraptors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EnsiklopediActivity.this, TriceraptorsActivity.class);
                startActivity(intent);
            }
        });

        showVelociraptor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EnsiklopediActivity.this, VelociraptorActivity.class);
                startActivity(intent);
            }
        });

    }
}