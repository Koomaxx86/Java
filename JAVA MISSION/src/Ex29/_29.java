package Ex29;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _29 {
	
	public static void main(String[] args) {
		
		Map<String, String> hash = new HashMap<>();
	
		System.out.print("입력한 단어 수 : ");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 0;
		
		while(count<N) {
			// 키 값을 한글로 지정
			System.out.print(">>한글 : ");
			String str1 = sc.next();
			System.out.print(">>영어 : ");
			String str2 = sc.next();
			
			// 입력받은 str1값과 str2값을 hasp맵에 저장
			hash.put(str1, str2);
			
			count++;
		}
		
		// 무한반복
		while(true) {
			System.out.print("검색할 단어 : ");
			String search = sc.next();
			
			// 키값 기준으로 검색
			if(hash.containsKey(search)) {
				// 검색된 키값 기준으로 var값 반환
				String result = hash.get(search);
				System.out.println(">> '" + search + "' 은 영어로 '" + result +"' 입니다.");
			}
			else {
				System.out.println("종료합니다.");
				break;
			}
		}
		sc.close();
	}

}
