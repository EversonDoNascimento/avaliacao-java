import java.util.Scanner;
public class Questao2Lista2 {
	public static void main(String[] args) {
		/*
		 2. Dada a entrada de 10 inteiros em sequˆencia, realize a impress ̃ao da entrada inicial de forma inversa.
		 * */
		
		int[] sequencia = new int[10];
		int count = 0;
		for(int i=0;i<10;i++) {
			count += 1;
			System.out.println("Digite um número inteiro: ");
			Scanner numerosEntrada = new Scanner(System.in);
			int numeros = numerosEntrada.nextInt();
			sequencia[i] = numeros;
			if (count > 9) {
				System.out.print("Números em ordem inversa: ");
				for(int j=9;j>-1;j--) {
					System.out.print( sequencia[j] + " | ");
				}
				
			}
		}
		

		
	};

}
