class Bank {
	private int amount;

	public Bank() {
		System.out.println("Hello my friends");
	}

	public void deposit(int money) {
		amount += money;
	}

	public void withdraw(int money) {
		if (money <= amount) {
			amount -= money;
		} else {
			System.out.println("Not enough funds");
		}
	}

	public void balance() {
		System.out.println("Your balance is: " + amount);
	}
}

class NBS {
	public static void main(String xyz[]) {
		Bank ref;
		ref = new Bank();
		
		ref.balance();
		ref.deposit(100);
		ref.withdraw(50);
		ref.balance();
	}
}