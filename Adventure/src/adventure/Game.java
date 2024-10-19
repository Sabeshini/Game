package adventure;
import javax.swing.JFrame;
import javax.swing.UIManager;

import java.awt.Color;

//import javax.swing.JFrame;
//
//import javax.swing.JFrame;

public class Game{
	
	JFrame firstWindow;

	public static void main(String[] args) {
		new Game();
	}
	
	public Game() {


		firstWindow = new JFrame();
////		setSize determines the dimension of the window panel we are creating
		firstWindow.setSize(800,600);
////		setDefaultCloseOperation assures what happens if we press the 'X' button and EXIT_ON_CLOSE descibes the end
		firstWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;
////		getContentPane for the content and setBackground for the bg color
		firstWindow.getContentPane().setBackground(Color.pink);
////		null is so that we can customize the layout
		firstWindow.setLayout(null);
////		setVisible so that we can see the window
		firstWindow.setVisible(true);
//		System.out.println("jfewr");

	}

}
