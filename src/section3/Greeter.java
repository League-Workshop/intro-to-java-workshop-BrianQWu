package section3;

import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
String name = JOptionPane.showInputDialog("What is your name human?");
JOptionPane.showMessageDialog(null, "Well then, as per my functions I am supposed to greet you. Welcome, "+name);
}
}
