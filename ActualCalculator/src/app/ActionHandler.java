package app;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ActionHandler implements ActionListener {
	TextField screen;
	int previousValue;
	String action;

	public ActionHandler(TextField screen) {
		this.screen = screen;
	}

	public void actionPerformed(ActionEvent e) {
		System.out.println("Action performed");
		Button pressedButton = (Button) e.getSource();
		System.out.println("AP" + this.previousValue);

		if (isNumeric(pressedButton.getLabel())) {
			System.out.println("NUMERIC");
			int number = Integer.parseInt(pressedButton.getLabel());
			this.screen.setText(Integer.toString(number));
			
			if (this.previousValue == 0) {
				System.out.println("PV 0" + number);
				this.previousValue = number;
			} else if (this.action == null) {
				String value = Integer.toString(this.previousValue) + Integer.toString(number);
				number = Integer.parseInt(value);
				this.previousValue = number;
				this.screen.setText(Integer.toString(number));
			}


		} else {
			int result = 0;
			System.out.println("ELSE PV" + this.previousValue);

			switch (pressedButton.getLabel()) {
				case "+": this.action = pressedButton.getLabel(); break;
				case "-": this.action = pressedButton.getLabel(); break;
				case "*": this.action = pressedButton.getLabel(); break;
				case "/": this.action = pressedButton.getLabel(); break;
				case "=":
					System.out.println("PV" + this.previousValue);
					if (this.action.equals("+")) {
						result = this.previousValue + Integer.parseInt(this.screen.getText());
						this.screen.setText(Integer.toString(result));
						this.previousValue = 0;
					}

					if (this.action.equals("-")) {
						result = this.previousValue - Integer.parseInt(this.screen.getText());
						this.screen.setText(Integer.toString(result));
						this.previousValue = 0;
					}

					if (this.action.equals("*")) {
						result = this.previousValue * Integer.parseInt(this.screen.getText());
						this.screen.setText(Integer.toString(result));
						this.previousValue = 0;
					}

					if (this.action.equals("/")) {
						result = this.previousValue / Integer.parseInt(this.screen.getText());
						this.screen.setText(Integer.toString(result));
						this.previousValue = 0;
					}

					break;
				case "C":
					this.previousValue = 0;
					this.screen.setText("");
					break;
			}
		}
		System.out.println("LL" + this.previousValue);
	}

	private boolean isNumeric(String strNum) {
		return strNum.matches("-?\\d+(\\.\\d+)?");
	}
	
}