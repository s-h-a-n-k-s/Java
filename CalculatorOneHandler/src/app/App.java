package app;
import java.awt.*;
import app.ActionHandler;

public class App {
    public static void main(String[] args) throws Exception {
        Frame f = new Frame("calculation");
		TextField t1, t2, t3;
		Label l1, l2, l3;
		Button b1 = new Button("+");
		Button b2 = new Button("-");
		Button b3 = new Button("/");
		Button b4 = new Button("*");
		
		l1 = new Label("First no:");
		l2 = new Label("Second no:");
		l3 = new Label("Result:");

		t1 = new TextField(0);
		t2 = new TextField(0);
		t3 = new TextField(0);

		FlowLayout fl = new FlowLayout();
		f.setLayout(fl);

		ActionHandler e = new ActionHandler(t1, t2, t3);
		b1.addActionListener(e);
		b2.addActionListener(e);
		b3.addActionListener(e);
		b4.addActionListener(e);

		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(l3);
		f.add(t3);

		f.setSize(400, 400);
		f.setVisible(true);
    }
}