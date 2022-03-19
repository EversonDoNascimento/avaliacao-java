import java.util.Random;

public class Questao6Lista2 {
	   public static void main(String[] args) {
		   /*
		    * 5. Crie um algoritmo que preencha um Array com 100 n ́umeros inteiros aleatoriamente e imprima os
	             elementos num ́ericos que sejam  ́pares.
		    */
		   
		   int[] numeros = new int[100];
		   Random random = new Random();
		   for (int i = 0; i < 100; i++) {
			   int numerosGerados = random.nextInt(100);
			   numeros[i] = numerosGerados; 
			   if (numeros[i]%2==0) {
				   System.out.println(numeros[i]);
			   }
		   }
	   }
	


}
