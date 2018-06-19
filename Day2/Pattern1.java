/*
	Print the pattern:
	
	1******
	12*****
	123****
	1234***
	12345**
	123456*
	1234567

*/

public class Pattern1 {

	public static void main(String[] args) {

		int n = 7;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++)
				System.out.print(j+1);
			for (int j = i+1; j < n; j++)
				System.out.print("*");
			System.out.println();
		}

	}

}
