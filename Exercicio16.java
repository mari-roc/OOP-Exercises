package ExerciciosLogica;

/*16. Preparar um programa para ler as medidas da base e da altura de um triângulo, calculando e imprimindo sua área,
sabendo que o cálculo da área é dado por:
area = (base*altura)/2.*/

import java.util.Scanner;

public class Exercicio16 {
	
	public void run() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Base do triangulo (b): \n");
		float b = input.nextFloat();
		
		System.out.print("Altura do triangulo (h): \n");
		float h = input.nextFloat();
		
		float area = (b*h)/2;
		
		System.out.print("Area do triangulo: "+area);

	}

}
