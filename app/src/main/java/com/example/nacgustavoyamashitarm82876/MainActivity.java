package com.example.nacgustavoyamashitarm82876;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void AbrirMagulu(View view){
        //implementacao da intent
        Intent intent = new Intent(this, magaluActivity.class);
        startActivity(intent);

    }

    public void AbrirSubmarino(View view){
        Intent intent2 = new Intent(this, submarinoActivity.class);
        startActivity(intent2);
    }

    public void AbrirMercadoLivre(View view){
        Intent intent3 = new Intent(this, mercadoLivreActivity.class);
        startActivity(intent3);
    }

    public void AbrirAmericanas(View view){
        Intent intent4 = new Intent(this, americanasActivity.class);
        startActivity(intent4);
    }

    public void AbrirBuscaAPe(View view){
        Intent intent5 = new Intent(this, buscaAPeActivity.class);
        startActivity(intent5);
    }

    public void AbrirNetShoes(View view){
        Intent intent6 = new Intent(this, netShoesActivity.class);
        startActivity(intent6);
    }

    public void AbrirInformacaoAluno(View view){
        Intent intent7 = new Intent(this, SobreOAlunoActivity.class);
        startActivity(intent7);
    }
}
