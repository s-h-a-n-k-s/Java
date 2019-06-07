
class Exceptions {
	public static void main (String xyz[]) {
		int a, b, c;
		a = b = c = 0;

		int[] numbers = new int[10]; //{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		for (int number : numbers) {
			System.out.println(number);
		}

		try {
			a = 4;
			b = 0;
			c = a / b;

			System.out.println("Result: " + a + " / " + b + " = " + c);
		} catch (ArithmeticException exception) {
			System.out.println("You cannot divide by 0");
		} catch (NumberFormatException exception) {
			System.out.println("Enter a number");
		}
	}
}