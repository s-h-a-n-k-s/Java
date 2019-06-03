class Second {
	int phe, che;

	public void message() {
		System.out.println("Hello");
		System.out.println("my friends");
	}
}

class Test2 {
	public static void main(String xyz[]) {
		Second x;
		x = new Second();
		x.phe = 75;
		x.message();
	}
}