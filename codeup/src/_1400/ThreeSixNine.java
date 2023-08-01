package _1400;

public class ThreeSixNine {
	public static void main(String[] args) {
		for (int i = 1; i < 101; i++) {
			int one = i/10;
			int ten = i%10;
			boolean one369 = (one%3)==0;
			boolean ten369 = (ten%3)==0;
			if(one369 = true) {
				System.out.println("*");
		} else {
			System.out.println(i);
		}
	}
}
}
