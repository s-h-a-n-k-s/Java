class MoreLoops {
	public static void main(String xyz[]) {
		int a = 1;
		System.out.println("First Loop");
		for (; a <= 10; ++a) {
			System.out.println(a);
		}

		int b, c, d;
		System.out.println("Second Loop");
		for (b = 1, c = 10, d = 100; b <= 10;) {
			System.out.println(b + " - " + c + " - " + d);
			b++;
			c += 10;
			d += 100;
		}

		int e, f, g;
		System.out.println("Third Loop");
		for (e = 1, f = 10, g = 100; e <= 10; e++, f += 10, e += 100) {
			System.out.println(e + " - " + f + " " + g);
		}
	}
}