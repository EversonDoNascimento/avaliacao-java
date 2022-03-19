import java.util.Scanner;

public class Questao1Lista2 {
	public static void main(String[] args) {
		//double[] notas = new double[5];
		double notas = 0;
		for(int i = 0; i < 5;i++) {
			System.out.println("Digite a nota do aluno "+ "[" + i + "]");
			Scanner alunosNotas = new Scanner(System.in);
			double notas1 = alunosNotas.nextDouble();
			notas += notas1;
			
		};
		double media = notas/5.0;
		System.out.println("A média das notas dos alunos foi:" + media);
	};

}
