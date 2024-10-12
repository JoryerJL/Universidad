import javax.swing.JOptionPane;

public class ShellSort {

    public static void main(String[] args) {
        int calificaciones[] = new int[8];
        String input;
        int opcion;
        float calficacionRepit, repit;
        String mensaje = "CALIFICACION DE LAS 8 UNIDADES :\n";
        for (int i = 0; i < 8; i++) {
            int contador = i + 1;
            String texto = "INGRESE LA CALIFICACION DE LA UNIDAD " + contador + " : ";
            input = JOptionPane.showInputDialog(texto);
            calificaciones[i] = Integer.parseInt(input);
        }

        for (int i = 0; i < 8; i++) {
            int contador = i + 1;
            mensaje = mensaje + "UNIDAD " + contador + " : " + calificaciones[i] + "\n";    
        }
        util.shellSort(calificaciones);

		
	}
    
}

