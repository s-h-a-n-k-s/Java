import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;

class ButtonAction implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		System.out.println("Button clicked");
	}
}

class GUI {
	public static void main(String args[]) {
		Frame win = new Frame();
		Button firstButton = new Button("First Button");
		Button secondButton = new Button("Second Button");
		Button thirdButton = new Button("Third Button");
		Button fourthButton = new Button("Fourth Button");
		Button fifthButton = new Button("Fifth Button");
		ButtonAction action = new ButtonAction();
		firstButton.addActionListener(action);

		win.setSize(800, 800);
		win.setBackground(Color.YELLOW);
		win.add(firstButton, BorderLayout.NORTH);
		win.add(secondButton, BorderLayout.SOUTH);
		win.add(thirdButton, BorderLayout.EAST);
		win.add(fourthButton, BorderLayout.WEST);
		win.add(fifthButton, BorderLayout.CENTER);
		win.setVisible(true);
	}	
}