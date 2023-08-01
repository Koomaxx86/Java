package Day04.Ex01_Student;

public class Student {

	// 학생의 속성 : 이름, 나이, 학번, 전공
	// 학생의 행동 : 공부하기, 성적 평균 구하기

	// 변수
	String name;
	int age;
	String stdNo;
	String major;

	// 생성자
	// - 기본 생성자
	public Student() {
		this("이름없음", 1, "00000000", "없음");
	}

	// - 모든 매개변수를 포함하는 생성자
	public Student(String name, int age, String stdNo, String major) {
		super();
		this.name = name;
		this.age = age;
		this.stdNo = stdNo;
		this.major = major;
	}

	// 메소드
	// - 공부하기
	public void study(String subject) {
		System.out.println(subject + "(을/를) 공부합니다.");
		// 반환타입이 void 이면, return을 생략해도 된다.
	}

	// - 성적 평균 구하기
	public double getAverage(int score1, int score2) {
		double average = 0.0;
		average = (double) (score1 + score2) / 2; // 더블형으로 형변환
		return average;
	}

	// 메소드 오버로딩
	public double getAverage(int score1, int score2, int score3) {
		double average = 0.0;
		average = (double) (score1 + score2 + score3) / 3;
		return average;
	}

	// 메소드 오버로딩
	public double getAverage(int[] score) {
		double average = 0.0;
		int sum = 0;

		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		// 평균
		average = (double) sum / score.length;
		return average;
	}
}