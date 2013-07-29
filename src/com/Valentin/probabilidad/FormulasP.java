package com.Valentin.probabilidad;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class FormulasP extends Activity implements OnClickListener {
	
	Button boton1,boton2,boton3,boton4,boton5,boton6,boton7,borrar; //creo los botones de funciones
	
	TextView resultado, resultado2, resultado3 , a1, b1;
	

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulas_p);
        
        boton1=(Button)findViewById(R.id.btn1);
        boton1.setOnClickListener(this);
        
        boton2=(Button)findViewById(R.id.btn2);
        boton2.setOnClickListener(this);
        
        boton3=(Button)findViewById(R.id.btn3);
        boton3.setOnClickListener(this);
        
        boton4=(Button)findViewById(R.id.btn4);
        boton4.setOnClickListener(this);
        
        boton5=(Button)findViewById(R.id.btn5);
        boton5.setOnClickListener(this);
        
        boton6=(Button)findViewById(R.id.btn6);
        boton6.setOnClickListener(this);
        
        boton7=(Button)findViewById(R.id.btn7);
        boton7.setOnClickListener(this);
        
        borrar=(Button)findViewById(R.id.eliminar);
        borrar.setOnClickListener(this);
        
        a1=(TextView)findViewById(R.id.A1);
        
        b1=(TextView)findViewById(R.id.B1);
        
        //regresa intent que lleva la aplicación
        Intent lanzador=this.getIntent();
      //OBTENER SECUENCIA DE CARACTERES, EL "NOMBRE" ES LO MISMO QUE ESTA EN ACTIVIDAD UNO
        String cad=lanzador.getCharSequenceExtra("A").toString(); 
        String cad1=lanzador.getCharSequenceExtra("B").toString(); 
       //IMPRIMO EN vista
        a1.setText(cad);
        b1.setText(cad1);
        
      
        
        resultado=(TextView)findViewById(R.id.resu);
        
        resultado2=(TextView)findViewById(R.id.resu2);
        
        resultado3=(TextView)findViewById(R.id.resu3);
        
    }

	public void onClick(View v) {
		// TODO Auto-generated method stub
		
			
/* int varInteger
String varString
float varFloat

para pasar de String a int es:
-----varInteger = Int.ParseInt(varString);

para pasar de int o float a String es:
-----varString = String.valueOf(varInteger) o String.valueOf(varFloat)

para pasar de String a float es:
-----varFloat = Float.parseFloat(varString); */
			
		if(R.id.btn1==v.getId()){
			Log.i("Mi mensaje","Pulse el boton 1"); //son mensajes que nadamas los visualiza el programados en LogCat
			
			
			String valor1=a1.getText().toString();//pasandolo a string el edit text
			float nro1=Float.parseFloat(valor1); //pasando string a float
	        float nro2=1;
	        float complemento= (nro2-nro1);
	        String resu=String.valueOf(complemento);		
	        resultado.setText("1 - A");
	        resultado2.setText("1 - " + nro1);	//1-valor1
	        resultado3.setText(resu);
			//resultado3.setText(valor1 + "-" + valor1); //valor1-valor1
			//resultado4.setText(valor1+valor1);//valor1valor1
			
	        
	        
			
		}else if(R.id.btn2==v.getId()){
			Log.i("Mi mensaje","Pulse el boton 2");
			
			String valor1=a1.getText().toString();//pasandolo a string el edit text
			String valor2=b1.getText().toString();//pasandolo a string el edit text
			float nro1=Float.parseFloat(valor1); //pasando string a float
			float nro2=Float.parseFloat(valor2);
	        float union= ((nro1+nro2)-(nro1*nro2));
	        String resu=String.valueOf(union);
	        resultado.setText("(A+B)-(A*B)");
	        resultado2.setText("(" + nro1 + "+" + nro2 + ")-(" + nro1 + "*" + nro2 + ")");
	        resultado3.setText(resu); //imprime resultado como cadena de carácteres.
			
		
		} else if(R.id.btn3==v.getId()){
			Log.i("Mi mensaje","Pulse el boton 3");
			
			String valor1=a1.getText().toString();//pasandolo a string el edit text
			String valor2=b1.getText().toString();//pasandolo a string el edit text
			float nro1=Float.parseFloat(valor1); //pasando string a float
			float nro2=Float.parseFloat(valor2);
	        float interseccion= (nro1*nro2);
	        String resu=String.valueOf(interseccion);
	        resultado.setText("A * B");
	        resultado2.setText("(" + nro1 + "*" + nro2 + ")");
	        resultado3.setText(resu); //imprime resultado como cadena de carácteres.
			
		
		} else if(R.id.btn4==v.getId()){
			Log.i("Mi mensaje","Pulse el boton 4");
			
			String valor1=a1.getText().toString();//pasandolo a string el edit text
			String valor2=b1.getText().toString();//pasandolo a string el edit text
			float nro1=Float.parseFloat(valor1); //pasando string a float
			float nro2=Float.parseFloat(valor2);
	        float union1= (1-(nro1*nro2));
	        String resu=String.valueOf(union1);
	        resultado.setText("1 - (A*B)");
	        resultado2.setText("1 - (" + nro1 + "*" + nro2 + ")");
	        resultado3.setText(resu); //imprime resultado como cadena de carácteres.
			
		
		} else if(R.id.btn5==v.getId()){
			Log.i("Mi mensaje","Pulse el boton 5");
			
			String valor1=a1.getText().toString();//pasandolo a string el edit text
			String valor2=b1.getText().toString();//pasandolo a string el edit text
			float nro1=Float.parseFloat(valor1); //pasando string a float
			float nro2=Float.parseFloat(valor2);
	        float interseccion1= (1-((nro1+nro2)-(nro1*nro2)));
	        String resu=String.valueOf(interseccion1);
	        resultado.setText("1 - ((A+B)-(A*B))");
	        resultado2.setText("1 - ((" + nro1 + "+" + nro2 + ")-(" + nro1 + "*" + nro2 + "))");
	        resultado3.setText(resu); //imprime resultado como cadena de carácteres.
			
		
		} else if(R.id.btn6==v.getId()){
			Log.i("Mi mensaje","Pulse el boton 6");
			
			String valor1=a1.getText().toString();//pasandolo a string el edit text
			String valor2=b1.getText().toString();//pasandolo a string el edit text
			float nro1=Float.parseFloat(valor1); //pasando string a float
			float nro2=Float.parseFloat(valor2);
	        float interseccion1= (nro2-(nro1*nro2));
	        String resu=String.valueOf(interseccion1);
	        resultado.setText("B - (A*B)");
	        resultado2.setText( nro2 + " - (" + nro1 + "*" + nro2 + ")");
	        resultado3.setText(resu); //imprime resultado como cadena de carácteres.
			
		
		} else if(R.id.btn7==v.getId()){
			Log.i("Mi mensaje","Pulse el boton 7");
			
			String valor1=a1.getText().toString();//pasandolo a string el edit text
			String valor2=b1.getText().toString();//pasandolo a string el edit text
			float nro1=Float.parseFloat(valor1); //pasando string a float
			float nro2=Float.parseFloat(valor2);
	        float interseccion1= (nro1-(nro1*nro2));
	        String resu=String.valueOf(interseccion1);
	        resultado.setText("A - (A*B)");
	        resultado2.setText( nro1 + " - (" + nro1 + "*" + nro2 + ")");
	        resultado3.setText(resu); //imprime resultado como cadena de carácteres.
			
		
		} else if(R.id.eliminar==v.getId()){
			Log.i("Mi mensaje","Pulse el boton Borrar");
			//Mandar a llamar clase
			Borrar();
		}
			
		
		
	}
	
	public void Borrar(){ //metodo para borrar
		
		resultado.setText("");
		resultado2.setText("");
		resultado3.setText("");
		}
	
	public void atras(View v) {
		
		Intent inten1=new Intent(this,Captura.class);
		this.startActivity(inten1);
	}
	
public void finalizar(View v) {
		
		Intent inten1=new Intent(this,Pregunta.class);
		this.startActivity(inten1);
	}

    
}
