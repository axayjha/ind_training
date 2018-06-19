public class JohnyWalker {
	public static void main(String[] args)
	{
		for (int i = 1; i <= 100; i++)	{			
			if ((i % 3 == 0) && (i % 5 == 0))
				System.out.println("Johny Walker");

			else if (i % 3 == 0)
				System.out.println("Johny");

			else if (i % 5 == 0)
				System.out.println("Walker");	

			else
				System.out.println(i);
		}		
	}
}
