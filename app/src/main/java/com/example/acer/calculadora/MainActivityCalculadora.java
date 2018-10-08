package com.example.acer.calculadora;

import  android.app.Activity;
import  android.view.View;
import android.os.Bundle;
import  android.widget.TextView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivityCalculadora extends AppCompatActivity {
    Button btnuno,btndos,btntres,btncuatro,btncinco,btnseies,btnsiete,btnocho,btnnueve,btncero,btnSuma,btnResta,btnDivicion,btnMultiplicacion,btnigual,btnLimpiar;

    TextView Resultado;
    double resultado;
    String operador,mostrar,reserva;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_calculadora);

        btnuno=(Button)findViewById(R.id.uno);
        btndos=(Button)findViewById(R.id.dos);
        btntres=(Button)findViewById(R.id.tres);
        btncuatro=(Button)findViewById(R.id.cuatro);
        btncinco=(Button)findViewById(R.id.cinco);
        btnseies=(Button)findViewById(R.id.seis);
        btnsiete=(Button)findViewById(R.id.siete);
        btnocho=(Button)findViewById(R.id.ocho);
        btnnueve=(Button)findViewById(R.id.nueve);
        btncero=(Button)findViewById(R.id.cero);
        btnSuma=(Button)findViewById(R.id.Suma);
        btnResta=(Button)findViewById(R.id.Resta);
        btnMultiplicacion=(Button)findViewById(R.id.Multiplicacion);
        btnDivicion=(Button)findViewById(R.id.Divicion);
        btnigual=(Button)findViewById(R.id.igual);
        btnLimpiar=(Button)findViewById(R.id.Limpiar);
        Resultado=(TextView)findViewById(R.id.Etiqueta);


        btnuno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar=Resultado.getText().toString();
                mostrar=mostrar+"1";
                Resultado.setText(mostrar);


            }
        });


        btndos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar=Resultado.getText().toString();
                mostrar=mostrar+"2";
                Resultado.setText(mostrar);
            }
        });

        btntres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar=Resultado.getText().toString();
                mostrar=mostrar+"3";
                Resultado.setText(mostrar);
            }
        });

        btncuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar=Resultado.getText().toString();
                mostrar=mostrar+"4";
                Resultado.setText(mostrar);
            }
        });
        btncinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar=Resultado.getText().toString();
                mostrar=mostrar+"5";
                Resultado.setText(mostrar);
            }
        });
        btnseies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar=Resultado.getText().toString();
                mostrar=mostrar+"6";
                Resultado.setText(mostrar);
            }
        });
        btnsiete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar=Resultado.getText().toString();
                mostrar=mostrar+"7";
                Resultado.setText(mostrar);
            }
        });

        btnocho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar=Resultado.getText().toString();
                mostrar=mostrar+"8";
                Resultado.setText(mostrar);
            }
        });
        btnnueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar=Resultado.getText().toString();
                mostrar=mostrar+"9";
                Resultado.setText(mostrar);
            }
        });
        btncero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar=Resultado.getText().toString();
                mostrar=mostrar+"0";
                Resultado.setText(mostrar);
            }
        });

        btnSuma.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                reserva=Resultado.getText().toString();
                operador="+";
                Resultado.setText("");
            }
        });

        btnResta.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                reserva=Resultado.getText().toString();
                operador="-";
                Resultado.setText("");
            }
        });
        btnMultiplicacion.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                reserva=Resultado.getText().toString();
                operador="*";
                Resultado.setText("");
            }
        });
        btnDivicion.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                reserva=Resultado.getText().toString();
                operador="/";
                Resultado.setText("");
            }
        });

        btnLimpiar.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                mostrar="";
                Resultado.setText(mostrar);
                reserva="";
                operador="";

            }
        });

        btnigual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar=Resultado.getText().toString();
                mostrar=mostrar+"1";

                if (operador.equals("-")){
                    resultado = Double.parseDouble(reserva) - Double.parseDouble(Resultado.getText().toString());
                    Resultado.setText(String.valueOf(resultado));
                }

                if (operador.equals("+")){
                    resultado = Double.parseDouble(reserva) + Double.parseDouble(Resultado.getText().toString());
                    Resultado.setText(String.valueOf(resultado));

                }

                if (operador.equals("*")){
                    resultado = Double.parseDouble(reserva) * Double.parseDouble(Resultado.getText().toString());
                    Resultado.setText(String.valueOf(resultado));
                }

                if (operador.equals("/")){
                    resultado = Double.parseDouble(reserva) / Double.parseDouble(Resultado.getText().toString());
                    Resultado.setText(String.valueOf(resultado));
                }









            }
        });























    }
}
