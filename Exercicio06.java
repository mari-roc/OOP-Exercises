package ExerciciosLogica;

/*6. Escreva um programa que leia dois valores, os quais denominaremos A e B,
fornecidos pelo usu�rio, exibindo respostas
F ou V para as seguintes quest�es:
(a) A � maior que zero?
(b) B � maior que zero; 
(c) A E B s�o maiores do que zero?
Use operadores l�gicos para formular as express�es necess�rias a avalia��o dos valores.*/

import java.util.Scanner;

public class Exercicio06 {
	
	public void run() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o valor de A: ");
		float a = input.nextFloat();
		System.out.print("Digite o valor de B: ");
		float b = input.nextFloat();
		
		System.out.println(" [A] � maior que zero? " + ((a >0) ? "verdadeiro" : "falso"));
		System.out.println(" [B] e maior que zero?"  + ((b >0) ? "verdadeiro" : "falso"));
		System.out.println(" [A] E [B] sao maiores do que zero?" + (((a >0)&&(b >0)) ? "verdadeiro" : "falso"));
		
	}

}
