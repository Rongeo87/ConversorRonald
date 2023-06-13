package conversorMonedas;

import javax.swing.JOptionPane;

public class ConvertirMonedas {

	
	public void ConvertirQuetzalesADolares(double valor) {
		double monedaDolar = valor /  7.84;
		monedaDolar = (double) Math.round(monedaDolar *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes Q " +monedaDolar+ " Dolares");
	}
	
	public void ConvertirQuetzalesAEuros(double valor) {
		double monedaEuro = valor /  8.44;
		monedaEuro = (double) Math.round(monedaEuro *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes Q " +monedaEuro+ " Euros");
	}
	
	public void ConvertirQuetzalesALibras(double valor) {
		double monedaLibra = valor / 9.82;
        monedaLibra = (double) Math.round(monedaLibra *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes Q " +monedaLibra+ " Libras Esterlinas");
	}
	
	public void ConvertirQuetzalesAYen(double valor) {
		double monedaYen = valor / 0.056;
        monedaYen = (double) Math.round(monedaYen *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes Q " +monedaYen+ " Yuanes");
	}
	
	public void ConvertirQuetzalesAWon(double valor) {
		double monedaWon = valor / 0.0061;
        monedaWon = (double) Math.round(monedaWon *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes Q " +monedaWon+ " Wons");
	}
}
