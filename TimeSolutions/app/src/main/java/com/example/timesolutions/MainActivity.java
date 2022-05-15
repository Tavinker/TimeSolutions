package com.example.timesolutions;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText txtUsuario, txtSenha;
    TextView lblResultado;
    Button btnAcessar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtUsuario = findViewById(R.id.txtUsuarioLogin);
        txtSenha = findViewById(R.id.txtSenhaLogin);
        lblResultado = findViewById(R.id.lblResultado);
        btnAcessar = findViewById(R.id.btnAcessar);

    }

    public void login(View view){
        String nome = txtUsuario.getText().toString();
        String senha = txtSenha.getText().toString();

        if(nome.equalsIgnoreCase("admin")){
            if(senha.equalsIgnoreCase("12345")){
                lblResultado.setText("Login com sucesso!");
            }else{
                lblResultado.setText("Senha inválida!");
                Limpar();
            }

        }else{
            lblResultado.setText("Usuário Inválido!");
            Limpar();
        }

        }

        private void Limpar(){
            txtUsuario.setText("");
            txtSenha.setText("");
            txtUsuario.requestFocus();
        }


}