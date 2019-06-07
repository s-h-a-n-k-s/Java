class Math47 {
	private int priv;
	protected int prot;
	public int pub;
}

class Math46 {
	int a;

	public void message () {
		int a;
		a = 20;
		this.a = 15;

		System.out.println("Result: " + a);
	}
	
	public void message2 () {
		System.out.println("Result: " + this.a);
	}
	
	public void ext () {
		Math47 m = new Math47();
		m.prot = 9;
		m.pub = 10;
		// priv = 1;
		// System.out.println(priv);
		// prot = 7;
		// pub = 8;
		System.out.println(m.prot);
		System.out.println(m.pub);
	}

	public static void main (String xyz[]) {
		Math46 m = new Math46();

		m.message();
		m.message2();
		m.ext();
	}
}