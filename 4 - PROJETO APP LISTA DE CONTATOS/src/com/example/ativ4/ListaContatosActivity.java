package com.example.ativ4;

import android.os.Bundle;
import android.widget.*;
import android.view.*;
import android.app.*;
public class ListaContatosActivity extends Activity {
	ListView lista_contatos;
@Override
public void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_lista_contatos);
lista_contatos = (ListView) findViewById
(R.id.lista_contatos);


	lista_contatos.setOnItemClickListener(new
				AdapterView.OnItemClickListener() {
@Override
	public void onItemClick(AdapterView<?> parent,
				View view, int position,long id) {
		String nome = ((TextView) view).getText().toString();
			AlertDialog.Builder dialogo = new
						AlertDialog.Builder(ListaContatosActivity.this);
							dialogo.setTitle("Contato");
				dialogo.setMessage("Contato selecionado: " +nome);
				dialogo.setNeutralButton("OK", null);
				dialogo.show();
}
});
}
}