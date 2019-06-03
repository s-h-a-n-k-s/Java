class Results {
	private int phy, che, mat;

	public void setPhysics(int marks) {
		if (marks >= 0 && marks <= 150) {
			phy = marks;
		} else {
			System.out.println("Invalid Physics marks");
		}
	}

	public void setChemistry(int marks) {
		if (marks >= 0 && marks <= 150) {
			che = marks;
		} else {
			System.out.println("Invalid Chemistry marks");
		}
	}

	public void setMaths(int marks) {
		if (marks >= 0 && marks <= 150) {
			mat = marks;
		} else {
			System.out.println("Invalid Maths marks");
		}
	}

	public void showResults() {
		System.out.println("Results: " + (phy + che + mat));
	}
}

class SchoolSetter {
	public static void main(String xyz[]) {
		Results peter, james;
		peter = new Results();
		james = new Results();

		peter.setPhysics(50);
		peter.setChemistry(90);
		peter.setMaths(90);

		james.setPhysics(151);
		james.setChemistry(30);
		james.setMaths(20);

		peter.showResults();
		james.showResults();
	}
}