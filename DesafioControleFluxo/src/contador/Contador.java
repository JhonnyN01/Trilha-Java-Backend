package contador;

import java.util.Scanner;

import parametrosInvalidosException.ParametrosInvalidosException;

public class Contador {

	public static void main(String[] args) {

		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parametro");
		int parametroUm = terminal.nextInt();
		
		System.out.println("Digite o segundo parametro");
		int parametroDois = terminal.nextInt();
		System.out.println();
		
		try {
			//chamando o metodo contendo a logica de contagem
			contar(parametroUm, parametroDois);
			
		}catch(ParametrosInvalidosException e) {
			//imprimir a mensagem: O segundo deve ser maior que o primeiro.
			System.out.println("O segundo deve ser maior que o primeiro");			
		}
	}
	
	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
		//validar se parametroUm eh maior parametroDois e lançar a exceção
		if (parametroUm >= parametroDois) {
			throw new ParametrosInvalidosException("O segundo numero deve ser maior que o primeiro");			
		}
		//realizar o for para imprimir os numeros com base na variavel contagem
		for (int i = parametroUm; i <= parametroDois; i++) {			
			System.out.println(i);
		}
		
		//int contagem = parametroDois - parametroUm;		
		
	}

}
