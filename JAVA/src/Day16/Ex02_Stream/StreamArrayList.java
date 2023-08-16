package Day16.Ex02_Stream;

import java.util.*;

class Person {
	String name;
	int age;
	
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

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
	
}

public class StreamArrayList {
	public static void main(String[] args) {
		
		// ArrayList 객체를 생성 후 List타입의 참조변수 list로 선언. 타입매개변수는 Person을 준다
		List<Person> list = new ArrayList<Person>();
		list.add( new Person("김조은", 20 ));
		list.add( new Person("이조은", 30 ));
		list.add( new Person("박조은", 25 ));
		list.add( new Person("최조은", 35 ));
		list.add( new Person("조은", 28 ));
		list.add( new Person("김조", 22 ));
		
		// 매핑
		// - 스트림 요소를 사용하려는 형태로 변환하는 연산
		// stream메소드를 통해 map메소드로 객체의 name만 뽑아 온뒤 foreach를 통해 하나씩 출력
		list.stream().map( p -> p.name ).forEach( n -> System.out.print(n + " ") );
		System.out.println();

		list.stream().map( p -> p.age ).forEach( n -> System.out.print(n + " ") );
		System.out.println();
		
		// 필터
		// - 스트림 요소에서 조건에 맞는 요소만 선택하는 연산
		// stream메소드를 통해 filter메소드로 객체의 name의 길이가 3보다 크거나 같은것만 만 뽑아 온뒤 foreach를 통해 하나씩 출력
		list.stream().filter( p -> p.name.length() >= 3).forEach(p -> System.out.print(p.name + " "));
		System.out.println();
		
		// 정렬
		// - 메소드 레퍼런스(::)
		// 클래스명 :: 메소드명		: 메소드 레퍼런스를 지정하는 문법
		// * 메소드 호출 시, 전달인자로 메소드 레퍼런스를 지정하여 넘겨줄 수 있다.
		// * 메소드를 통해 메소드를 전달하는 람다식을 대체하는 문법이다.
		
		// 이름 순으로 정렬 - 오름차순
//		list.stream().sorted( Comparator.comparing( p -> p.getName() ) );	// 람다식
		list.stream().sorted( Comparator.comparing( Person::getName ))	    // 메소드 레퍼런스. Person객체의 getName을 찾아간다.
					 .forEach( p -> System.out.println(p) );
		
		System.out.println();
		
		// 나이 순으로 정렬 - 오름차순
		list.stream().sorted( Comparator.comparing( Person::getAge ) )
					 .forEach( p -> System.out.println(p) );
		
		System.out.println();
		
		
		// 이름 순으로 정렬 - 내림차순
		// .reversed()를 통해서 내림차순으로 변경된다.
		list.stream().sorted( Comparator.comparing( Person::getName ).reversed())	    // 메소드 레퍼런스. Person객체의 getName을 찾아간다.
		.forEach( p -> System.out.println(p) ); // foreach문을 통해 p에 하나씩 저장을 한 뒤 프린트로 출력한다.
		
		System.out.println();
		
		// 나이 순으로 정렬 - 내림차순
		// .reversed()를 통해서 내림차순으로 변경된다.
		list.stream().sorted( Comparator.comparing( Person::getAge ).reversed() )
		.forEach( p -> System.out.println(p) );
		
		System.out.println();
		
		// 이름이 3글자 이상인 사람이 몇 명 인지
		//
		long count = list.stream().filter( p -> p.name.length() >= 3).count();
		System.out.println("count : " + count);
	}
}
