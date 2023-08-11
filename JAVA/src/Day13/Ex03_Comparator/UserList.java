package Day13.Ex03_Comparator;

import java.util.Collections;
import java.util.LinkedList;

public class UserList {
	public static void main(String[] args) {

		LinkedList<User> userList = new LinkedList<User>();

		User u1 = new User("abcd1001", "홍조은", 20);
		User u2 = new User("abcd1002", "박조은", 30);
		User u3 = new User("abcd1003", "유조은", 10);
		User u4 = new User("abcd1004", "김조은", 30);
		User u5 = new User("abcd1005", "장조은", 20);
		User u6 = new User("abcd1006", "김부평", 30);
		User u7 = new User("abcd1007", "정조은", 30);
		User u8 = new User("abcd1008", "권조은", 10);
		User u9 = new User("abcd1009", "고조은", 10);
		User u10 = new User("abcd1010", "송조은", 20);

		userList.add(u1);
		userList.add(u2);
		userList.add(u3);
		userList.add(u4);
		userList.add(u5);
		userList.add(u6);
		userList.add(u7);
		userList.add(u8);
		userList.add(u9);
		userList.add(u10);

		// Collections.sort( 리스트, Comparator 구현객체 )
		// - 오버라이딩한 compare 메소드의 기준에 따라서 정렬한다
		// 인자로 넘겨진 User에 구현한 compare 메소드가 조건으로 실행된다.
		Collections.sort(userList, new User());

		for (User user : userList) {
			System.out.print("id : " + user.id);
			System.out.print(", name : " + user.name);
			System.out.print(", age " + user.age);
			System.out.println();
		}
	}
}
