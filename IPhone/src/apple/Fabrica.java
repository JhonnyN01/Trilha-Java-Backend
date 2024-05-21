package apple;

import aparelhotelefonico.AparelhoTelefonico;
import iphone.Iphone;
import navegadordeinternet.ExibirPagina;
import reprodutormusical.ReprodutorMusical;

public class Fabrica {

	public static void main(String[] args) {
		
		Iphone em = new Iphone();
		ReprodutorMusical tocarepausar = em;
		AparelhoTelefonico ligando = em;
		ExibirPagina paginaweb = em;
		
		tocarepausar.tocarepausar();
		ligando.ligando();
		paginaweb.paginaweb();

	}

}
