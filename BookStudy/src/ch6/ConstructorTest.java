package ch6;

class Data1 {
	int value;
}

class Data2 {
	int value;
	
	Data2(int x) {
		value = x;
	}
}

public class ConstructorTest {
public static void main(String[] args) {
	
	Data1 d1 = new Data1();
	//Data2 d2 = new Data2(); // 기본생성자가 없어서 에러발생.
							  // 생성자가 하나도 정의되어 있지 않아야 컴파일러가 자동으로 추가해준다.
}
}
