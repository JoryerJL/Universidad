import javax.swing.JOptionPane;

public class arreglosAlreves {

    public static void main(String[] args) {
        int calificaciones[] = new int[5];
        String mensaje = "CALIFICACION DE LAS 5 UNIDADES ORDEN INTRODUCIDOS:\n";
        for (int i = 0; i < 5; i++) {
            int contador = i + 1;
            String texto = "INGRESE LA CALIFICACION DE LA UNIDAD " + contador + " : ";
            String input = JOptionPane.showInputDialog(texto);
            calificaciones[i] = Integer.parseInt(input);
        }

        for (int i = 0; i < 5; i++) {
            int contador = i + 1;
            mensaje += "UNIDAD " + contador + " : " + calificaciones[i] + "\n";    
        }
        
        mensaje += "CALIFICACION DE LAS 5 UNIDADES ORDEN INVERTIDO:\n";
        
        for (int i = 4; i >= 0; i--) {
            int contador = i+1;
            mensaje += "UNIDAD " + contador + " : " + calificaciones[i] + "\n";    
        }
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
