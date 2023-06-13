package conversorMonedas;

import javax.swing.JOptionPane;

public class ConvertirMonedasAQuetales {
	public void ConvertirDolaresAQuetzales(double valor) {
		double monedaDolar = valor * 7.84;
		monedaDolar = (double) Math.round(monedaDolar *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes Q " +monedaDolar+ " quetzales");
	}
	
	public void ConvertirEurosAQuetales(double valor) {
		double monedaEuro = valor * 8.44;
		monedaEuro = (double) Math.round(monedaEuro *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes Q " +monedaEuro+ " quetzales ");
	}
	
	public void ConvertirLibrasAQuetales(double valor) {
		double monedaLibra = valor * 9.82;
        monedaLibra = (double) Math.round(monedaLibra *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes Q " +monedaLibra+ " quetzales ");
	}
	
	public void ConvertirYenAQuetales(double valor) {
		double monedaYen = valor * 0.056;
        monedaYen = (double) Math.round(monedaYen *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes Q " +monedaYen+ " quetzales ");
	}
	
	public void ConvertirWonAQuetales(double valor) {
		double monedaWon = valor * 0.0061;
        monedaWon = (double) Math.round(monedaWon *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes Q " +monedaWon+ " quetzales ");
	}
}
