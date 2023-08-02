package Day07.Ex01_Shape;

public class Circle extends Shape {

	double radius;

	public Circle() {
		this(0);
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	double area() {
		// (원주율)*반지름 *반지름
		return Math.PI * radius * radius;
	}

	@Override
	double round() {
		// 2*원주율*반지름
		return 2 * Math.PI * radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

}
