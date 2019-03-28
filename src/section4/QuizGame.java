package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score =0;
		JOptionPane.showMessageDialog(null, "Welcome to Brian's Great Video Game Quiz! \n Capitalize All Titles Unless Specified Otherwise");
		// 2.  Ask the user a question 
		String ansone = JOptionPane.showInputDialog("What was the order of the famous video game cheat The Konami Code? \n Enter the answer without capitals.");
		if(ansone.equals("up up down down left right left right b a start")) {
		JOptionPane.showMessageDialog(null, "That answer was correct");
		score+=1;
		}
		else {JOptionPane.showMessageDialog(null, "Incorrect"); }
		String anstwo = JOptionPane.showInputDialog("In the famous video game series Dark Souls, \n what was the name of the original Lord of Cinder?");
		if(anstwo.equals("Gwyn")) {
		JOptionPane.showMessageDialog(null, "That answer was correct");
		score+=1;
		}
		else {JOptionPane.showMessageDialog(null, "Incorrect");}
	
		String ansthree = JOptionPane.showInputDialog("What model of the Unreal Engine was \n used to create the short-lived game Paragon?");
		if(ansthree.equals("Unreal Engine 4")) {
		JOptionPane.showMessageDialog(null, "That answer was correct");
		score+=1;
		}
		else {JOptionPane.showMessageDialog(null, "Incorrect");}
		
		String ansfour = JOptionPane.showInputDialog("In the game Doom 2016, \n what was the name of the suit of armor you wear?");
		if(ansfour.equals("The Praetor Suit")) {
		JOptionPane.showMessageDialog(null, "That answer was correct");
		score+=1;
		}
		else {JOptionPane.showMessageDialog(null, "Incorrect");}
		String ansfive = JOptionPane.showInputDialog("In the space MMO EVE Online, what is the name of the starting ship \n given to the player when they choose to start their character \n as a member of the Caldari Empire. \n After typing in the name of the ship, please type in the name of the system you spawn in \n when you choose the School of Applied Knowledge as your starting school \n and after type in the ship class of the starting ship.");
		if(ansfive.equals("Ibis Todaki Frigate")) {
		JOptionPane.showMessageDialog(null, "That answer was correct");
		score+=1;
		}
		else {JOptionPane.showMessageDialog(null, "Incorrect");}
		JOptionPane.showMessageDialog(null, "Congrats, you finished the quiz! \n Out of 5 questions you got "+score+" correct.");
	}
	}


