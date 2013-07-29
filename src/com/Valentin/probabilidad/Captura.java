package com.Valentin.probabilidad;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Captura extends Activity {

	EditText dato1, dato2;
	
	
     
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_captura);
        
        dato1=(EditText)findViewById(R.id.A);
        
        dato2=(EditText)findViewById(R.id.B);
    }

    
    public void Aceptar (View v) {
  //creando aviso(notificacion) y concatenamos el texto obtenido
	Toast.makeText(this, "Con tus Probabilidades se podrán hacer las siguentes operaciones", Toast.LENGTH_LONG).show();
	
	String valor1=dato1.getText().toString();//pasandolo a string el edit text
	String valor2=dato2.getText().toString();//pasandolo a string el edit text
	
	
	//creando el intent
	Intent inten=new Intent(this,FormulasP.class);
	
	//metiendo valor a intent pasa valores a la otra actividad
		inten.putExtra("A", valor1);
		inten.putExtra("B", valor2);
	    	
	//lanzamos intent
	this.startActivity(inten);
	
	
	
    }
    
}
