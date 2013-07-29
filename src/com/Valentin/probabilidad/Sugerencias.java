package com.Valentin.probabilidad;


import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;



public class Sugerencias extends Activity {

	int cadena1=0,opc1; 
	RadioButton radio1, radio2, radio3;
	RadioGroup radiogrupo;
	Boolean presione1=false,presione2=false,presione3=false;
	EditText comentario;
	String comment1,c2;

    /** Called when the activity is first created. */

    @Override

    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sugerencias);
        
        
        radio1=(RadioButton)findViewById(R.id.radio0);
        radio2=(RadioButton)findViewById(R.id.radio1);
        radio3=(RadioButton)findViewById(R.id.radio2);
        radiogrupo=(RadioGroup)findViewById(R.id.radg);
        comentario=(EditText)findViewById(R.id.comentario);
        
        
        radiogrupo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
			
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				
				
				if(radio1.getId()==checkedId){
					presione1=true;
					presione2=false;
					presione3=false;
				}
				if(radio2.getId()==checkedId){
					presione1=false;
					presione2=true;
					presione3=false;
				}
				if(radio3.getId()==checkedId){
					presione1=false;
					presione2=false;
					presione3=true;
				}
				
			}
		});
 

       
    }
    
   
    
  
    public void envbund (View v){
    	   	
    	
    	Toast.makeText(this, "Pon la opción de enviar correo por Gmail o Hotmail ", Toast.LENGTH_LONG).show();
 	   
    	   
    	
    	if(presione1==true){
    		cadena1=1;
    	}
    	if(presione2==true){
    		cadena1=2;
    	}
    	if(presione3==true){
    		cadena1=3;
    	}
    	
    	
      

    	Bundle caja=new Bundle();
       	caja.putInt("SUG", cadena1);
       	opc1=caja.getInt("SUG");
       	
       	comment1=comentario.getText().toString();
       	
       	
       	caja.putCharSequence("com", comment1);
       	c2=caja.getString("com");
       	
    	
    	
       	
       // probando la función	Toast.makeText(this,"holo " + opc1 + " " + c2, Toast.LENGTH_LONG).show();
       	
       
       
       	
       	
     // enviar un mail

       Intent intent = new Intent(Intent.ACTION_SEND);
       
   	        intent.setType("text/plain");

        intent.putExtra(Intent.EXTRA_SUBJECT, "" + opc1);

        intent.putExtra(Intent.EXTRA_TEXT, "" + c2 );

        intent.putExtra(Intent.EXTRA_EMAIL, new String[] {"valefcfhc@gmail.com" });

         
        this.startActivity(intent);
       	
       //	Intent juegoCuatro=new Intent(this,Final.class);
    	//juegoCuatro.putExtras(caja);
    	//this.startActivity(juegoCuatro);
       }
       
    	
    	///////
    
    
    public void salir1(View v) 
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

 
    
    public void tuiter (View v)
    {
    	 // Web

       Intent tui = new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/ValeFCF"));

       // createButton("Web", intent);
    	//Inicio de la actividad
    	this.startActivity(tui);
    }
    
    public void faisbuk (View v)
    {
    	 // Web

       Intent fais = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/valefcfhc"));

       // createButton("Web", intent);
    	//Inicio de la actividad
    	this.startActivity(fais);
    }
    
}


