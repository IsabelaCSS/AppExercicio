package com.example.exerciciofixacao;
//Declaração do pacote da classes exerciciofixacao

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
//importação das classes

public class exercicio2 extends AppCompatActivity { //uma classe para declarar as variaveis da activity

    //declarando variaveis nas EditText/TextView
    private EditText num1;
    private EditText num2;
    private TextView txtresult;
    @Override
    protected void onCreate(Bundle savedInstanceState) { // criação da activity
        super.onCreate(savedInstanceState); // salvar qualquer dados inseridos na activity
        setContentView(R.layout.activity_exercicio2); // validando o botão de voltar para o exercicio anterior

        num1 = findViewById(R.id.txtvalor1); //declarando que o 1º EditText é o numero 1
        num2 = findViewById(R.id.txtvalor2); //declarando que o 2º EditText é o numero 2
        txtresult = findViewById(R.id.txtverificacao); //declarando que a TextView é resultado
    }
    @SuppressLint("SetTextI18n")
    public void btnverificar(View h){ //Validando o botão de verificar os multiplos
        double A = Double.parseDouble(num1.getText().toString()); //declarando a EditText do 1º numero ser o codigo A
        double B = Double.parseDouble(num2.getText().toString()); //declarando a EditText do 2º numero ser o codigo B

        if (A % B == 0 || B % A == 0){  //Se a for multiplo de B ou B for multiplo de A resulta-ra "São Multiplos" se não "não multiplos"
            txtresult.setText("São Multiplos"); // a EditText que mostra-ra o resultado
        } else{
            txtresult.setText("Não são Multiplos"); // a EditText que mostra-ra o resultado
        }
    }
    public void btnvoltar(View r) { // validando o botão de voltar para o exercicio anterior
        Intent intent = new Intent(this, MainActivity.class);//Validadndo a intenção do botão, que é direcionar para a classe activity Main
        startActivity(intent); //comando para executar a inteção do botão para voltar ao exercicio anterior
    }
    public void btnsair(View u) { //botão de sair
        this.finishAffinity(); //validação de sair do app
    }
}