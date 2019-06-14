package nationwide;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class EnterData implements ActionListener {
	TextField regNo, name, marks;
	Statement statement;

	public EnterData(TextField regNo, TextField name, TextField marks) {
		this.regNo = regNo;
		this.name = name;
		this.marks = marks;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/nationwide", "root", "root");
			statement = conn.createStatement();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	public void actionPerformed(ActionEvent e) {
		String regNo, name, marks;
		String insertQuery = "";

		regNo = this.regNo.getText();
		name = this.name.getText();
		marks = this.marks.getText();

		insertQuery = "INSERT INTO school values(" + regNo + ", '" + name + "', " + marks + ")";
		try {
			statement.executeUpdate(insertQuery);
		} catch (Exception ex) {
			System.out.println(ex.toString());
		}
	}
	
}