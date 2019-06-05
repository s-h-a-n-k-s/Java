abstract class Calculations {
	abstract public void tax (int salary);

	final public void message () {
		tax(28000);

		System.out.println("Hello my friends");
	}
}

class Abstract extends Calculations {
	public void tax (int salary) {
		float result;
		result = salary * 21 / 100;

		System.out.println(result);
	}
	
	public static void main (String xyz[]) {
		Abstract calc = new Abstract();

		calc.message();
	}
}