import java.util.Random;
public class Questao3Lista2 {
	public static void main(String[] args) {
		/*
		 * 3. Crie um algoritmo que preencha um Array com 100 n ́umeros inteiros aleatoriamente e imprima os
           elementos. Al ́em disso, deve-se realizar a impress ̃ao inversa tamb ́em.
        */
		Random random = new Random();//Criando o objeto Random
		int[] numeros = new int[100];
		for(int i=0;i<100;i++) {
			int numerosGerados = random.nextInt(100);
			numeros[i] = numerosGerados;
			if(numeros.length > 99) {
				System.out.println("Numeros na forma inversa: ");
				for(int j=99; j>=0; j--) {
					System.out.println("Numero: " + numeros[j] + "| Posição: " + j);
				}
			};
		}
	};

}
