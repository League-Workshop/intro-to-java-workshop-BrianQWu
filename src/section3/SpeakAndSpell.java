package section3;

import javax.swing.JOptionPane;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class SpeakAndSpell {

	public static void main(String[] args) {
speak("Spell pneumonoultramicroscopicsilicovolcanoconiosis");
String spell = JOptionPane.showInputDialog("Spell the word correctly without capitals");
if(spell.equals("pneumonoultramicroscopicsilicovolcanoconiosis")) {
	JOptionPane.showMessageDialog(null, "Correct");
}
else {JOptionPane.showMessageDialog(null, "Wrong");
}
speak("Spell floccinaucinihilipilification");
String meme = JOptionPane.showInputDialog("Spell the word correctly without capitals");
if(meme.equals("floccinaucinihilipilification")) {
	JOptionPane.showMessageDialog(null, "Correct");
}
else {JOptionPane.showMessageDialog(null, "Wrong");
}
speak("Spell antidisestablishmentarianism");
String wordthree = JOptionPane.showInputDialog("Spell the word correctly without capitals");
if(wordthree.equals("antidisestablishmentarianism")) {
	JOptionPane.showMessageDialog(null, "Correct");
}
else {JOptionPane.showMessageDialog(null, "Wrong");
}		
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}


