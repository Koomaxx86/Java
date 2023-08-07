package Day10.Ex03_Object;

class Point {
	int x, y;
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
}

// clone() 메소드를 사용하려면, Cloneable 인터페이스를 구현해야 한다.
// - 구현하지 않으면, CloneNotSupportedException 예외 발생
class Circle implements Cloneable { 
	Point point;
	int radius;
	
	Circle(int x, int y, int radius) {
		this.radius = radius;
		point = new Point(x, y);
	}

	@Override
	public String toString() {
		return "Circle [point=" + point + ", radius=" + radius + "]";
	}

	// clone 메소드 오버라이딩
	// 객체의 내부값을 복사한다. 서로 다른 객체
	@Override
	protected Object clone() throws CloneNotSupportedException { // 메소드 호출한 곳으로 예외던지기
		return super.clone();
	}
}


public class ObjectClone {
	public static void main(String[] args) throws CloneNotSupportedException  { // 메인에서 던전 예외처리는 JVM으로 넘어간다.
		
		Circle circle = new Circle(10, 20, 30); // 객체생성
		Circle copyCircle = (Circle) circle.clone(); // clone메소드 호출. 반환 타입은 object이다. 타입을 다운 캐스팅. 예외던지기는 다른곳으로 재 던지기 했다.
		
		System.out.println(circle);
		System.out.println(copyCircle);
		
		if( circle.equals(copyCircle)) {
			System.out.println("Circle 과 copyCircle 은 같은 객체입니다.");
		}
		
		// System.identityHashCode(객체) : 객체의 해시코드를 반환
		System.out.println(System.identityHashCode(circle)); // 해시코드는 다르다. 그러나 안에 내부 값을 동일하다.
		System.out.println(System.identityHashCode(copyCircle));
	}
}
