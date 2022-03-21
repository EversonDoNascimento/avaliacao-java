import java.util.Random;
public class arrayBidimensional {
	public static void main(String[] args) {

		int[][] array1 = new int[3][3];
		int[][] array2 = new int[3][3];
		int[][] resultado = new int[3][3];
		
		for(int linha = 0; linha<array1.length; linha++) {
			for(int coluna = 0; coluna<array1[0].length; coluna++) {
				Random random1 = new Random();
				int numerosGerados1 = random1.nextInt(100);
				Random random2 = new Random();
				int numerosGerados2 = random2.nextInt(100);
				array1[linha][coluna] = numerosGerados1;
				array2[linha][coluna] = numerosGerados2;
				resultado[linha][coluna] = array1[linha][coluna] - array2[linha][coluna];
			}
		}

		for(int i = 0; i<array1.length; i++) {
			for(int j = 0; j<array1[0].length; j++) {
				System.out.print(resultado[i][j]+"|");
			}
			System.out.println();
		
	}

		
	}
}
