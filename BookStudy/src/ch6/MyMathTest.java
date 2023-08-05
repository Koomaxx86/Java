package ch6;

// 인자값과 매개변수의 형변환

public class MyMathTest {
public static void main(String[] args) {
	
	MyMath mm = new MyMath(); // MyMath타입의 참조변수 mm선언 후 MyMath객체를 생성. 주소값 저장
	long result1 = mm.add(5L, 3L); // 참조변수 mm을 통해 MyMath객체의 add메소드 호출 후 인자값으로 5과 3을 전달 후 return값을 result1에 저장한다.
	long result2 = mm.subtract(5L, 3L); // 참조변수 mm을 통해 MyMath객체의 subtract메소드 호출 후 인자값으로 5과 3을 전달 후 return값을 result2에 저장한다.
	long result3 = mm.multiply(5L, 3L); // 참조변수 mm을 통해 MyMath객체의 multiply메소드 호출 후 인자값으로 5과 3을 전달 후 return값을 result3에 저장한다.
	double result4 = mm.divide(5L, 3L); // 참조변수 mm을 통해 MyMath객체의 divide메소드 호출 후 인자값으로 5과 3을 전달 후 return값을 result4에 저장한다.
										// divide의 반환타입이 double 이므로 변수의 타입역시 동일하거나 형변환 가능한 타입으로 선언해야 된다.
	
	System.out.println("add(5L, 3L) = "+ result1);
	System.out.println("subtract(5L, 3L) = "+ result2);
	System.out.println("multiply(5L, 3L) = "+ result3);
	System.out.println("divide(5L, 3L) = "+ result4); // divide의 매개변수는 double형이라 값을 long타입으로 주면 자동형변환 되서 doble형으로 입력된다.
}
}

class MyMath {
	long add(long a, long b) {
		long result = a+b;
		return result;
		// return a + b; // 위 두 줄을 이와 같이 한 줄로 간단히 할 수 있다.
	}
	
	long subtract(long a, long b) {
		return a - b;
	}
	long multiply(long a, long b) {
		return a * b;
	}
	double divide(double a, double b) {
		return a / b;
	}
}
