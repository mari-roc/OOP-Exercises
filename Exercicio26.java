package ExerciciosLogica;

/*26. Escreva um programa que calcule a soma de N n�meros quaisquer fornecidos pelo usu�rio. O programa deve parar de ler
e, portanto somar os valores quando for introduzido o n�mero 0 (zero). */

import java.util.Scanner;

public class Exercicio26 {
	
	public void run() {
		
		int soma =0;
		int valor;
		
		do {
			Scanner input = new Scanner(System.in);
			System.out.print("Digite um valor inteiro ou [0] para finalizar: \n");
			valor = input.nextInt();
			soma = soma+valor;
		
		}while(valor != 0);
		
		System.out.println("o resultado �: "+ soma);
		
	}

}
