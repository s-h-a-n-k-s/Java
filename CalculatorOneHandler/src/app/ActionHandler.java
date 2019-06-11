package app;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

class ActionHandler implements ActionListener {
	TextField no1, no2, no3;

	public ActionHandler(TextField a, TextField b, TextField c) {
		no1 = a;
		no2 = b;
		no3 = c;
	}

	public void actionPerformed(ActionEvent e) {
		int a, b, c = 0;
		Button btn = (Button) e.getSource();

		a = Integer.parseInt(no1.getText());
		b = Integer.parseInt(no2.getText());

		if (btn.getLabel().equals("+")) {
			c = a + b;
		}

		if (btn.getLabel().equals("-")) {
			c = a - b;
		}

		if (btn.getLabel().equals("/")) {
			c = a / b;
		}

		if (btn.getLabel().equals("*")) {
			c = a * b;
		}

		no3.setText(Integer.toString(c));
	}
	
}