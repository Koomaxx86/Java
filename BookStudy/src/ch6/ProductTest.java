package ch6;

class Product {
	static int count = 0; // 정적변수의 명시적 초기화. 객체가 생성될때마다 인스턴스 초기화 블럭의 count의 증가를 위해서 1회만 초기화 되도록 static으로 선언
	int serialNo; 

	{ // 인스턴스 초기화 블럭
		++count; // 객체가 생성될 때 마다 1씩증가한다
		serialNo = count;
	}

	public Product() {} // 기본생성자
}


public class ProductTest {
	public static void main(String[] args) {

		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();

		System.out.println("p1의 제품번호(serial no)는 " + p1.serialNo);
		System.out.println("p2의 제품번호(serial no)는 " + p2.serialNo);
		System.out.println("p3의 제품번호(serial no)는 " + p3.serialNo);
		System.out.println("생산된 제품의 수는 모두 " + Product.count + "개 입니다.");
	}
}
