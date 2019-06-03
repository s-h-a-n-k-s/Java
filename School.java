class Results {
	int phy, che, mat;

	public void showResults(String name) {
		int total;
		total = phy + che + mat;

		System.out.println("");
		System.out.println(name + ":");
		System.out.println("Total score: " + total);
		
		if (total > 300) {
			System.out.println("Passed");
		} else {
			System.out.println("Failed");
		}

		System.out.println("----------------");
		System.out.println("");
	}
}

class School {
	public static void main(String xyz[]) {
		Results peter, james;
		peter = new Results();
		james = new Results();

		peter.mat = 50;
		peter.che = 100;
		peter.phy = 100;

		james.mat = 60;
		james.che = 40;
		james.phy = 50;

		peter.showResults("Peter");
		james.showResults("James");
	}
}