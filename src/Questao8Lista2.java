import java.util.Random;
public class Questao8Lista2 {
	public static void main(String[] args) {
		/*8. Crie um algoritmo que preencha um Array com 100 n ́umeros inteiros aleatoriamente e realize o c ́alculo
             da m ́edia aritm ́etica.*/
		Random random = new Random();
		int[] numeros = new int[100];
		int acumulador = 0;
		for(int i=0;i<100;i++) {
			int gerarNumeros = random.nextInt(100);
			numeros[i] = gerarNumeros;
			acumulador += gerarNumeros;
			
		}
		double media = acumulador/100;
		System.out.println("A media dos numeros gerados foi: " + media);
	}
}
