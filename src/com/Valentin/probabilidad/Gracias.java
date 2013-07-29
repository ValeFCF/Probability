package com.Valentin.probabilidad;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;



public class Gracias extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gracias);
          
    }
    
    public void salir(View v) 
    {
    	//Salir de toda la aplicación
    	
    	Intent oIntent;
    	oIntent = new Intent();
        oIntent.setAction(Intent.ACTION_MAIN);
        oIntent.addCategory(Intent.CATEGORY_HOME);
        oIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(oIntent); 
        android.os.Process.killProcess(android.os.Process.myPid());
    	
    }
    
}

  
    

