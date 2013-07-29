package com.Valentin.probabilidad;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.app.Activity;
import android.content.Intent;


public class Inicio extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
    }

    public void Continuar(View v)
    {

    	//creando aviso(notificacion) y concatenamos el texto obtenido
    	Toast.makeText(this, "Captura tus Probabilidades ", Toast.LENGTH_LONG).show();
    	
    	//creando el intent
    	Intent inten=new Intent(this,Captura.class);
    	    	
    	//lanzamos intent
    	this.startActivity(inten);
    }
   
}
