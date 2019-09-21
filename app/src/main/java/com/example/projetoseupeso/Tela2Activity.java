package com.example.projetoseupeso;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.projetoseupeso.R;

public class Tela2Activity extends AppCompatActivity {

    private Button btnCalcular;
    private Button btnInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        initView();

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                recarregaFragment(new CalularFragment());
            }
        });

        btnInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                recarregarFragment(new InformarcoesFragment());
            }
        });

        public void initView(){
            btnCalcular = findViewById(R.id.btnCalcular);
            btnInfo = findViewById(R.id.btnInfo);
        }

        public void recarregarFragment(Fragment fragment){

            FragmentManager manager = getSupportFragmentManager();
            FragmentTransaction transaction = manager.beginTransaction();
            transaction.replace(R.id.container, fragment);
            transaction.commit();

        }
    }
}
