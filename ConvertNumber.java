class NumberConverter {
	private String ones (int number) {
		String string = "";

		switch (number) {
			case 1:
			string = "one";
			break;

			case 2:
			string = "two";
			break;

			case 3:
			string = "three";
			break;

			case 4:
			string = "four";
			break;

			case 5:
			string = "five";
			break;

			case 6:
			string = "six";
			break;

			case 7:
			string = "seven";
			break;

			case 8:
			string = "eight";
			break;

			case 9:
			string = "nine";
			break;

			case 10:
			string = "ten";
			break;

			case 11:
			string = "eleven";
			break;

			case 12:
			string = "twelve";
			break;

			case 13:
			string = "thirteen";
			break;

			case 14:
			string = "fourteen";
			break;

			case 15:
			string = "fifteen";
			break;

			case 16:
			string = "sixteen";
			break;

			case 17:
			string = "seventeen";
			break;

			case 18:
			string = "eighteen";
			break;

			case 19:
			string = "nineteen";
			break;
		}

		return string;
	}

	private String tens (int number) {
		String string = "";

		switch (number) {
			case 20:
			string = "twenty";
			break;

			case 30:
			string = "thirty";
			break;

			case 40:
			string = "fourty";
			break;

			case 50:
			string = "fifty";
			break;

			case 60:
			string = "sixty";
			break;

			case 70:
			string = "seventy";
			break;

			case 80:
			string = "eighty";
			break;

			case 90:
			string = "ninety";
			break;
		}

		return string;
	}

	public void convert (int number) {
		String string = "";

		if (number >= 1000 && number <= 9999) {
			string += ones(number / 1000) + " thousand ";
			number %= 1000;
		}
		if (number >= 100) {
			string += ones(number / 100) + " hundred ";
			number %= 100;
		}
		if (number >= 20) {
			string += tens(number / 10 * 10) + " ";
			number %= 10;
		}
		if (number > 0 && number <= 19) {
			string += ones(number) + " ";
		}

		System.out.println(string);
	}
}

class ConvertNumber {
	public static void main (String xyz[]) {
		NumberConverter converter = new NumberConverter();
		converter.convert(1111);
	}
}