package com.example.gestordefaltas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MenuPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu_principal);

    }
    //Metedo que faz iniciar a pag Encontrar funcionarios atraves do atributo onClik
    public void PagEncontrar(View view){
        Intent next = new Intent(MenuPrincipal.this, EncontrarFuncionarios.class);
        startActivity(next);
    }

    public void PagListar(View view){
        Intent next = new Intent(MenuPrincipal.this, ListarFuncionarios.class);
        startActivity(next);
    }

    public void PagFuncionario(View view){
        Intent next = new Intent(MenuPrincipal.this, Funcionarios.class);
        startActivity(next);
    }
}