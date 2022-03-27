
public class Questao02Lista03 {
	
	public static void main(String[] args) {
		/*
		 * 2. Dando continuidade com as quest ̃oes acerca de itera ̧c ̃oes sob Arrays, realize a opera ̧c ̃ao de subtra ̧c ̃ao
              entre as matrizes abaixo descritas. Sabendo da necessidade das matrizes terem a mesma dimens ̃ao
              para dada opera ̧c ̃ao, implemente no algoritmo a checagem antes de efetuar a soma.
		 * */
		
		int[][] matriz1 = {{3,4,5},{5,6,1},{7,8,2}};
		int[][] matriz2 = {{10,1,2},{3,5,0},{0,21,15}};
		int[][] resultado = new int[3][3];
		// Verificando tamanho das matrizes
        int count = 0;
        boolean condicao = false;
		while((matriz1.length == matriz2.length) && (matriz1[count].length == matriz2[count].length) ) {
			count++;
			if(count >= matriz1.length) {
				condicao = true;
				break;
			}
		}
			
		if(condicao == true) {			   
			for(int linha = 0; linha<matriz1.length; linha++) {
				for(int coluna = 0; coluna<matriz1[0].length; coluna++) {
							
					resultado[linha][coluna] = matriz1[linha][coluna] -matriz2[linha][coluna];
					}
					
			
			}
					
			for(int i = 0; i<matriz1.length; i++) {
				for(int j = 0; j<matriz1[0].length; j++) {
							System.out.print(resultado[i][j]+"|");
					}
					System.out.println();}
		}  
		
		else {
			System.out.println("Os tamanhos das matrizes são diferentes!");
		}
			
	}

}
