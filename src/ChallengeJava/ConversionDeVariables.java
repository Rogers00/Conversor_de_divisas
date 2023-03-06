package ChallengeJava;

import javax.swing.JOptionPane;

public class ConversionDeVariables {
	public static void main(String[] args) {
		
		
		String seleccionDeConversion =(JOptionPane.showInputDialog(null, "Seleccione el tipo de conversión", "Menu", -1, null, 
				new Object[] {"Ninguna","Conversión de Divisa", "Conversion de temperatura", "Conversion de tiempo"}
				, "Ninguna")).toString();
		
		if (seleccionDeConversion == "Conversión de Divisa") {
			Divisas conversion = new Divisas();
			conversion.menuDivisas();
			conversion.montoDeDivisa();
			conversion.conversion();
		}
		
	}

}
