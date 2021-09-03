package projetoTabuada;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {

		int multiplicando;
		int maximoMultiplicador;
		int contador = 0;

		Scanner leitor = new Scanner(System.in);

		System.out.println("Qual será o multiplicando? ");
		multiplicando = leitor.nextInt();

		System.out.println("Qual será o máximo multiplicador? ");
		maximoMultiplicador = leitor.nextInt();

		System.out.println("Tabuada do " + multiplicando);

		System.out.println("---------------------------");

		while (contador <= maximoMultiplicador) {

			System.out.println(multiplicando + "X" + contador + "=" + multiplicando * contador);

			contador ++;
		}
		
		System.out.println("---------------------------");
	
	}

}
