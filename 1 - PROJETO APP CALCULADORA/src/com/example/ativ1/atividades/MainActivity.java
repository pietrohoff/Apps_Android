package com.example.ativ1.atividades;

import android.app.Activity;
import android.widget.*;
import android.view.*;
import android.app.*;
import android.os.Bundle;

public class MainActivity extends Activity {
	
	EditText ednumero1, ednumero2;
	Button btsomar, btsub, btdiv, btmultiplicacao;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ednumero1 = (EditText) findViewById(R.id.ednumero1);
		ednumero2 = (EditText) findViewById(R.id.ednumero2);
		btsomar = (Button) findViewById(R.id.btsomar);
		btsub = (Button) findViewById(R.id.btsub);
		btmultiplicacao = (Button) findViewById(R.id.btmultiplicaao);
		btdiv = (Button) findViewById(R.id.btdiv);
		
		btsub.setOnClickListener(new View.OnClickListener() {
			
			
			public void onClick(View v) {
				double num1 = Double.parseDouble(ednumero1.getText().toString());
				double num2 = Double.parseDouble(ednumero2.getText().toString());
				double sub = num1-num2;
				
				AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);
				dialogo.setTitle("Resultado subtração");
				dialogo.setMessage("A subtração é: "+ sub);
				dialogo.setNeutralButton("OK", null);
				dialogo.show();
				
				
			}
		});
		
			btmult.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				double num1 = Double.parseDouble(ednumero1.getText().toString());
				double num2 = Double.parseDouble(ednumero2.getText().toString());
				double mult = num1*num2;				
				AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);
				dialogo.setTitle("Resultado multiplicação");
				dialogo.setMessage("A multiplicação é: "+ mult);
				dialogo.setNeutralButton("OK", null);
				dialogo.show();
				
				
			}
		});
			
			btdiv.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					double num1 = Double.parseDouble(ednumero1.getText().toString());
					double num2 = Double.parseDouble(ednumero2.getText().toString());
					double div = num1/num2;
					
					AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);
					dialogo.setTitle("Resultado multiplicação");
					dialogo.setMessage("A divisão é: "+ div);
					dialogo.setNeutralButton("OK", null);
					dialogo.show();
					
					
				}
			});

		
		
		
		btsomar.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				double num1 = Double.parseDouble(ednumero1.getText().toString());
				double num2 = Double.parseDouble(ednumero2.getText().toString());
				double soma = num1+num2;
				
				AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);
				
				dialogo.setTitle("Resultado soma");
				dialogo.setMessage("A soma é: " + soma);
				dialogo.setNeutralButton("OK", null);
				dialogo.show();
				
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
