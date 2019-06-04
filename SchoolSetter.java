class Results {
	private int phy, che, mat;

	public void setPhysics(int marks) {
		if (marks >= 0 && marks <= 150) {
			phy = marks;
		} else {
			phy = -1;
			System.out.println("Invalid Physics marks");
		}
	}

	public void setChemistry(int marks) {
		if (marks >= 0 && marks <= 150) {
			che = marks;
		} else {
			che = -1;
			System.out.println("Invalid Chemistry marks");
		}
	}

	public void setMaths(int marks) {
		if (marks >= 0 && marks <= 150) {
			mat = marks;
		} else {
			mat = -1;
			System.out.println("Invalid Maths marks");
		}
	}

	public void showResults() {
		if (phy == -1 || che == -1 || mat == -1) {
			System.out.println("No results");
		} else {
			System.out.println("Results: " + (phy + che + mat));
		}
	}
}

class SchoolSetter {
	public static void main(String xyz[]) {
		Results peter, james;

		peter = new Results();
		james = new Results();

		peter.setPhysics(500);
		peter.setChemistry(90);
		peter.setMaths(90);

		// james.setPhysics(151);
		// james.setChemistry(30);
		// james.setMaths(20);

		peter.showResults();
		// james.showResults();
	}
}