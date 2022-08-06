package matrizes;

public class PercorrerMatriz {
	public static void main(String args []) {
		int m [][] = {{1,2,3},{4,5,6,9},{7,8,9}};
		
		
		System.out.println("A Matriz é: ");
		//PERCORRER LINHA
		for(int i=0;i<m.length;i++) {	
			//PERCORRER COLUNA
			for(int j=0;j<m[i].length;j++) {
				System.out.print( m[i][j] + " ");
			}
			System.out.print("\n");
		}

	}

}
