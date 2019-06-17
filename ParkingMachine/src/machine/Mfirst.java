package machine;

import javax.swing.JOptionPane;

public class Mfirst {
public static void main(String[] args) {
		

		int cost = 5;

		String JedenTxt = JOptionPane.showInputDialog("podaj pierwszy nominał");
		{
			int firstCoin = Integer.parseInt(JedenTxt);

			if (cost == firstCoin) {
				JOptionPane.showMessageDialog(null, "zapłacono");
			}

			else if (cost < firstCoin) {
				JOptionPane.showMessageDialog(null, "towja reszta to " + (firstCoin - cost));

			} else if (cost > firstCoin) {

				String DwaTxt = JOptionPane.showInputDialog("podaj drugi nominał");
				int secondCoin = Integer.parseInt(DwaTxt);
				int sum = firstCoin + secondCoin;
				if (cost == sum) {
					JOptionPane.showMessageDialog(null, "zapłacono");
				} else if (cost > sum) {
					JOptionPane.showMessageDialog(null, "nie wystarczająca ilosc srodkow");

				}
			}

			
		}
	}

}
