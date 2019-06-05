abstract class Draw {
	abstract public void drawing();
}

class Line extends Draw {
	public void drawing () {
		System.out.println("Drawing line");
	}
}

class Circle extends Draw {
	public void drawing () {
		System.out.println("Drawing circle");
	}
}

class Square extends Draw {
	public void drawing () {
		System.out.println("Drawing square");
	}
}

class Drawing {
	public static void letsDraw (Draw d) {
		d.drawing();
	}

	public static void main (String xyz[]) {
		Line l = new Line();
		letsDraw(l);

		Circle c = new Circle();
		letsDraw(c);

		Square s = new Square();
		letsDraw(s);
	}
}