
public class Questao03Lista03 {
	
	public static void main(String[] args) {
		/*
		 * 3. Realize a opera ̧c ̃ao de multiplica ̧c ̃ao entre as matrizes abaixo descritas. Sabendo da necessidade das
              matrizes terem os requisitos de dimens ̃ao para tal opera ̧c ̃ao, quantidade de elementos na coluna da
              matriz A ser igual a quantidade de linhas da matriz B, implemente no algoritmo a checagem antes de
              efetuar a multiplica ̧c ̃ao.
		 * */
		
		
		int[][] matriz1 = {{3,4,5},{5,6,1}};
		int[][] matriz2 = {{10,1},{3,5},{0,21}};
		int[][] resultado = new int[2][2];
		//System.out.println(matriz2.length);
		int countMatriz1 = 0;
		int countMatriz2 = 0;
		int countResultado = 0;
		int soma = 0;
		int count = 0;
	    boolean condicao = false;
	    while(matriz1.length == matriz2[count].length && matriz1[count].length == matriz2.length) {
		      count++;
			  if(count >= matriz1.length) {
				  condicao = true;
				  break;
				}
			}
	    
	    if(condicao == true) {
					
			for(int linha = 0; linha<(matriz1.length*2); linha++) {
	
				if(linha==2) {
					countMatriz1++;
					countResultado = 1;
				}
				for(int coluna = 0; coluna<matriz2.length; coluna++) {
					
					int multi = matriz1[countMatriz1][coluna] * matriz2[coluna][countMatriz2];
					soma = soma + multi;
					if (coluna>=2) {
						
						resultado[countResultado][countMatriz2] = soma;
					}
					
	
					
				}
				soma = 0;

				countMatriz2++;
				if(countMatriz2==2) {
					countMatriz2 = 0;
				}
	
				
			}
			System.out.println("O resultado da multiplicação das matrizes é: ");
			for(int i = 0; i < resultado.length; i++) {
				for(int j = 0; j < 2; j++) {
					System.out.print(resultado[i][j]+"|");
				}
				System.out.println();
			}
	    }else {
	    	System.out.println("As matrizes são diferentes!!");
	    }
	}

}
