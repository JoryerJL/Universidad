package BubbleSort;

import javax.swing.JOptionPane;

public class MetBurbujaA {

    public static void main(String[] args) {
        float calificaciones[] = new float[5];
        String input;
        int opcion;
        float media, mediana, varianza, desviacion;
        String mensaje = "CALIFICACION DE LAS 5 UNIDADES :\n";
        for (int i = 0; i < 5; i++) {
            int contador = i + 1;
            String texto = "INGRESE LA CALIFICACION DE LA UNIDAD " + contador + " : ";
            input = JOptionPane.showInputDialog(texto);
            calificaciones[i] = Integer.parseInt(input);
        }

        for (int i = 0; i < 5; i++) {
            int contador = i + 1;
            mensaje = mensaje + "UNIDAD " + contador + " : " + calificaciones[i] + "\n";    
        }
        mensaje += String.format("----MENU DE OPERACIONES----\n"
        + "1.MEDIA\n"
        + "2.MEDIANA\n"
        + "3.VARIANZA\n"
        + "4.DESVIACION ESTANDAR\n"
        + "5.SALIR\n"
        );
        do {
			input = JOptionPane.showInputDialog(mensaje);
			opcion = Integer.parseInt(input);
			switch (opcion) {
			case 1: {
                media = util.media(calificaciones);
                System.out.println("Media : " + media);
				break;
			}
			case 2: {
                mediana = util.mediana(calificaciones);
                System.out.println("Mediana : " + mediana);
			    break;
			}
			case 3: {
                varianza = util.varianza(calificaciones);
                System.out.println("Varianza : " + varianza);
				break;
			}
			case 4: {
                varianza = util.varianza(calificaciones);
                desviacion = (float) Math.sqrt(varianza) ;
                System.out.println("Desviacion Estandar : " + desviacion);
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
