package com.Valentin.probabilidad;


import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.app.Activity;
import android.content.Intent;



public class Pregunta extends Activity {

	CheckBox opcion1,opcion2;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta);
        
        opcion1=(CheckBox)findViewById(R.id.si);
        opcion2=(CheckBox)findViewById(R.id.no);
        
    }
    
   
    
    public void Preguntar (View v)
    {
    	if(opcion1.isChecked())
    	{
    		//creamos intent
    	Intent preg=new Intent(this, Gracias.class);
    	
    	//Inicio de la actividad
    	this.startActivity(preg); }
    
    
    if(opcion2.isChecked())
	{
		//creamos intent
	Intent preg1=new Intent(this,Sugerencias.class);
	
	//Inicio de la actividad
	this.startActivity(preg1); }
}

   
}
