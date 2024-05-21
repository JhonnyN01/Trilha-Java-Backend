package iphone;

import aparelhotelefonico.AparelhoTelefonico;
import navegadordeinternet.ExibirPagina;
import reprodutormusical.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, ExibirPagina {

	public void tocarepausar() {
		System.out.println("Tocando e pausando a musica pelo IPhone");
		
	}

	public void ligando() {
		System.out.println("Desligando e Fazendo Ligação pelo IPhone");
		
	}

	public void paginaweb() {
		System.out.println("Acessando e navegando na Pagina Web pelo IPhone");
		
	}
	
	
}
