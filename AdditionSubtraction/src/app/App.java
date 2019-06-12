package app;

import java.awt.*;

public class App {
    public static void main(String[] args) throws Exception {
		Frame frame = new Frame("calculation");
		FlowLayout layout = new FlowLayout();
		Label firstLabel = new Label("First No:");
		TextField firstField = new TextField();
		Label secondLabel = new Label("Second No:");
		TextField secondField = new TextField();
		Checkbox addition = new Checkbox();
		Checkbox subtraction = new Checkbox();
		Button result = new Button("Result");
		TextField resultField = new TextField();
		
		frame.setLayout(layout);
		frame.add(firstLabel);
		frame.add(firstField);
		frame.add(secondLabel);
		frame.add(secondField);
		frame.add(addition);
		frame.add(subtraction);
		frame.add(result);
		frame.add(resultField);

    }
}