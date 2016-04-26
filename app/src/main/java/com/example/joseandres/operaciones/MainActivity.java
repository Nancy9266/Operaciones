package com.example.joseandres.operaciones;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {
    private EditText edt1,edt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//recuperamos los objetos controles
        edt1=(EditText) findViewById(R.id.edt1);
        edt2=(EditText)findViewById(R.id.edt2);
    }
    public void sumar(View v){
//convertimos a número los valores introducidos y operamos
        int n1=Integer.parseInt(edt1.getText().toString());
        int n2=Integer.parseInt(edt2.getText().toString());
        int sum=n1+n2;
        mostrar(sum);
    }
    public void restar(View v){
//convertimos a número los valores introducidos y operamos
        int n1=Integer.parseInt(edt1.getText().toString());
        int n2=Integer.parseInt(edt2.getText().toString());
        int rest=n1-n2;
        mostrar(rest);
    }
    public void multiplicar(View v){
//convertimos a número los valores introducidos y operamos
        int n1=Integer.parseInt(edt1.getText().toString());
        int n2=Integer.parseInt(edt2.getText().toString());
        int mult=n1*n2;
        mostrar(mult);
    }
    public void dividir(View v){
//convertimos a número los valores introducidos y operamos
        int n1=Integer.parseInt(edt1.getText().toString());
        int n2=Integer.parseInt(edt2.getText().toString());
        int div=n1/n2;
        mostrar(div);
    }
    private void mostrar(int res){
//mostramos resultado en un Toast
        Toast.makeText(this, "El Resultado es: " + res,Toast.LENGTH_LONG).show();
    }
    private void show() {
    }


}