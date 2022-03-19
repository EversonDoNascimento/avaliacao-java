
import java.util.Scanner;
public class Questao2Lista1 {

	public static void main(String[] args) {
		/*
		 * Crie um algoritmo em Java para realizar o c ́alculo de IMC. A saıda do algoritmo deve ser o valor do
           IMC no console (e.g. ”O valor do seu IMC  ́e ”). A formula  ́e:
           IMC = peso/altura2
		 * */
		System.out.print("Digite seu peso:");
		Scanner pesoEntrada = new Scanner(System.in);
		float peso = pesoEntrada.nextFloat();
		System.out.println("Digite sua altura: ");
		Scanner alturaEntrada = new Scanner(System.in);
		float altura = alturaEntrada.nextFloat();
		float result = peso/(altura*altura);
		
		System.out.println("O seu indice de massa corporal é: " + result +".");
		if (result < 18.0) {
			System.out.println("Você está abaixo do peso!");
		}
		else if(result > 18.0 && result < 24.0) {
			System.out.println("Você está no peso ideal!");
			
		}
		else {
			System.out.println("Você está acima do peso!");
		}
	}

}
