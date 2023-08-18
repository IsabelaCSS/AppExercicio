package com.example.exerciciofixacao;
//Declaração do pacote da classes exerciciofixacao

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;
//importação das classes

public class MainActivity extends AppCompatActivity { //uma classe para declarar as variaveis da activity

    //declarando variavel nas EditText/TextView
    public float cvalor, rvalor, svalor, result;
    EditText cquantidade, rquantidade, squantidade;
    TextView totalpedido;

    @Override
    protected void onCreate(Bundle savedInstanceState) { // criação da activity
        super.onCreate(savedInstanceState); // salvar qualquer dados inseridos na activity
        setContentView(R.layout.activity_main); // validando o botão de voltar para o exercicio anterior

        cvalor = 2.00f; //variavel do calculo cachorro quente
        rvalor = 2.50f; //variavel do calculo refrigerante
        svalor = 1.50f; //variavel do calculo sobremesa

        cquantidade = findViewById(R.id.qtdCachorroQuente); //variavel da Edit Text com a quantidade de cachorros quentes
        rquantidade = findViewById(R.id.qtdRefrigerante); //variavel da Edit Text com a quantidade de refrigerante
        squantidade = findViewById(R.id.qtdSobremesa); //variavel da Edit Text com a quantidade de sobremesa
        totalpedido = findViewById(R.id.txtvalortotal); //variavel da text view que informa-ra o valor total do calculo

        // pegando o video view
        VideoView video = findViewById(R.id.vv);

        //adicionei uma videoView mostrando as imagens do cardapio em forma de video
        Uri src = Uri.parse("android.resource://com.example.exercicofixacao/raw/testingClip");
        video.setVideoURI(src);

        video.setMediaController(new MediaController(this));
    }

    public void btncalcular(View v) { // validando o botão de calcular para calcular os valor total  do pedido

        totalpedido.setText(String.valueOf(valortotal())); //variavel que recebe-rá o valor total do pedido

    }

    private float valortotal() { //tipo de dado que recebera o valor total
        float c = Integer.parseInt(cquantidade.getText().toString()); //variavel com o codigo da Edit Text da quantidade de cachorro quente
        float r = Integer.parseInt(rquantidade.getText().toString()); //variavel com o codigo da Edit Text da quantidade de refregerante
        float s = Integer.parseInt(squantidade.getText().toString()); //variavel com o codigo da Edit Text da quantidade de sobremesa

        result = (c * cvalor) + (r * rvalor) + (s * svalor); //calculo do pedido

        return result; //validando que devera retornar estes calculo no result que é a variavel do text view da resposta
    }
    public void btnproximo(View s) { // validando o botão de proximo o exercicio
        Intent intent = new Intent(this, exercicio2.class); //Validadndo a intenção do botão, que é direcionar para a classe exercicio2
        startActivity(intent); //comando para executar a inteção do botão para voltar ao exercicio anterior
    }
}