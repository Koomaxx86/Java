package Ex03;

public class _03 {
	public static void main(String[] args) {
		
		for (int i = 1; i <= 100; i++) {
			int one = i % 10;
			int ten = i / 10;
			boolean one369 = (one % 3 == 0 && one != 0);
			boolean ten369 = (ten % 3 == 0 && ten != 0);
			
			if (one369 && ten369 )
				System.out.println("**");
			else 
				if (one369 || ten369)
				System.out.println("*");
			 else 
				System.out.println(i);
		}
	}
}

