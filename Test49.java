class One extends First {
	public One () {
		super(8);
		System.out.println(1);
	}
}

class Two extends One {
	public Two (int a) {
		super();
		System.out.println(2);
	}

	public Two () {
		System.out.println(3);
	}
}

class Second {
	public Second () {
		System.out.println(7);
	}
}

class First extends Second {
	public First () {
		System.out.println(6);
	}

	public First (int a) {
		System.out.println(9);
	}
}

class Test49 {
	public static void main (String xyz[]) {
		Two x = new Two();
	}
}