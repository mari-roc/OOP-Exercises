package ExerciciosLogica;

/*3. Leia um número qualquer fornecido pelo usuário. 
Determine se o número é maior do que 50, imprimindo uma mensagem
indicando tal fato.*/

import java.util.Scanner;

public class Exercicio03 {
	
	public void run() {
		
		Scanner input = new Scanner(System.in);		
		System.out.println("Digite um numero qualquer: ");
		int valor = input.nextInt();
		if(valor >= 50) {
			System.out.println("O Valor lido: "+ valor + " e > ou = a 50!");
		}else {
			System.out.println("Valor lido: "+ valor + " e < 50!");
		}
	}	
}
