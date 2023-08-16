import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Testing {

	static List asd(List lottoList) {
		for (int j = 0; j < 6; j++) {
			lottoList.add(1);
		}
		List<Integer>temp = lottoList.stream().map(n->(int)(Math.random()*45+1)).sorted().distinct().toList();
		if(temp.size()<6) {
			temp.clear();
			return asd(temp);
		}else return temp;
	}

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < N; i++) {

			List<Integer> lottoList = new ArrayList<>(6);
			for (Integer integer : asd(lottoList)) {
				System.out.print(integer + " ");
			}

		}
	}

}