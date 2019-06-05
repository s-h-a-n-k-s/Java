class College {
	private int phy, che, total;
	private float per;

	private void calculations() {
		total = phy + che;
		per = total * 100 / 300;
	}
		
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

	public void showResults() {
		if (che == -1 || phy == -1) {
			System.out.println("No Results");
		} else {
			calculations();
			System.out.println("Total Marks: " + total);
			System.out.println("Percentage: " + per);
		}
	}
}

class Test4 {
	public static void main(String xyz[]) {
		College abc;
		abc = new College();
		abc.setPhysics(70);
		abc.setChemistry(80);

		abc.showResults();
	}
}