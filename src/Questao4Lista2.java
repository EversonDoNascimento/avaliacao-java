import java.util.Random;
public class Questao4Lista2 {
	public static void main(String[] args) {
		/*
		 * 4. Crie um algoritmo que preencha um Array com 100 n ́umeros inteiros aleatoriamente e imprima os
         elementos num ́ericos que sejam primos.*/
		Random random = new Random();
		int[] numeros = new int[100];
		for(int i=0; i<=99;i++) {
			int numerosGerados = random.nextInt(100);
			numeros[i] = numerosGerados;
			
		};
		System.out.print("Os números primos são: ");
		for(int i=0; i<=99;i++) {
			int divisores = 0;
			for(int j=numeros[i]; j >= 1;j--) {
				if(numeros[i] % j == 0) {
				   divisores += 1;
				};
			}
			if(divisores==2) {
				System.out.print("|" + numeros[i]);
			};
			divisores = 0;
			
		};

	};

}

