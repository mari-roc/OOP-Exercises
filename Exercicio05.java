package ExerciciosLogica;

//5.Dado um número inteiro qualquer, fornecido pelo usuário, descobrir se o mesmo é par ou ímpar.

import java.util.Scanner;

public class Exercicio05 {
	
	public void run() {
		
		Scanner input = new Scanner(System.in);		
		System.out.println("Digite um numero inteiro qualquer: ");
		int valor = input.nextInt();
		if((valor % 2 )==0) {
			System.out.println("O valor lido: "+ valor + " e par");
		}else {
			System.out.println("O valor lido: "+ valor + " e impar");
			}
		}

}
