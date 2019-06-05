class Bank {
	static int dollar;

	public void setDollar(int a) {
		dollar = a;
	}

	public void amount(int b) {
		System.out.println("Amount is: " + (b * dollar));
	}
}

// class Swindon {
// 	int a;

// 	public static void msg() {
// 		a++;
// 		System.out.println(a);
// 	}
// }

class TestBank {
	public static void main(String xyz[]) {
		Bank HSBC, NatWest, NBS;

		HSBC = new Bank();
		NatWest = new Bank();
		NBS = new Bank();

		HSBC.setDollar(100);
		NBS.amount(2);
		NBS.setDollar(50);
		NatWest.amount(2);
	}
}