package ch6;

class Car2 {
	String color;
	String gearType;
	int door;

	Car2() { // 매개변수가 없는 기본 생성자
		this("white", "auto", 4); // 3번째 매개변수가 있는 생성자를 호출 후 값을 전달
		// this( )를 통해 다른 생성자를 호출한다.
	}
	
	Car2(String color) { // 매개변수가 있는 생성자
	 this(color, "auto", 4); 
	}

	Car2(String color, String gearType, int door) { // 매개변수가 있는 생성자
		// this.변수명 을 통해서 객체 자신의 변수를 가르킨다.
		this.color = color; 
		this.gearType = gearType;
		this.door = door;
	}
}

	public class CarTest2 {
		public static void main(String[] args) {

			Car2 c1 = new Car2();
			Car2 c2 = new Car2("blue"); // 생성자의 인자값으로 blue를 전달. Car 클래스의 2번째 생성자가 자동 호출된다.

			System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType+ ", door="+c1.door);
			System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType+ ", door="+c2.door);

		}
	}
