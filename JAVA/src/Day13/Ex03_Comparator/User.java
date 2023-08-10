package Day13.Ex03_Comparator;

import java.util.Comparator;

public class User implements Comparator<User> {

	String id;
	String name;
	int age;
	
	public User() {}

	public User(String id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public String getId() {return id;}
	public void setId(String id) {this.id = id;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public int getAge() {return age;}
	public void setAge(int age) {this.age = age;}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compare(User o1, User o2) { // o1기준객체, o2비교객체
		// 정렬 기준 1 : 나이순 - 오름차순
		// 정렬 기준 2 : 이름순 - 오름차순
		
		// o1의 나이가 o2의 나이보다 클 때, 양수

		
		// o1의 나이가 o2의 나이보다 작을 떄, 음수
	
		
		// o1의 나이가 o2와 같을 떄
			// o1의 이름이 o2의 이름보다 사전순으로 뒤에 있을 때, 양수
			// o1의 이름이 o2의 이름보다 사전순으로 앞에 있을 때, 음수
		String name1 = o1.getName();
		String name2 = o2.getName();
		
		int age1 = o1.getAge();
		int age2 = o2.getAge();
		
		int result1 = age1 - age2;
		int result2 = name1.compareTo(name2);
		
		return result1 == 0 ? result2 : result1;
		
//		if( result1 == 0) return result2;
//			return result1;
	}
}
