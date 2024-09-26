import javax.swing.JOptionPane;

public class TeoriaConjuntos {

	public static void main(String[] args) {
		int columnasA, filasA, columnasB, filasB, opcion;
		String input;
		String menu = "";
		String MatrizUnion ="";
		input = JOptionPane.showInputDialog("Dimensión de la Matriz A \n"
										  + "Digita la cantidad de filas : ");
		filasA = Integer.parseInt(input);
		input = JOptionPane.showInputDialog("Dimensión de la Matriz A\n"
										  + "Digita la cantidad de columnas : ");
		columnasA = Integer.parseInt(input);
		input = JOptionPane.showInputDialog("Dimensión de la Matriz B \n"
				  						  + "Digita la cantidad de filas : ");
		filasB = Integer.parseInt(input);
		input = JOptionPane.showInputDialog("Dimensión de la Matriz B\n"
										  + "Digita la cantidad de columnas : ");
		columnasB = Integer.parseInt(input);
		
		int MatrizA [][] =  new int [filasA][columnasA];
		int MatrizB [][] =  new int [filasB][columnasB];
		String MatrizAShow = "";
		String MatrizBShow = "";
		
		for ( int i=0; i<filasA;i++) {
			for( int j=0; j<columnasA; j++ ) {
				input = JOptionPane.showInputDialog(null, String.format("Ingrese el valor para matriz A \n"
																	  + "Ubicación [ %2d ][ %2d ]", (i+1), (j+1)));
				MatrizA[i][j]= Integer.parseInt(input);
			}
		}
		for ( int i=0; i<filasB;i++) {
			for( int j=0; j<columnasB; j++ ) {
				input = JOptionPane.showInputDialog(null, String.format("Ingrese el valor para matriz B \n"
																	  + "Ubicación [ %2d ][ %2d ]", (i+1), (j+1)));
				MatrizB[i][j]= Integer.parseInt(input);
			}
		}
		
		MatrizAShow = util.showMatriz(MatrizA);
		MatrizBShow = util.showMatriz(MatrizB);
		
		menu += String.format("----MENU DE OPERACIONES----\n"
							+ "MATRIZ A\n"
							+ "%s"
							+ "\n MATRIZ B\n"
							+ "%s"
							+ "1.UNION\n"
							+ "2.INTERSECCION\n"
							+ "3.COMPLEMENTO A\n"
							+ "4.COMPLEMENTO B\n"
							+ "5.SALIR"
							, MatrizAShow
							, MatrizBShow
							);		
		do {
			input = JOptionPane.showInputDialog(menu);
			opcion = Integer.parseInt(input);
			switch (opcion) {
			case 1: {
				MatrizUnion = util.Union(MatrizA, MatrizB);
				System.out.println(MatrizUnion);
				break;
			}
			case 2: {
				util.Interseccion(MatrizA, MatrizB);
				break;
			}
			case 3: {
				util.ComplementoA(MatrizA, MatrizB);
				break;
			}
			case 4: {
				util.ComplementoB(MatrizA, MatrizB);
				break;
			}
			case 5: {
				break;
			}
			default:
				JOptionPane.showConfirmDialog(null, "Opcion inexistente");
				break;
			}
		} while (opcion!=5);
		
	}

}
