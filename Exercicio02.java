package ExerciciosLogica;


/*2. Escreva um programa que leia um n�mero real fornecido pelo usu�rio, 
 * armazenando-o numa vari�vel apropriada.
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
