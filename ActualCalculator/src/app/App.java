package app;

import java.awt.*;
import java.awt.event.ActionListener;

public class App {
    public static void main(String[] args) throws Exception {
		String buttons[] = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "+", "-", "*", "/", "=", "C" };

		Frame f = new Frame();
		Panel screenPanel = new Panel();
		Panel keypadPanel = new Panel();

		GridLayout layout = new GridLayout(4, 4);
		keypadPanel.setLayout(layout);

		TextField screen = new TextField();
		screenPanel.add(screen);
		ActionHandler listener = new ActionHandler(screen);

		for (String button : buttons) {
			Button btn = new Button(button);
			btn.addActionListener(listener);
			keypadPanel.add(btn);
		}

		f.add(screenPanel, BorderLayout.NORTH);
		f.add(keypadPanel, BorderLayout.CENTER);

		f.setSize(400, 400);
		f.setVisible(true);
    }
}