package ExerciciosLogica;

/*22. Considerando um objeto m�vel em movimento uniformemente variado, escreva um programa que receba as seguintes
informa��es: um valor real indicando posi��o inicial do m�vel P0, um valor real que corresponde a velocidade do m�vel
V, um outro valor real A correspondente a acelera��o do m�vel e um n�mero inteiro correspondente ao tempo decorrido
T. O programa deve calcular a posi��o final PF do m�vel, dado pela rela��o abaixo:
PF = P0 + V * T + (A * T2
) / 2*/

import java.util.Scanner;

public class Exercicio22 {
	
	public void run() {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um valor real para a posi��o inicial: ");
		float P = input.nextFloat();
		System.out.println("Digite um valor real que corresponda a velocidade desse objeto: ");
		float V = input.nextFloat();
		System.out.println("\"Digite um valor real que corresponda a velocidade desse objeto: ");
		float A = input.nextFloat();
		System.out.println("Digite um numero inteiro que corresponda ao tempo decorrido em segundos: ");
		int T = input.nextInt();
		
		float PF = P + V * T + (A * (T^2)) / 2;
		
		System.out.print("A Posi��o final do objeto �: "+ PF);
				
	}

}
