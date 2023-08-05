package ch6;

public class ReferenceParamEx3 {
	public static void main(String[] args) {
		int[] arr = new int[] { 3, 2, 1, 6, 5, 4 }; // int타입의 참조변수 arr선언 후 6의 길이를 가진 1차원 배열 생성과 동시에 값 입력

		// 동일 class 의 static 메소드는 객체생성없이 메소드명만으로 호출가능
		printArr(arr); // printArr 메소드 호출
		sortArr(arr); // sortArr 메소드 호출
		printArr(arr); // sortArr으로 정렬된 배열이 출력된다.
		System.out.println("sum=" + sumArr(arr));
	}

	static void printArr(int[] arr) {
		System.out.print("[");

		for (int i : arr) // 향상된 for문. 배열 arr의 값을 순차적으로 i에 입력한다.
			System.out.print(i + ","); // 향상된 for문에 의해 i에 저장된 배열의 값이 출력된다.
		System.out.println("]"); // 위 반복문이 끝나고 조건식이 false가 되면 실행되는 마지막 출력문
	}

	static int sumArr(int[] arr) {
		int sum = 0;

		for (int i = 0; i < arr.length; i++)
			sum += arr[i];
		return sum;
	}

	// 버블정렬
	static void sortArr(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) // 총 반복횟수 지정.(-1은 인데스번호 0부터 시작이기에 붙임.)
			for (int j = 0; j < arr.length - 1 - i; j++) // 비교를 할 index번호. 2사이클 이상부터는 끝자리의 비교가 필요없기에 i만큼 줄인다.
				if (arr[j] > arr[j + 1]) { // 버블정렬 교환 코드
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}
	}
}