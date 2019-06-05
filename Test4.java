class Manchester {
	public Manchester(int a) {
		System.out.println("Hello 1");
	}

	public Manchester(int a, int b) {
		System.out.println("Hello 2");
	}
}

class Test4 {
	public static void main(String xyz[]) {
		Manchester manchester = new Manchester(1);
		Manchester manchester2 = new Manchester(1, 2);
	}
}