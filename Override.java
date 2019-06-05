class Maths {
	public void add (int a, int b) {
		int result = a + b;
		System.out.println("Result: " + result);
	}
	
	public void subtraction (int a, int b) {
		int result = a - b;
		System.out.println("Result: " + result);
	}
}

class Maths2 extends Maths {
	public void multiplication (int a, int b) {
		int result = a * b;
		System.out.println("Result: " + result);
	}

	public void subtraction (int a, int b) {
		int result = a - b;
		System.out.println("S2 Result: " + result);
	}
}

class Override {
	public static void main (String xyz[]) {
		Maths maths = new Maths();
		maths.add(1, 2);
		maths.subtraction(5, 2);

		Maths2 maths2 = new Maths2();
		maths2.add(1, 2);
		maths2.subtraction(5, 3);
		maths2.multiplication(3, 2);
	}
}