package machine;

import javax.swing.JOptionPane;

public class Msecond {
public static void main(String[] args) {
		

		int cost = 5;

		String coinTxt = JOptionPane.showInputDialog("Podaj nominał");
	   	 int coinValue = Integer.parseInt(coinTxt);
	   	 if (coinValue >= cost) {
	   		 JOptionPane.showMessageDialog(null, "Dziękujemy za skorzystanie z naszych usług." +
	   				 "Kwota wrzucona: " + coinValue + ", reszta: " + (coinValue - cost));
	   	 } else {
	   		 coinTxt = JOptionPane.showInputDialog("Podaj nominał");
	   		 coinValue += Integer.parseInt(coinTxt);
	   		 if (coinValue >= cost) {
	   			 JOptionPane.showMessageDialog(null, "Dziękujemy za skorzystanie z naszych usług." +
	   					 "Kwota wrzucona: " + coinValue + ", reszta: " + (coinValue - cost));
	   		 } else {
	   			 JOptionPane.showMessageDialog(null, "Kwota zbyt niska");
	   		 }    
	   	 }

	    }

	}
