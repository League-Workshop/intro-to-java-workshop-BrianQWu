package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	Robot genesis = new Robot();
genesis.setSpeed(100);
genesis.penDown();
for(int i=0;i<4;i++) {
genesis.move(199);
genesis.turn(90);
}
for(int i=0;i<36;i++ ) {
genesis.move(18);
genesis.turn(10);
}
	}
}
