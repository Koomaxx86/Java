package Day07.Ex01_Shape;

import java.util.Scanner;

public class ShapeMaker {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// 초기화
		Shape shape = null; // triangle, Circle, Rectangle의 공통자료형이 shape 이기에 shape형으로 선언을 한다
		double width = 0.0;
		double height = 0.0;
		double radius = 0.0;

		// 총합
		double roundSum = 0.0;
		double areaSum = 0.0;

		// 입력 받은 도형 정보 배열
		Shape[] shapeList = new Shape[3]; // shape타입의 객체배열 3칸 생성. 배열만 생성됨
		int index = 0;

		while (true) { // 무한반복문
			if(index == 3) // index의 값이 3이면 아래 break문으로 중지
				break;

			System.out.println("1. 삼각형, 2. 사각형, 3. 원형");
			System.out.print(">>");
			String input = sc.next(); // 사용자로 부터 입력받은 값을 input에 저장

			if (input.equals("그만")) // input 값에 "그만" 이라는 문자열 저장시 break문 실행
				break;

			switch (input) {
			// 삼각형
			case "1":
				System.out.print("가로>>");
				width = sc.nextDouble(); // 입력받은 double형 숫자를 width에 저장
				System.out.print("세로>>");
				height = sc.nextDouble(); // 입력받은 double형 숫자를 height에 저장

				shape = new Triangle(width, height); // Triangle 객체를 생성후 입력받은 값 2개를 생성자로 전달. 트라이앵글 객체는 자료형이 트라이앵글과, shape의 자식이기에 2가지의 자료형이다
				shapeList[index++] = shape; 
				break;

			// 사각형
			case "2":
				System.out.print("가로>>");
				width = sc.nextDouble();
				System.out.print("세로>>");
				width = sc.nextDouble();

				shape = new Rectangle(width, height);
				shapeList[index++] = shape;
				break;

			// 원형
			case "3":
				System.out.print("반지름>>");
				radius = sc.nextDouble();

				shape = new Circle(radius);
				shapeList[index++] = shape;
				break;
			}
		} // - while 끝
		
		for (Shape s : shapeList) {
			if (s == null)
				continue;

			// instanceof : 인스턴스를 비교하는 연산
			if(s instanceof Triangle)
				System.out.println("[삼각형]");
			if(s instanceof Rectangle)
				System.out.println("[사각형]");
			if(s instanceof Circle)
				System.out.println("[원형]");
			
			double area = s.area();
			double round = s.round();

			areaSum = areaSum + area;
			roundSum = roundSum + round;

			System.out.print("넓이 : " + area + "\t");
			System.out.print("둘레 : " + round + "\t");
			System.out.println();
		}
		
		System.out.println("넓이 총합 : " + areaSum);
		System.out.println("둘레 총합 : " + roundSum);
		sc.close();
	}
}
