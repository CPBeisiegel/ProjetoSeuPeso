package com.example.projetoseupeso;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputLayout;

public class HomeActivity extends AppCompatActivity {

            private TextInputLayout nome_usuario;
            private TextInputLayout idade_usuario;
            private TextInputLayout peso_usuario;
            private TextInputLayout altura_usuario;
            private Button btn_comecar;

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_home);

                nome_usuario = findViewById(R.id.nome_usuario);
                idade_usuario = findViewById(R.id.idade_usuario);
                peso_usuario = findViewById(R.id.peso_usuario);
                altura_usuario = findViewById(R.id.altura_usuario);
                btn_comecar = findViewById(R.id.btn_comecar);


                // Esse méto pegara a String digitada o nome_Usuario e irá mostrala no TextNomeUsuario
                btn_comecar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        String nome =  nome_usuario.getEditText().getText().toString();

                        //esa condicional irá vericar se a inputMusica está null.
                        if (nome.isEmpty() || nome == " "){
                            nome_usuario.setError("O campo não pode estar nulo! ");
                        }else {
                            nome_usuario.getEditText().setText(nome);
                        }


                        String idade =  idade_usuario.getEditText().getText().toString();

                        //esa condicional irá vericar se a idade do Usuario está null.
                        if (idade.isEmpty() || idade == " "){
                            idade_usuario.setError("O campo não pode estar nulo! ");
                        }else {
                            idade_usuario.getEditText().setText(idade);
                        }
                        String peso =  peso_usuario.getEditText().getText().toString();

                        //esa condicional irá vericar se o peso do Usuario está null.
                        if (peso.isEmpty() || peso == " "){
                            peso_usuario.setError("O campo não pode estar nulo! ");
                        }else {
                            peso_usuario.getEditText().setText(peso);
                        }
                        String altura =  idade_usuario.getEditText().getText().toString();

                        //esa condicional irá vericar se a Altura do Usuario está null.
                        if (altura.isEmpty() || altura == " "){
                            altura_usuario.setError("O campo não pode estar nulo! ");
                        }else {
                            altura_usuario.getEditText().setText(altura);
                        }
                    }
                });

                // Esse método levará para a próxima actiyity
                btn_comecar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivity( new Intent(HomeActivity.this,PerfilActivity.class));
                    }
                });
            }
        }
    }

}
}
