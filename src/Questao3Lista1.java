
import java.util.Scanner;
public class Questao3Lista1 {
	
	public static void main(String[] args) {
		/*3. Escreva um algoritmo em Java para realizar o calculo de  ́area de um trapezio retangulo. Todas as
             entradas do usuario devem estar em cm. A saıda do algoritmo deve ser a  ́area do trapezio em cm2 no
             console (e.g. ”A  ́area do trap ́ezio em cm2  ́e ”). A f ́ormula  ́e*/
		
		Scanner x = new Scanner(System.in);
		Scanner y = new Scanner(System.in);
		Scanner z = new Scanner(System.in);
		System.out.println("Digite a base maior: ");
		double baseMaior = x.nextDouble();
		System.out.println("Digite a base menor: ");
		double baseMenor = y.nextDouble();
		System.out.println("Digite a altura: ");
		double altura = z.nextDouble();
		double area = ((baseMaior + baseMenor) * altura)/2;
		System.out.println("O Resultado da área do Trapézio é: " + area + " cm2");	

	}

}
