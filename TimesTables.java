class TimesTables {
	public static void main(String xyz[]) {
		for (var i = 2; i <= 10; i++) {

			System.out.println("");
			System.out.println("Table of " + i);
			
			for (var x = 1; x <= 10; x++) {
				System.out.println(i + " x " + x + " = " + (x * i));
			}
			
			System.out.println("");
		}
	}
}