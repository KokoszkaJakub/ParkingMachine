package machine;

import javax.swing.JOptionPane;

public class Mfirst {
public static void main(String[] args) {
		

		int cost = 5;

		String JedenTxt = JOptionPane.showInputDialog("podaj pierwszy nominał");
		{
			int jeden = Integer.parseInt(JedenTxt);

			if (cost == jeden) {
				JOptionPane.showMessageDialog(null, "zapłacono");
			}

			else if (cost < jeden) {
				JOptionPane.showMessageDialog(null, "towja reszta to " + (jeden - cost));

			} else if (cost > jeden) {

				String DwaTxt = JOptionPane.showInputDialog("podaj drugi nominał");
				int dwa = Integer.parseInt(DwaTxt);
				int suma = jeden + dwa;
				if (cost == suma) {
					JOptionPane.showMessageDialog(null, "zapłacono");
				} else if (cost > suma) {
					JOptionPane.showMessageDialog(null, "nie wystarczająca ilosc srodkow");

				}
			}

			
		}
	}

}
