package section3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	
	public static void main(String[] args) {
		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to do it...
		
		// Get the user to enter an adjective
		String adj = JOptionPane.showInputDialog("Put in an adjective.");
		// Get the user to enter a type of liquid
		String liq = JOptionPane.showInputDialog("Put in a liquid/aqueous solution's name.");
		// Get the user to enter a body part
		String bdpt = JOptionPane.showInputDialog("Which body part do you like the most?");
		// Get the user to enter a verb
		String vrb = JOptionPane.showInputDialog("Put in a verb.");
		// Get the user to enter a place
		String plc = JOptionPane.showInputDialog("Put in a place you love.");
		// Fit the user's words into this sentence, and save it in a String:
		// Piranhas are more [adjective] during the day, so cross the river at
		// night. Piranhas are attracted to fresh [type of liquid] and will most
		// likely take a bite out of your [body part] if you [verb]. Whatever
		// you do, if you have an open wound, try to find another way to get
		// back to the [place]. Good luck!
		JOptionPane.showMessageDialog(null, "Piranhas are more "+adj+" during the day, so cross the river at night. \n Piranahs are attracted to fresh "+liq+" and will most likely take a bite out of your "+bdpt+" if you "+vrb+". \n Whatever you do, if you have an open wound, try to find another way to get back to "+plc+".");
		// Make a pop-up for the final story. You can use \n to go to the next line
		

	}
}

