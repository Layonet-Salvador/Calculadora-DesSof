package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txt1;
    EditText txt2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt1 = (EditText)findViewById(R.id.et1);
        txt2 = (EditText)findViewById(R.id.et2);
    }

    public  void Suma(View view){

      /*  String valS1 = txt1.getText().toString();
        int valI1 = Integer.parseInt(valS1);*/

        if(txt1.getText().toString().equals("") || txt2.getText().toString().equals("") )
        {
            Toast.makeText(this,"Ingresa Numero" ,Toast.LENGTH_LONG).show();
        }
        else {

            int valI1 = Integer.parseInt(txt1.getText().toString());
            int valI2 = Integer.parseInt(txt2.getText().toString());

            int valIF = valI1 + valI2;

            Toast.makeText(this, "La suma es: " + valIF, Toast.LENGTH_LONG).show();
        }

    }

}
