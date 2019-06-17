package machine;

import javax.swing.JOptionPane;

public class Mthird {

	public static boolean IfCoin(int coin) {
		return coin == 1 || coin == 2 || coin == 5;

	}

	public static void main(String[] args) {
		int cost = 5;
		int sumCoin = 0;
		while (sumCoin < cost) {
			String coinTxt = JOptionPane.showInputDialog("Podaj nominał");
			int coin = Integer.parseInt(coinTxt);
			if (IfCoin(coin)) {
				sumCoin += coin;
			} else {
				JOptionPane.showMessageDialog(null, "Nieprawidłowy nominał");
			}

		}
		JOptionPane.showMessageDialog(null, "Dziękujemy za skorzystanie z naszych usług. " + "Kwota wrzucona: "
				+ sumCoin + "zł" + ", reszta: " + (sumCoin - cost) + "zł");
	}

}