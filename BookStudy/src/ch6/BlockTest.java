package ch6;

class BlockTest {
	
	// 클래스 초기화 블럭
	// 첫번쨰로 실행. 클래스 로딩시 제일 먼저 실행된다.
	static {
		System.out.println("static { }");
	}

	// 인스턴스 초기화 블럭
	// 세번째 실행. main메소드에서 bt객체를 생성하면서 초기화 블럭이 실행된다.
	{
		System.out.println("{ }");
	}
	
	// 생성자
	// 네번째 실행. 초기화 블럭이 선 실행된 후 생성자가 실행된다.
	public BlockTest() {
		System.out.println("생성자");
	}

	public static void main(String[] args) {
		// 두번째로 실행. main메서드가 로딩되면서 print문이 실행되고 bt객체가 생성된다.
		System.out.println("BlockTest bt = new BlockTest(); ");
		BlockTest bt = new BlockTest();
		
		// 다섯번째 실행. 초기화 블럭이랑 생성자가 전부 실행된 후 실행된다.
		System.out.println("BlockTest bt2 = new BlockTest(); ");
		BlockTest bt2 = new BlockTest();
	}
}
