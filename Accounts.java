class Account {
	public void tax() {
		System.out.println("Tax rate is " + 22.7);
	}

	public void tax(int salary) {
		float t;
		t = salary * 22.7F / 100;
		System.out.println("Your tax is: \u00a3" + t);
	}

	public void tax(int salary, float taxRate) {
		float t;
		t = salary * taxRate / 100;
		System.out.println("Your tax is: \u00a3" + t);
	}
}

class Accounts {
	public static void main(String xyz[]) {
		Account one = new Account();
		one.tax();
		one.tax(28000);
		one.tax(28000, 12);
	}
}