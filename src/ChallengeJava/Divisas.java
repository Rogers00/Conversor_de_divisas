package ChallengeJava;

import javax.swing.JOptionPane;

public class Divisas {
	public String divisaSeleccionada;
	public String monto;
	public double valor;
	
	public void menuDivisas() {
		divisaSeleccionada =(JOptionPane.showInputDialog(null, "Elija la divisa de cambio", "Divisas", -1, null, 
				new Object[] {"De COP a Dolares", "De COP a Euros", "De COP a Libras Esterlinas", "De COP a Yen Japones",
						"De COP a Won sul-coreano"}
				, "Ninguna")).toString();
		
	}
	
	public void montoDeDivisa(){
		while(true) {
			this.monto = JOptionPane.showInputDialog(null, "Ingrese la cantidad de dinero que desea convertir");
			if(comprobacionDeNumero(this.monto)) {
				this.valor = Integer.parseInt(this.monto);
				break;
			}else {
				JOptionPane.showMessageDialog(null, "El monto ingresado no es un numero valido", "Mensaje", 0);
			}
		}
	}
	
	
	public void conversion() {
		double cambio = 0;
		
		switch (divisaSeleccionada) {
		
		case "De COP a Dolares":
			cambio = this.valor / 4810.46;
			resultadoCambio(cambio, this.valor ," Pesos Colombianos " ," Dolares");
			break;
			
		case "De COP a Euros":
			cambio = this.valor / 5099;
			resultadoCambio(cambio, this.valor ," Pesos Colombianos " ," Euros");
			break;
			
		case "De COP a Libras Esterlinas":
			cambio = this.valor / 5760.52;
			resultadoCambio(cambio, this.valor ," Pesos Colombianos " ," Libras Esterlinas");
			break;
			
		case "De COP a Yen Japones":
			cambio = this.valor / 35.29;
			resultadoCambio(cambio, this.valor ," Pesos Colombianos " ," Yen Japones");
			break;
			
		case "De COP a Won sul-coreano":
			cambio = this.valor / 3.69;
			resultadoCambio(cambio, this.valor ," Pesos Colombianos " ," Won sul-coreano");
			break;
			
		}
	
	}
	
	public void resultadoCambio(double dineroEntregado, double dineroRecibido ,  String divisaInicial, String divisaFinal) {
		JOptionPane.showMessageDialog(null, "Tus " + dineroRecibido + divisaInicial + " equivalen a " + dineroEntregado 
				+ divisaFinal);
	}
	
	public boolean comprobacionDeNumero (String ingresoDeNumero){
		if (ingresoDeNumero != null && ingresoDeNumero.matches("[0-9.]+")) {
			return true;
		}else {
			return false;
		}
	}
	
}
