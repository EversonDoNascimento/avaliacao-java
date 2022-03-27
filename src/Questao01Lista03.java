
public class Questao01Lista03 {
	
	public static void main(String[] args) {
		/*
		 * 1. A fim de praticar os conceitos aprendidos em sala de aula sobre itera ̧c ̃ao acerca de Arrays multidimen-
              sionais, realize a opera ̧c ̃ao de adi ̧c ̃ao entre as matrizes. Sabendo da necessidade das matrizes terem a
              mesma dimensao para dada opera ̧c ̃ao, implemente no algoritmo a checagem antes de efetuar a soma.
		 * */
		
		int[][] matriz1 = {{3,4},{5,6},{7,8}};
		int[][] matriz2 = {{10,1},{3,5},{0,21}};
		int[][] resultado = new int[3][2];
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
							
					resultado[linha][coluna] = matriz1[linha][coluna] + matriz2[linha][coluna];
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
