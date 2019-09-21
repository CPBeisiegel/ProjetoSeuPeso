package com.example.projetoseupeso;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

public class SplasActivity extends AppCompatActivity {



            private ImageView imageSplash;
            private Timer timer = new Timer();

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);

                imageSplash = findViewById(R.id.imageViewSplash);

                // método para escutar o click
                imageSplash.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        jump();
                    }
                });

                // chamada do Método que irá temporarizar a duração da tela splash
                timer.schedule(new TimerTask() {
                    @Override
                    public void run() {
                        jump();
                    }
                }, 3000);
            }

            // método que vai para outra activity através do Intent
            private void jump() {
                timer.cancel();
                startActivity(new Intent(SplasActivity.this, Home.class));
                finish();
            }

        }
    }
}