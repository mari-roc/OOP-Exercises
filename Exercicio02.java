package ExerciciosLogica;


/*2. Escreva um programa que leia um número real fornecido pelo usuário, 
 * armazenando-o numa variável apropriada.
	Imprima o valor lido.*/

import java.util.Scanner;

public class Exercicio02 {
	
	public void run() {
		
		Scanner input = new Scanner(System.in);		
		System.out.println("Digite um numero real: ");
		float valor = input.nextInt();
		System.out.println("Valor real lido foi: "+ valor);
		
	}

}
