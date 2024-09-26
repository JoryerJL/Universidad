import javax.swing.JOptionPane;

public class ArregloBidimensional {

	public static void main(String[] args) {
		int cantidadGrupos, cantidadAlumnos;
		String input;
		
		input= JOptionPane.showInputDialog("Digite la cantidad de grupos a registrar : ");
		cantidadGrupos = Integer.parseInt(input);
		input= JOptionPane.showInputDialog("Digite la cantidad de alumnos por grupo : ");
		cantidadAlumnos = Integer.parseInt(input);
		String nombres [][] = new String[cantidadGrupos][cantidadAlumnos];
		String nombresGrupo [] = new String [cantidadGrupos];
		for (int i=0; i<cantidadGrupos; i++) {
			input= JOptionPane.showInputDialog("Digite el nombre del grupo " + (i+1) + " : ");
			nombresGrupo[i] = input;
			for (int j=0; j<cantidadAlumnos; j++) {
				input= JOptionPane.showInputDialog("Digite el nombre del alumno " + (j+1) + " , GRUPO [ " + nombresGrupo[i]+ " ] "+": ");
				nombres[i][j] = input;
			}
			
		}
		System.out.println("--- LISTA DE ALUMNADO ---- \n");
		for (int i=0; i<cantidadGrupos; i++) {
			System.out.println("\nGRUPO " + nombresGrupo[i]);
			for (int j=0; j<cantidadAlumnos; j++) {
				System.out.println(nombres[i][j]);
			}
			
		}

	}

}
