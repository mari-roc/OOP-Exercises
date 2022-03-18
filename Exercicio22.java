package ExerciciosLogica;

/*22. Considerando um objeto móvel em movimento uniformemente variado, escreva um programa que receba as seguintes
informações: um valor real indicando posição inicial do móvel P0, um valor real que corresponde a velocidade do móvel
V, um outro valor real A correspondente a aceleração do móvel e um número inteiro correspondente ao tempo decorrido
T. O programa deve calcular a posição final PF do móvel, dado pela relação abaixo:
PF = P0 + V * T + (A * T2
) / 2*/

import java.util.Scanner;

public class Exercicio22 {
	
	public void run() {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um valor real para a posição inicial: ");
		float P = input.nextFloat();
		System.out.println("Digite um valor real que corresponda a velocidade desse objeto: ");
		float V = input.nextFloat();
		System.out.println("\"Digite um valor real que corresponda a velocidade desse objeto: ");
		float A = input.nextFloat();
		System.out.println("Digite um numero inteiro que corresponda ao tempo decorrido em segundos: ");
		int T = input.nextInt();
		
		float PF = P + V * T + (A * (T^2)) / 2;
		
		System.out.print("A Posição final do objeto é: "+ PF);
				
	}

}
