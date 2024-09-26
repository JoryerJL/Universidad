import javax.swing.JOptionPane;

public class arreglos {

    public static void main(String[] args) {
        int calificaciones[] = new int[5];
        String mensaje = "CALIFICACION DE LAS 5 UNIDADES :\n";
        for (int i = 0; i < 5; i++) {
            int contador = i + 1;
            String texto = "INGRESE LA CALIFICACION DE LA UNIDAD " + contador + " : ";
            String input = JOptionPane.showInputDialog(texto);
            calificaciones[i] = Integer.parseInt(input);
        }

        for (int i = 0; i < 5; i++) {
            int contador = i + 1;
            mensaje = mensaje + "UNIDAD " + contador + " : " + calificaciones[i] + "\n";    
        }
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
