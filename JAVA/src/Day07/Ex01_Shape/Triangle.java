package Day07.Ex01_Shape;

public class Triangle extends Shape {

	double width, height;
	
	public Triangle() {
		this(0,0);
	}
	
	public Triangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	double area() { // 추상 메소드의 완성
		//(가로) X (세로) / 2
		return width * height / 2;
	}

	@Override // 추상 메소드의 완성
	double round() {
		// (정삼각형) : (한변의 길이) * 3
		return width * 3;
	}


	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}


	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}


	@Override
	public String toString() {
		return "Triangle [width=" + width + ", height=" + height + "]";
	}
	
}
