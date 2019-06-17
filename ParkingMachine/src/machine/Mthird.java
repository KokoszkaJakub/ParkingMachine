package machine;

import javax.swing.JOptionPane;

public class Mthird {
	public static void main(String[] args) {

		/*
		 * while (kwota < doZaplaty) { monetaTxt =
		 * JOptionPane.showInputDialog("Podaj nominał"); kwota +=
		 * Integer.parseInt(monetaTxt);
		 */
		int cost = 5;

		String coinTxt = JOptionPane.showInputDialog("Podaj nominał");
		int coinValue = Integer.parseInt(coinTxt);

		while (coinValue <= cost) {
			coinTxt = JOptionPane.showInputDialog("Podaj nominał");
			coinValue += Integer.parseInt(coinTxt);
		}
		JOptionPane.showMessageDialog(null, "Dziękujemy za skorzystanie z naszych usług. " + "Kwota wrzucona: " + coinValue
				+ ", reszta: " + (coinValue - cost));

	}

}
