package actividad6;

import javax.swing.JOptionPane;

public class Ejercicio_basicos_DDR_29 {

	public static void main(String[] args) {

		String texto = JOptionPane.showInputDialog(null, "Introduce un texto, cadena vacia para terminar", "Introducir texto", JOptionPane.INFORMATION_MESSAGE);
	
		String cadenaResultante = "";
		
		while(!texto.isEmpty()) {
			cadenaResultante += texto;
			
			texto = JOptionPane.showInputDialog(null, "Introduce un texto, cadena vacia para terminar", "Introducir texto", JOptionPane.INFORMATION_MESSAGE);
		}
		JOptionPane.showInputDialog(null, cadenaResultante, "Resultado", JOptionPane.INFORMATION_MESSAGE);
	}
}
