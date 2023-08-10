package ch6;

class Car {
	String color;
	String gearType;
	int door;

	Car() { // 기본생성자

	}

	Car(String c, String g, int d) { // 매개변수가 있는 생성자
		color = c;
		gearType = g;
		door = d;
	}
}


public class CarTest {
	public static void main(String[] args) {

		Car c1 = new Car(); // Car 객체 생성. 생성자 매개변수 전달 없음
		c1.color = "white"; // color 값 직접 입력
		c1.gearType = "auto"; // gearType 값 직접 입력
		c1.door = 4; // door 값 직접 입력
		
		Car c2 = new Car("white", "auto", 4); // Car 객체 생성 후 생성자의 매개변수에 값 전달
		
		System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType+ ", door="+c1.door);
		System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType+ ", door="+c2.door);
	}
}
