package ExerciciosLogica;

/*11.Escreva um programa que leia dois n�meros inteiros A e B quaisquer indicando se A � m�ltiplo de B ou se B � m�ltiplo
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
			System.out.println(+ a + " � multiplo de "+b);
		}else {
			System.out.println(+ a + " n�o � multiplo de "+b);
		}
		if (b%a==0){
			System.out.println(+ b + " � multiplo de "+a);
		}else {
			System.out.println(+ b + " n�o � multiplo de "+a);
			}
		}

}
