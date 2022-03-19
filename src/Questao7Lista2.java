import java.util.Random;
public class Questao7Lista2 {
	public static void main(String[] args) {
	/*
	 * 7. Crie um algoritmo que preencha um Array com 100 n ́umeros inteiros aleatoriamente e imprima o maior
          e menor elemento.*/
	

	int[] numeros = new int[100];
	Random random = new Random();
	int menorValor = 100;
	int indiceMaior = 0;
	int maiorValor = 0;
	int indiceMenor = 0;
	for(int i=0;i<100;i++) {
		int numerosGerados = random.nextInt(100);
		numeros[i] = numerosGerados;
		if(maiorValor<numeros[i]) {
			maiorValor = numeros[i];
			indiceMaior = i;
		}
		else if(menorValor>numeros[i]) {
			menorValor = numeros[i];
			indiceMenor = i;
		}		
	}
	System.out.println("O maior valor foi: " +maiorValor+ " Se encontra no indice: " + indiceMaior);
	System.out.println("O menor valor foi: " +menorValor+ " Se encontra no indice: " + indiceMenor);
	}
}
