class Maths {
	public void addition(int a, int b) {
		int result;
		result = a + b;

		System.out.println("Result: " + result);
	}

	public int subtraction(int a, int b) {
		int answer;
		answer = a - b;

		return answer;
	}
}

class Test3 {
	public static void main(String xyz[]) {
		Maths x;
		x = new Maths();

		x.addition(2, 10);
		System.out.println("Result is: " + x.subtraction(100, 5));
	}
}