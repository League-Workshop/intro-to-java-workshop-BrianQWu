package section4;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class DragonFight {
	// 1. Create a main method and put all of the code below inside of it
	public static void main(String[] args) {
		
		ImageIcon dragon = new ImageIcon("src/section4/dragonPicture.jpg");		
		
		JOptionPane.showMessageDialog(null, "Defeat the dragon to take its treasure! \n YOUR LEGS HAVE BEEN BLESSED AND ARE NOW 60 FEET LONG!!!!", "Dragon Fighter", 0, dragon);
		// 2. Create a variable called "playerHealth" to store your health (set it equal to 100)
	int playerHealth=100;
		// 3. Create a variable called "dragonHealth" to store the dragon's health (set it equal to 100)
		int dragonHealth=100;
		// 4. Create a variable to hold the damage the player's attack does each round
		int pldmg;
		// 5. Create a variable to hold the damage the dragon's attack does each round
		int drdmg;
		JOptionPane.showMessageDialog(null, "Fight the dragon! You have 60 feet long legs!");
		// 6.  Delete the slashes at the beginning of the next line.  
		while(playerHealth>0 && dragonHealth>0) {    
		
		
		// 8. Ask the player in a pop-up if they want to attack the dragon with a yell or a kick
		String atk = JOptionPane.showInputDialog("Do you want to smack or kick?");
		// 9. If they typed in "yell":
		if(atk.equals("smack")) {
			//-- Find a random number between 0 and 10 and store it in dragonDamage
		pldmg = new Random().nextInt(11);
			//-- Subtract that number from the dragon's health variable 
			dragonHealth-=pldmg;
			JOptionPane.showMessageDialog(null, "You smacked the dragon with your sword and dealed "+pldmg+" damage!");
		}
		// 10. If they typed in "kick":
		if(atk.equals("kick")) {
			//-- Find a random number between 0 and 25 and store it in dragonDamage
		pldmg = new Random().nextInt(101);	
			//-- Subtract that number from the dragon's health variable
			dragonHealth-=pldmg;
		JOptionPane.showMessageDialog(null, "You kicked the dragon with your 60 feet long legs for "+pldmg+" damage!");
		}
		
		// 11.  Find a random number between 0 and 35 and store it in playerDamage
		drdmg = new Random().nextInt(31);
		// 12. Subtract this number from the player's health
		playerHealth-=drdmg;
		JOptionPane.showMessageDialog(null, "The dragon attacked you for "+drdmg+" damage!");
		
		// 13. If the user's health is less than or equal to 0
		if(playerHealth<=0) {
			//-- Tell the user that they lost
		JOptionPane.showMessageDialog(null, "You got eaten, game over.");	
		}
		// 14. Else if the dragon's health is less than or equal to 0
		if(dragonHealth<=0) {
			//-- Tell the user that the dragon is dead and they took a ton of gold!
		JOptionPane.showMessageDialog(null, "You beat the dragon!");	
		}
	   //  15.  Else
		else {JOptionPane.showMessageDialog(null, "The dragon has "+dragonHealth+" health. \n You currently have "+playerHealth+" health.");
		}
			//-- Pop up a message that tells the their current health and the dragon's currently health (Bonus: Also display the amount of health that was lost for each player this round)
			
		}
	}
}
