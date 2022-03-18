package ExerciciosLogica;

/*11.Escreva um programa que leia dois números inteiros A e B quaisquer indicando se A é múltiplo de B ou se B é múltiplo
de A.*/

import java.util.Scanner;

public class Exercicio11 {
	
	public void run() {
		
		Scanner input = new Scanner(System.in);		
		System.out.println("Digite o valor de A: ");
		int a = input.nextInt();
		System.out.println("Digite o valor de B: ");
		int b = input.nextInt();
		
		if (a%b==0){
			System.out.println(+ a + " é multiplo de "+b);
		}else {
			System.out.println(+ a + " não é multiplo de "+b);
		}
		if (b%a==0){
			System.out.println(+ b + " é multiplo de "+a);
		}else {
			System.out.println(+ b + " não é multiplo de "+a);
			}
		}

}
