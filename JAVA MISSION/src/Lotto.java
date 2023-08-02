import java.util.Random;
import java.util.Scanner;
public class Lotto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 스캐너 객체 생성
        Random random = new Random(); // 랜덤함수 객체 생성
        System.out.print("몇 게임? ");
        int 입력 = sc.nextInt(); // 사용자로 부터 값 입력
        int 임시;
        int[][] 게임 = new int[입력][6]; // 원하는 게임 갯수 * 6칸의 배열 생성
        // 배열에 랜덤한 숫자 입력
        for (int i = 0; i < 입력; i++) { // 사용자가 입력한 게임 횟수
            for (int j = 0; j < 6; j++) { // 객체의 각 요소 접근
                게임[i][j] = (random.nextInt(44)) + 1; // 랜덤 변수에 0 ~ 44 랜덤의 수 생성 후 1을 더한 뒤 입력
            }
        }
        // 비교를 통한 중복 제거 및 오름차순 정렬
        for (int i = 0; i < 입력; i++) { // 사용자가 입력한 게임 횟수만큼 1차원 배열 접근
            for (int n = 0; n < 5; n++) { // 3번째 for문의 1회차 실행때마다 마지막 자리 검사열외
                for (int j = 0; j < 5 - n; j++) { // 2차원 배열에 각 인덱스에 접근. n의 횟수만큼은 비교 중지
                    if (게임[i][j] > 게임[i][j + 1]) { // 인접한 인덱스끼리 비교 후 "임시" 변수를 추가하여 값을 회전시켜 A,B의 값을 교환
                        임시 = 게임[i][j];
                        게임[i][j] = 게임[i][j + 1];
                        게임[i][j + 1] = 임시;
                    } else if (게임[i][j] == 게임[i][j + 1]) { // 만일 인접한 인덱스값이 동일하면 배열 i,j에 새로운 랜덤 숫자 입력
                        게임[i][j] = (random.nextInt(44)) + 1;
                    }
                }
            }
        }

        // 배열의 출력
        for (int i = 0; i < 입력; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(게임[i][j] + " "); // 배열의 각 요소 출력
            }
            System.out.println(); // 줄바꿈
        }
        sc.close();
    }
}