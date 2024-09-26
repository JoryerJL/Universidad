
public class bidimensional {
	Integer RecorrerMatriz (Integer pSuma1) {
		return pSuma1;
		
	}

	public static void main(String[] args) {
		/*  
		 * MATRIZ A
		 * [1][1][1][1]
		 * [2][2][2][2]
		 * [3][3][3][3]
		 * [4][4][4][4]
			*/
		
		/*  
		 * MATRIZ B
		 * [4][4][4][4]
		 * [3][3][3][3]
		 * [2][2][2][2]
		 * [1][1][1][1]
			*/

		
		int suma [][] = new int [4][4];
		String MatrizAShow = "";
		String MatrizBShow = "";
		String MatrizSuma = "";
		String MatrizResta = "";
		String MatrizMultiplicacion = "";
		int resta [][] = new int [4][4];
		int multiplicacion [][] = {{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
		
		int MatrizA [][] = {{1,1,1,1},{2,2,2,2},{3,3,3,3},{4,4,4,4}};
		int MatrizB [][] = {{4,4,4,4},{3,3,3,3},{2,2,2,2},{1,1,1,1}};
		
		for ( int i=0; i<4;i++) {
			for( int j=0; j<4; j++ ) {
				suma [i][j] = MatrizA[i][j] + MatrizB[i][j];
				resta [i][j] = MatrizA[i][j] - MatrizB[i][j];
			}
		}
		
		System.out.println("MATRIZ A \n");
		for ( int i=0; i<4;i++) {
			for( int j=0; j<4; j++ ) {
				MatrizAShow += String.format("[ %3d   ]", MatrizA[i][j]);
				if (j==3) {
					MatrizAShow += "\n";
				}
			}
		}
		System.out.println(MatrizAShow);

		
		System.out.println("MATRIZ B \n");
		for ( int i=0; i<4;i++) {
			for( int j=0; j<4; j++ ) {
				MatrizBShow += String.format("[ %3d   ]", MatrizB[i][j]);
				if (j==3) {
					MatrizBShow += "\n";
				}
			}
		}
		System.out.println(MatrizBShow);
		
		System.out.println("MATRIZ SUMA \n");
		for ( int i=0; i<4;i++) {
			for( int j=0; j<4; j++ ) {
				MatrizSuma += String.format("[ %3d   ]", suma[i][j]);
				if (j==3) {
					MatrizSuma += "\n";
				}
			}
		}
		
		System.out.println(MatrizSuma);
		System.out.println("MATRIZ RESTA \n");
		for ( int i=0; i<4;i++) {
			for( int j=0; j<4; j++ ) {
				MatrizResta += String.format("[ %3d   ]", resta[i][j]);
				if (j==3) {
					MatrizResta += "\n";
				}
			}
		}
		System.out.println(MatrizResta);
		

		
		int a=0,b=0,c=0,d=0;
		
		/*
		 * FILA 1
		 *   a b  c d                                    a d
		 * ((0,0)(0,0)+(0,1)(1,0)+(0,2)(2,0)+(0,3)(3,0)=[0,0]
		 * ((0,0)(0,1)+(0,1)(1,1)+(0,2)(2,1)+(0,3)(3,1)=[0,1]
		 * ((0,0)(0,2)+(0,1)(1,2)+(0,2)(2,2)+(0,3)(3,2)=[0,2]
		 * ((0,0)(0,3)+(0,3)(1,3)+(0,2)(2,3)+(0,3)(3,3)=[0,3]
		 * FILA 2
		 * ((1,0)(0,0)+(1,1)(1,0)+(1,2)(2,0)+(1,3)(3,0)=[1,0]
		 * ((1,0)(0,1)+(1,1)(1,1)+(1,2)(2,1)+(1,3)(3,1)=[1,1]
		 * ((1,0)(0,2)+(1,1)(1,2)+(1,2)(2,2)+(1,3)(3,2)=[1,2]
		 * ((1,0)(0,3)+(1,3)(1,3)+(1,2)(2,3)+(1,3)(3,3)=[1,3]
		 * FILA 3
		 * ((2,0)(0,0)+(2,1)(1,0)+(2,2)(2,0)+(2,3)(3,0)=[2,0]
		 * ((2,0)(0,1)+(2,1)(1,1)+(2,2)(2,1)+(2,3)(3,1)=[2,1]
		 * ((2,0)(0,2)+(2,1)(1,2)+(2,2)(2,2)+(2,3)(3,2)=[2,2]
		 * ((2,0)(0,3)+(2,3)(1,3)+(2,2)(2,3)+(2,3)(3,3)=[2,3]
		 * FILA 4
		 * ((3,0)(0,0)+(3,1)(1,0)+(3,2)(2,0)+(3,3)(3,0)=[3,0]
		 * ((3,0)(0,1)+(3,1)(1,1)+(3,2)(2,1)+(3,3)(3,1)=[3,1]
		 * ((3,0)(0,2)+(3,1)(1,2)+(3,2)(2,2)+(3,3)(3,2)=[3,2]
		 * ((3,0)(0,3)+(3,3)(1,3)+(3,2)(2,3)+(3,3)(3,3)=[3,3]
		 */
			for (int j=0; j<4; j++) {
				a=j;
				for (int k=0; k<4; k++) {
					d=k;
					for (int l=0; l<4; l++ ) {
						b=l;
						c=l;
						multiplicacion [a][d] += (MatrizA[a][b])*(MatrizB[c][d]);
					}
					
				}
				
			}
			
			System.out.println("MATRIZ MULTIPLICACION \n");
			for ( int i=0; i<4;i++) {
				for( int j=0; j<4; j++ ) {
					MatrizMultiplicacion += String.format("[ %3d   ]", multiplicacion[i][j]);
					if (j==3) {
						MatrizMultiplicacion += "\n";
					}
				}
			}
			System.out.println(MatrizMultiplicacion);
				
		

	}
}

