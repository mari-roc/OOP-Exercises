package ExerciciosLogica;

/*20. Escreva um programa que leia um valor real correspondente a uma medida em metros, convertendo o valor dado em p�s
(1 metro = 3.315 p�s), exibindo os valores dado e convertido. Caso o usu�rio forne�a um valor negativo, deve ser exibida
uma mensagem e a opera��o de convers�o n�o deve ser efetuada. */

import java.util.Scanner;

public class Exercicio20 {
	
	public void run() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um valor para os metros pertencentes aos reais: ");
		float m = input.nextFloat();
		
		float p = m *3315;
		
		if(m < 0) {
			System.out.println("a opera��o de convers�o n�o pode ser efetuada. ");
		}else {
			System.out.println((m)+ "em Pes e igual "+ (p));
		}
		
	}

}
