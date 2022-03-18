package ExerciciosLogica;

//25.Faça um programa que calcule a soma de N números quaisquer fornecidos pelo usuário. 

import java.util.Scanner;

public class Exercicio25 {
	
	public void run() {
		
		int soma =0;
		int valor;
		int x=1;
		
		while(x > 0) {
			Scanner input = new Scanner(System.in);
			System.out.print("Digite um numero a ser somado: ");
			valor = input.nextInt();
			soma = soma+valor;
			System.out.print("Deseja fazer mais uma soma? se sim, um numero qualquer, caso queira sair digite um numero menor que 0");
			x = input.nextInt();
		}
		System.out.print("A soma de valores digitados é : "+ soma);
	}	


}
