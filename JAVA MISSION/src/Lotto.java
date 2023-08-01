


public class Lotto {
	public static void main(String[] args) {
		// Math.random() : 0.xxxxx ~ 0.9xxxxx 사이의 임의 수를 반환

		// 1~45 사이의 랜덤한 정수
		// Math.rando()
		// Math.rando() * 10			  : 0.xxx ~ 9.xxx
		// Math.rando() * 10 + 1		  : 1.xxx ~ 10.xxx
		// (int) (Math.random() * 10 + 1) : 1 ~ 10

		// Math.rando() * 45 :  		  : 0.0xxx ~ 44.xxxx
		// Math.rando() * 45 + 1 : 		  : 1.0xxx ~ 45.xxxx
		// (int) (Math.random() * 45 + 1) : 1 ~ 45

		// (공식)
		// (int) (Math.random() * 10 + 1) : 1 ~ 10
		// (int) (Math.random() * 45 + 1) : 1 ~ 45

		// (int) (Math.random() * [개수] + [시작숫자])

		int game[] = new int[6];
		for (int i = 0; i < 6; i++) {
			int rand = (int) (Math.random() * 45 + 1);
			game[i] = rand;
		}

		for (int i = 0; i < game.length; i++) {
			if(game[i] > game[i+1]) {
				int a = game[i];
				game[i] = game[i+1];
				game[i+1] = game[i];
				System.out.print(game[i]+" ");
			}
			System.out.println();
		}
	}
}

