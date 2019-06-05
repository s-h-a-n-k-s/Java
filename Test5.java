class One {
	int a;
	
	public void message1 () {
		System.out.println("Hello");
	}
}

class Two extends One {
	int b;

	public void message1 () {
		System.out.println("Two");
	}

	public void message2 () {
		System.out.println("Manchester");
	}
}

class Test5 {
	public static void main (String xyz[]) {
		One ref = new Two();
		ref.message1();
	}
}