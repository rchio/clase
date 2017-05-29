package com.example.lab_sistemas.clase;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

   private TextView tvPrecio;
    private TextView etNombre;
    private TextView tvContador;
    private TextView tvResNombre;
    private TextView tvResCantidad;
    private TextView tvResPrecio;
    private int cantidad;
    private double resultado;
    private double precio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cantidad=1;
        resultado=0;
        precio=5;
        tvPrecio=(TextView)findViewById(R.id.tvPrecio);
        etNombre=(EditText)findViewById(R.id.etNombre);
        tvContador=(TextView)findViewById(R.id.tvContador);
        tvResNombre=(TextView)findViewById(R.id.tvResName);
        tvResCantidad=(TextView)findViewById(R.id.tvResCantidad);
        tvResPrecio=(TextView)findViewById(R.id.tvResPrecio);


        tvContador.setText(cantidad+" ");
        tvPrecio.setText("Precio Unitario: bs."+precio);
    }
    public void menos (View v) {
        if (cantidad > 0 ) {
            cantidad--;
            tvContador.setText(cantidad + "");
        }
    }

    public void mas(View v){
        cantidad--;
        tvContador.setText(cantidad+"");
    }

    public void calcular(View v){
      resultado = cantidad * precio ;
        tvResPrecio.setText(resultado+"");
        tvResCantidad.setText(cantidad+"cafe(s)");
        tvResNombre.setText(etNombre.getText().toString());
    }
    public void borrar(View v){
        etNombre.setText("");
        tvContador.setText(1);
        tvResNombre.setText("");
        tvResPrecio.setText("");
        tvResCantidad.setText("");
    }


}
