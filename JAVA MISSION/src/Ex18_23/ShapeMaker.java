package Ex18_23;

import java.util.Scanner;

public class ShapeMaker {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Shape shape =null;
		double width = 0.0;
		double height = 0.0;
		double radius = 0.0;
		
		double roundSum = 0.0;
		double areaSum = 0.0;
		
		Shape[] shapeList = new Shape[3];
		int index = 0;
		
		while (true) {
			if( index == 3 ) break;
			
			System.out.print("1. 삼각형, 2. 사각형, 3. 원형");
			System.out.print(">>");
			String input = sc.next();
			
			if( input.equals("그만") ) break;
			
			switch ( input ) {
			case "1":
				System.out.print("가로>>");
				width = sc.nextDouble();
				System.out.print("세로>>");
				height = sc.nextDouble();
				
				// 삼각형 객체 생성
				shape = new Triangle(width, height);
				// 객체의 참조 변수를 리스트에 추가
				shapeList[index++] = shape;
				break;
				
			case "2":
				System.out.print("가로>>");
				width = sc.nextDouble();
				System.out.print("세로>>");
				height = sc.nextDouble();
				
				// 사각형 객체 생성
				shape = new Rectangle(width, height);
				// 객체의 참조변수를 리스트에 추가
				shapeList[index++] = shape;
				break;
				
			case "3":
				System.out.print("반지름>>");
				radius = sc.nextDouble();
						
				// 원형 객체 생성
				shape = new Circle(radius);
				// 객체의 참조변수를 리스트에 추가
				shapeList[index++] = shape;
				break;
			}
		}
		
		// foreach를 통해 하나씩 출력
		for (Shape s : shapeList) {
			if(s == null ) continue;
			
			double area = s.area();
			double round = s.round();
			
			areaSum = areaSum + area;
			roundSum = roundSum + round;
			
			System.out.println("넓이 : " + area);
			System.out.println("둘레 : " + round);

		}			
		
		System.out.println("넓이 총합 : " + areaSum);
		System.out.println("둘레 총합 : " + roundSum);
		sc.close();
	}
	
}
