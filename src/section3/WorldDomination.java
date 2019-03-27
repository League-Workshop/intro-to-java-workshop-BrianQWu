package section3;

import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		String answer = JOptionPane.showInputDialog("You know how to write code,right?");
		// 2. If they say "yes", tell them they will rule the world.
if(answer.equals ("yes")) {
JOptionPane.showMessageDialog(null, "cool beans man");
		}
		// 3. Otherwise, wish them good luck washing dishes.
else {JOptionPane.showMessageDialog(null, "ok, ill ask someone else");
}
	}
}

