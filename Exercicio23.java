package ExerciciosLogica;

/*23. Escreva um programa que receba as seguintes informações: um valor real indicando capital inicial PV, um valor real que
corresponde a taxa de juros da aplicação J e um número inteiro de períodos da aplicação N. O programa deve retornar o
capital futuro FV dado pela relação abaixo:
FV = PV * ( 1 + J )n*/

import java.util.Scanner;
import java.math.*;

public class Exercicio23 {
	
	public void run() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um valor real para o capital inicial: ");
		float PV = input.nextFloat();
		System.out.println("Digite um valor real que corresponda a taxa de juros: ");
		float J = input.nextFloat();
		System.out.println("Digite um numero inteiro que corresponda a quantidade de meses que ira durar o perodo:  ");
		int N = input.nextInt();
		
		double FV = PV * Math.pow(( 1 + J ),N);
		
		System.out.println("Depois de "+ N +" meses o capital futuro sera: "+FV);
		
	}


}
