

import java.util.Scanner;

public class Questao5Lista1 {
	
	public static void main(String[] args) {
		/*
		 * Elabore um algoritmo em Java para identificar se um numero  ́e par ou  ́ımpar.
		 * */
		System.out.println("Digite um número: ");
		Scanner x = new Scanner(System.in);
		int num = x.nextInt();
		if (num%2==0) {
			System.out.println("Seu número é par");
		}
		else {System.out.println("Seu número é ímpar");}
		
	} 

}
