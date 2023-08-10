package ch6;

class Car3 {
	String color;
	String gearType;
	int door;
	
	Car3() { // 기본생성자
		this("white", "auto", 4); // 다른생성자 호출 및 인자값 전달 
	}
	
	// 인스턴스 복사를 위한 생성자
	Car3 (Car3 c) { // 생성자의 매개변수로 Car3타입의 객체가 들어올수 있다.
		color = c.color; // 매개변수로 들어온 객체의 color값을 복사한다.
		gearType = c.gearType; // 매개변수로 들어온 객체의 gearType값을 복사한다.
		door = c.door; // 매개변수로 들어온 객체의 door값을 복사한다.
	}
	
	Car3(String color, String gearType, int door) {
		this.color = color; 
		this.gearType = gearType;
		this.door = door;
}
}
	
public class CarTest3 {
	public static void main(String[] args) {
		
		Car3 c1 = new Car3(); // Car3 객체 생성 후 참조변수 c1에 저장
		Car3 c2 = new Car3(c1); // Car3 객체 생성 후 생성자에 c1의 참조값을 전달하여 c2생성자에 사용 
		System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType+ ", door="+c1.door);
		System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType+ ", door="+c2.door);
		
		c1.door = 100;
		System.out.println("c1.door=100; 수행 후");
		System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType+ ", door="+c1.door);
		System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType+ ", door="+c2.door);
	}
}
