class Results {
	public static void main(String xyz[]) {
		int phy, che, mat, total;
		float per;

		phy = 50;
		che = 100;
		mat = 100;

		total = phy + che + mat;
		per = total * 100 / 450;

		System.out.println("Total marks: " + total);
		System.out.println("Percentage: " + per);

		if (per >= 60) {
			System.out.println("You have passed the exam");
		} else {
			System.out.println("You have failed the exam - please copy the below link into your browser");
			System.out.println("https://people.mcdonalds.co.uk/?utm_source=google&utm_medium=paidsearch&utm_campaign=mcdonalds_summer&gclid=EAIaIQobChMIs4KnrIHN4gIV7bXtCh3jEwTtEAAYAiAAEgI0WfD_BwE");
		}
	}
}