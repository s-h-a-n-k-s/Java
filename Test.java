class Second {
	int x;
	int y;
}

class Test {
	public static void main(String xyz[]) {
		Second ref;

		ref = new Second();
		ref.x = 15;
		ref.y = 20;

		System.out.println(ref.x + ref.y);
	}
}