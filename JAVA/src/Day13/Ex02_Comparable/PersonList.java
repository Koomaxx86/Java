package Day13.Ex02_Comparable;

import java.util.Collections;
import java.util.LinkedList;

public class PersonList {
	public static void main(String[] args) {

		// 인물기본정보(Person)을 기준으로 인물생성(객체생성)
		Person p1 = new Person("김조은", 20);
		Person p2 = new Person("이조은", 24);
		Person p3 = new Person("황조은", 15);
		Person p4 = new Person("권조은", 30);
		Person p5 = new Person("최조은", 38);

		// 생성된 객체를 담을 LinkedList타입의 객체 생성 후 personList에 저장
		LinkedList<Person> personList = new LinkedList<Person>();
		
		// 생성된 personList에 생성된 인물을 저장
		personList.add(p1);
		personList.add(p2);
		personList.add(p3);
		personList.add(p4);
		personList.add(p5);

		// Peron 객체에 구현된 compareTo() 메소드의 비교기준으로 정렬
		Collections.sort(personList);

		for (Person person : personList) {
			System.out.println(person.name + " : " + person.age);
		}
	}
}
