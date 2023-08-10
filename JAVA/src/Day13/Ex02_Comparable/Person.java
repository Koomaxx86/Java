package Day13.Ex02_Comparable;

public class Person implements Comparable<Person>{

	String name;

	int age;

	public Person() {

	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}





	// 컬렉션의 객체에 대한 비교기준을 지정하는 메소드
	@Override
	public int compareTo(Person o) {
		// this : 해당 객체
		// o 	: 비교 객체
		// 나이순으로 오름차순

		int thisAge = this.getAge();
		int comAge = o.getAge();
		
		//	방법 1
		//	if( thisAge > comAge) {
		//		// 나이가 큰 사람이 큰 객체다
		//	
		//		return 1;
		//	}
		//	if( thisAge == comAge) {
		//		// 나이가 같으면 같은 크기의 객체다
		//		return 0;
		//	}
		//	
		//	if( thisAge < comAge) {
		//		// 나이가 작은 사람이 작은 객체다
		//		return -1;
		//	}
		
		// 방법2
		int gap = thisAge - comAge;  // 오름차순
		int gap2 = comAge - thisAge; // 내림차순
		return gap2;
	}
}

