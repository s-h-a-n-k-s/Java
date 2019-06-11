package app;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

class DivideHandler implements ActionListener {
	TextField no1, no2, no3;

	public DivideHandler(TextField a, TextField b, TextField c) {
		no1 = a;
		no2 = b;
		no3 = c;
	}

	public void actionPerformed(ActionEvent e) {
		int a, b, c;

		a = Integer.parseInt(no1.getText());
		b = Integer.parseInt(no2.getText());

		c = a / b;

		no3.setText(Integer.toString(c));
	}
	
}