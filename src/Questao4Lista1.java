

import java.util.Scanner;

public class Questao4Lista1 {
	public static void main(String[] args) {
		
		/*
		 * Construa um algoritmo que faca a leitura de dois numeros inteiros e imprima no console qual n ́umero
 ́          e o maior, se o primeiro ou o segundo.
		 * 
		 * */
		/*
		Scanner ler = new Scanner(System.in);
		int recebe = ler.nextInt();
		System.out.println(recebe);
		*/
		System.out.println("Digite o primeiro número: ");
		Scanner x = new Scanner(System.in);
		int num1 = x.nextInt(); 
		System.out.println("Digite o segundo número: ");
		Scanner y = new Scanner(System.in);
		int num2 = y.nextInt();
		System.out.println("Os números foram: " + num1 + " e " + num2);
		if ( num1 > num2) {
			System.out.println("O maior número é: " + num1);
		}
		else {
			System.out.println("O maior número é: " + num2);
		}
		
	}

}
