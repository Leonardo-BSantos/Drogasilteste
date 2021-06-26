package steps;

import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;

public class Estoria1 {

	Metodos metodo = new Metodos();
	Elementos el = new Elementos();
	
	@Given("eu esteja na pagina principal")
	public void eu_esteja_na_pagina_principal() {
	  metodo.abrirNavegador("https://m2-stage.drogasil.com.br");
	  metodo.pausa(10000);
	 }

	@When("clique no icone do chat online")
	public void clique_no_cone_do_chat_online() {
	  metodo.clicar(el.getBtnCookies());
	  metodo.pausa(5000);
	  metodo.clicar(el.getChatOnline());
	  metodo.pausa(5000);
	  metodo.escrever(el.getEscreverChat(), "teste tribo 6");
	  metodo.pausa(2000);
	  metodo.clicar(el.getBtnEntercht());
	  metodo.pausa(2000);
	  metodo.clicar(el.getBtnFechar());
	  metodo.pausa(3000);
	  
	}

	@When("escreva o nome do produto no campo de pesquisa e coloque no carrinho")
	public void escreva_o_nome_do_produto_no_campo_de_pesquisa_e_clique_em_procurar() {
	
		metodo.clicar(el.getCampoPesquisa());
		metodo.pausa(2000);
		metodo.escrever(el.getCampoPesquisa(), "doril");
		metodo.pausa(2000);
		metodo.clicar(el.getBtnProc());
		metodo.pausa(5000);
		metodo.clicar(el.getBtnProduto());
		metodo.pausa(2000);
		metodo.clicar(el.getBtnComprar());
	}

	@Then("valido as informacoes")
	public void valido_as_informacoes() {
	  
	}

}
