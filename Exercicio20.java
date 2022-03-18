package ExerciciosLogica;

/*20. Escreva um programa que leia um valor real correspondente a uma medida em metros, convertendo o valor dado em pés
(1 metro = 3.315 pés), exibindo os valores dado e convertido. Caso o usuário forneça um valor negativo, deve ser exibida
uma mensagem e a operação de conversão não deve ser efetuada. */

import java.util.Scanner;

public class Exercicio20 {
	
	public void run() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um valor para os metros pertencentes aos reais: ");
		float m = input.nextFloat();
		
		float p = m *3315;
		
		if(m < 0) {
			System.out.println("a operação de conversão não pode ser efetuada. ");
		}else {
			System.out.println((m)+ "em Pes e igual "+ (p));
		}
		
	}

}
