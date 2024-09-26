import javax.swing.JOptionPane;

public class arregloNombreInput {

	public static void main(String[] args) {
		String input;
		int cantidad;
		
		input = JOptionPane.showInputDialog("Introduce el numero de nombre a registrar");
		cantidad = Integer.parseInt(input);
		String nombres [] = new String[cantidad];
		
		
		
		for (int i=0; i<cantidad; i++) {
			input = JOptionPane.showInputDialog("Introduce el nombre " + (i+1));
			nombres[i] = input;
		}
		
		System.out.println("--- LISTA DE NOMBRES ---");
		for (int i=0; i<cantidad; i++) {
			System.out.println("- " + nombres[i]);
		}
		

	}

}
