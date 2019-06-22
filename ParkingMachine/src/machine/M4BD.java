package machine;

import java.math.BigDecimal;

import javax.swing.JOptionPane;

public class M4BD {
	public static boolean coinValue(BigDecimal coin) {

		return coin.equals(new BigDecimal(1)) || coin.equals(new BigDecimal(2)) || coin.equals(new BigDecimal(5))
				|| coin.equals(new BigDecimal("0.1")) || coin.equals(new BigDecimal("0.2"))
				|| coin.equals(new BigDecimal("0.5"));
	}

	public static void main(String[] args) {
		BigDecimal cost = new BigDecimal(5);
		BigDecimal cash = new BigDecimal(0);
		try {

			while (cash.compareTo(cost) < 0) {
				String coinTxt = JOptionPane.showInputDialog("Podaj nominał");
				BigDecimal coin = new BigDecimal(coinTxt);

				if (coinValue(coin)) {
					cash = cash.add(coin);
				} else {
					JOptionPane.showMessageDialog(null, "Nieprawidłowy nominał");
				}

			}
			JOptionPane.showMessageDialog(null, "Dziękujemy za skorzystanie z naszych usług. " + "Kwota wrzucona: "
					+ cash + ", reszta: " + (cash.subtract(cost)));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "to nie jest moneta !");
			
		}
	}
}
