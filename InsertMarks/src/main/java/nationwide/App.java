package nationwide;

import java.awt.*;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
		Frame frame = new Frame("Enter Marks");
		TextField regNo, name, marks;
		Button save = new Button("Save");

		regNo = new TextField(10);
		name = new TextField(10);
		marks = new TextField(10);

		EnterData eventHandler = new EnterData(regNo, name, marks);
		save.addActionListener(eventHandler);

		WindowHandler wH = new WindowHandler();

		frame.addWindowListener(wH);
		frame.setLayout(new GridLayout(4, 2));
		frame.add(new Label("Regno"));
		frame.add(regNo);
		frame.add(new Label("Name"));
		frame.add(name);
		frame.add(new Label("Marks"));
		frame.add(marks);
		frame.add(new Label());
		frame.add(save);
		frame.setSize(400, 400);
		frame.setVisible(true);
    }
}
