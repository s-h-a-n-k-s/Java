import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class EHandler implements ActionListener {
	TextField no1, no2, no3;

	public EHandler(TextField a, TextField b, TextField c) {
		no1 = a;
		no2 = b;
		no3 = c;
	}

	public void actionPerformed(ActionEvent e) {
		int a, b, c;

		a = Integer.parseInt(no1.getText());
		b = Integer.parseInt(no2.getText());

		c = a + b;

		no3.setText(Integer.toString(c));
	}
}

class AddWindow {
	public static void main (String args[]) {
		Frame f = new Frame("calculation");
		TextField t1, t2, t3;
		Label l1, l2, l3;
		Button b1 = new Button("=");
		
		l1 = new Label("First no:");
		l2 = new Label("Second no:");
		l3 = new Label("Result:");

		t1 = new TextField(0);
		t2 = new TextField(0);
		t3 = new TextField(0);

		FlowLayout fl = new FlowLayout();
		f.setLayout(fl);

		EHandler e = new EHandler(t1, t2, t3);
		b1.addActionListener(e);

		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
		f.add(b1);
		f.add(l3);
		f.add(t3);

		f.setSize(400, 400);
		f.setVisible(true);
	}
}