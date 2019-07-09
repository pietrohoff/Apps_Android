package com.example.ativ7;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.widget.*;
import android.view.*;
public class AplicacaoCadastroActivity extends Activity {
Button btcadastarpessoa, btlistarpessoas;
Button btcadastrar, btcancelar;
Button btvoltar, btavancar, btmenu_principal;
TextView txtnome,txtprofissao,txtidade;
EditText ednome, edprofissao, edidade;
Registro pri,ult, reg, aux, anterior;
int numero_registros = 0;
int posicao;
@Override
public void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
CarregarTelaPrincipal();
}
public void CarregarTelaPrincipal()
{
setContentView
(R.layout.activity_aplicacao_cadastro);
btcadastarpessoa = (Button) findViewById(R.id.btcadastrarpessoa);
btlistarpessoas = (Button) findViewById(R.id.btlistarpessoas);
btcadastarpessoa.setOnClickListener(new
View.OnClickListener() {
@Override
public void onClick(View arg0) {
CarregarTelaCadastro();
}
});
btlistarpessoas.setOnClickListener(new
View.OnClickListener() {
@Override
public void onClick(View arg0) {
CarregarTelaListagemPessoas();
}
});
}
public void CarregarTelaCadastro()
{
setContentView(R.layout.cadastro);
ednome = (EditText) findViewById(R.id.ednome);
edprofissao = (EditText) findViewById(R.id.edprofissao);
edidade = (EditText) findViewById(R.id.edidade);
btcadastrar = (Button) findViewById(R.id.btcadastrar);
btcancelar = (Button) findViewById(R.id.btcancelar);
btcadastrar.setOnClickListener(new
View.OnClickListener() {
@Override
public void onClick(View arg0) {
anterior = reg;
reg = new Registro();
reg.nome = ednome.getText().toString();
reg.profissao = edprofissao.getText().toString();
reg.idade = edidade.getText().toString();
if(pri == null)
pri = reg;
if(ult == null)
ult = reg;
else {
ult.prox = reg;
ult = reg;
ult.ant = anterior;
}
numero_registros++;
ExibirMensagem("Registro cadastrado com sucesso");

CarregarTelaPrincipal();
}
});
btcancelar.setOnClickListener(new
View.OnClickListener() {
@Override
public void onClick(View arg0) {
CarregarTelaPrincipal();
}
});
}
public void CarregarTelaListagemPessoas()
{
if(numero_registros == 0)
{
ExibirMensagem("Nenhum registro cadastrado");
CarregarTelaPrincipal();
return;
}
else {
setContentView(R.layout.lista_pessoas_cadastradas);
btvoltar = (Button) findViewById(R.id.btvoltar);
btavancar = (Button) findViewById(R.id.btavancar);
btmenu_principal = (Button)
findViewById(R.id.btmenu_principal);
txtnome = (TextView) findViewById(R.id.txtnome);
txtprofissao = (TextView)
findViewById(R.id.txtprofissao);
txtidade = (TextView) findViewById(R.id.txtidade);
aux = pri;
posicao = 1;
txtnome.setText(aux.nome);
txtprofissao.setText(aux.profissao);
txtidade.setText(aux.idade);
btvoltar.setOnClickListener(new
View.OnClickListener() {
@Override
public void onClick(View v) {
if(posicao == 1)
return;
posicao--;
aux = aux.ant;
txtnome.setText(aux.nome);
txtprofissao.setText(aux.profissao);
txtidade.setText(aux.idade);
}
});
btavancar.setOnClickListener(new
View.OnClickListener() {
@Override
public void onClick(View v) {
if(posicao == numero_registros)
return;
posicao++;
aux = aux.prox;
txtnome.setText(aux.nome);
txtprofissao.setText(aux.profissao);
txtidade.setText(aux.idade);
}
});
btmenu_principal.setOnClickListener(new
View.OnClickListener() {
@Override
public void onClick(View v) {
CarregarTelaPrincipal();
}
});
}
}
public void ExibirMensagem(String mensagem){
AlertDialog.Builder dialogo = new AlertDialog.
Builder(AplicacaoCadastroActivity.this);
dialogo.setTitle("Aviso");
dialogo.setMessage(mensagem);
dialogo.setNeutralButton("OK", null);
dialogo.show();
}
}