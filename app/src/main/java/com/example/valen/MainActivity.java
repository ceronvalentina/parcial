package com.example.valen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
TextView tvresultado;
float numero1 =0.0f;
float numero2 =0.0f;
String operacion= "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void EscribirSiete(View view) {
        numero1 = Float.parseFloat(tvresultado.getText().toString());
        if (numero1 == 0.0f)
        {
            tvresultado.setText("7");
        }else{
            tvresultado.setText(tvresultado.getText() + "7");
        }
    }
    public void EscribirOcho(View view) {
        numero1 = Float.parseFloat(tvresultado.getText().toString());
        if (numero1 == 0.0f)
        {
            tvresultado.setText("8");
        }else{
            tvresultado.setText(tvresultado.getText() + "8");
        }
    }
    public void EscribirNueve(View view) {
        numero1 = Float.parseFloat(tvresultado.getText().toString());
        if (numero1 == 0.0f)
        {
            tvresultado.setText("8");
        }else{
            tvresultado.setText(tvresultado.getText() + "8");
        }
    }
    public void EscribirCuatro(View view) {
        numero1 = Float.parseFloat(tvresultado.getText().toString());
        if (numero1 == 0.0f)
        {
            tvresultado.setText("8");
        }else{
            tvresultado.setText(tvresultado.getText() + "8");
        }
    }
    public void EscribirCinco(View view) {
        numero1 = Float.parseFloat(tvresultado.getText().toString());
        if (numero1 == 0.0f)
        {
            tvresultado.setText("8");
        }else{
            tvresultado.setText(tvresultado.getText() + "8");
        }
    }
    public void EscribirSeis(View view) {
        numero1 = Float.parseFloat(tvresultado.getText().toString());
        if (numero1 == 0.0f)
        {
            tvresultado.setText("8");
        }else{
            tvresultado.setText(tvresultado.getText() + "8");
        }
    }
    public void EscribirTres(View view) {
        numero1 = Float.parseFloat(tvresultado.getText().toString());
        if (numero1 == 0.0f)
        {
            tvresultado.setText("8");
        }else{
            tvresultado.setText(tvresultado.getText() + "8");
        }
    }
    public void EscribirDos(View view) {
        numero1 = Float.parseFloat(tvresultado.getText().toString());
        if (numero1 == 0.0f)
        {
            tvresultado.setText("8");
        }else{
            tvresultado.setText(tvresultado.getText() + "8");
        }
    }
    public void EscribirUno(View view) {
        numero1 = Float.parseFloat(tvresultado.getText().toString());
        if (numero1 == 0.0f)
        {
            tvresultado.setText("8");
        }else{
            tvresultado.setText(tvresultado.getText() + "8");
        }
    }
    public void OperacionDividir(View view) {
        numero1 = Float.parseFloat(tvresultado.getText().toString());
        operacion="/";
        tvresultado.setText("0");
    }
    public void MostrarResultado(View view) {
        numero2 = Float.parseFloat(tvresultado.getText().toString());
        if (operacion.equals("/")){
        if (numero2=="0.0f"){
            tvresultado.setText("0");
            Toast.makeText(this, "OPERACION NO VALIDA", Toast.LENGTH_LONG.show());
        }
        }
    }
}