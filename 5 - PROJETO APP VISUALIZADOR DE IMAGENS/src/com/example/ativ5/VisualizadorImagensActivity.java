package com.example.ativ5;

import android.os.Bundle;
import android.app.Activity;
import android.widget.*;
import android.view.*;
public class VisualizadorImagensActivity extends Activity {
ImageView imgfoto;
Button btfoto1,btfoto2;
TextView txtinformacao;

@Override
public void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView
(R.layout.activity_visualizador_imagens);
imgfoto = (ImageView) findViewById(R.id.imgfoto);
btfoto1 = (Button) findViewById(R.id.btfoto1);
btfoto2 = (Button) findViewById(R.id.btfoto2);
txtinformacao = (TextView) findViewById
(R.id.txtinformacao);
btfoto1.setOnClickListener(new View.
OnClickListener() {
@Override
public void onClick(View arg0) {
imgfoto.setImageResource
(R.drawable.foto1);
txtinformacao.setText("Foto 1");
}
});
btfoto2.setOnClickListener(new View.OnClickListener()
{
@Override
public void onClick(View arg0) {
imgfoto.setImageResource
(R.drawable.foto2);
txtinformacao.setText("Foto 2");
}
});
}
}
