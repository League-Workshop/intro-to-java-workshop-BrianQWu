package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below…
public static void main(String[] args) {
	

	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
int randnum = new Random().nextInt(4);
	// 3. Print out this variable
System.out.println(randnum);
	// 4. Get the user to enter something that they think is awesome
JOptionPane.showInputDialog("What do you think is an awesome thing?");
	// 5. If the random number is 0
if(randnum==0) {
	// -- tell the user whatever they entered is awesome!
JOptionPane.showMessageDialog(null, "That's pretty awesome.");
}
	// 6. If the random number is 1
if(randnum==1) {
	// -- tell the user whatever they entered is ok.
JOptionPane.showMessageDialog(null, "That's ok.");
}
	// 7. If the random number is 2
if(randnum==2) {
	// -- tell the user whatever they entered is boring.
JOptionPane.showMessageDialog(null, "That's boring.");
}
	// 8. If the random number is 3
if(randnum==3) {
	// -- write your own answer
JOptionPane.showMessageDialog(null, "That wasn't horrible, but you could've chosen something much better.");
}
}
}


