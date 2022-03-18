package ExerciciosLogica;

/*14. Escreva um programa que leia 3 notas (valores reais), calculando e exibindo sua média aritmética. Imprima também
"Aprovado" se a média for maior que 7, "Reprovado" se for menor que 3 e "Exame" se estiver entre 3 e 7.*/

import java.util.Scanner;

public class Exercicio14 {
	
	public void run() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Primeira nota: ");
		float n1 = input.nextFloat();
		System.out.print("Segunda nota: ");
		float n2 = input.nextFloat();
		System.out.print("Terceira nota: ");
		float n3 = input.nextFloat();
		
		float media;
		media = (n1 + n2 + n3) / 3; 
		
		if(media>7){
			System.out.println("Nota: "+ media);
			System.out.println("Aprovado");
			}
		 else if(media>3 && media<7) {
			System.out.println("Nota: "+ media);
			System.out.println("Exame");
		 	}
		else if(media<3) {
			System.out.println("Nota: "+ media);
			System.out.println("Reprovado");
			}
	}

}
