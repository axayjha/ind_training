/*
	Different methods to implement singleton design pattern
	in a project
*/

class MultipleInstanceException extends Exception
{
	public String toString()
	{
		return "Error: more than one instance created";
	}
}

class Singleton1{
	static Singleton1 s1;
	static String name;
	static {
		s1 = new Singleton1();
	}
	public static Singleton1 getObject()
	{
		return s1;
	}
	private Singleton1() {
				name = "Akshay";
	}	
}

class Singleton2 {
	private static Singleton2 obj = new Singleton2();
	private Singleton2()
	{
		
	}
	public static Singleton2 getObject()
	{
		return obj;
	}
}

class Singleton3  {
	private static Singleton3 obj;
	private Singleton3() 
	{
		
	}
	public static Singleton3 getObject()
	{
		if (obj == null)
			 obj = new Singleton3();
		return obj;
	}
}

public class Singleton {
	private static int count = 1;
	String name;
	private Singleton() throws MultipleInstanceException
	{
		if (count > 1) {
			throw new MultipleInstanceException();
		}
		else {
			count++;
			name = "Akshay"; 				
		}
	}
	
	String get_name()
	{
		return name;
	}

	public static void main(String[] args) throws MultipleInstanceException{
		Singleton3 s1 = Singleton3.getObject();
		System.out.println(s1.hashCode());
		Singleton3 s2 = Singleton3.getObject();
		System.out.println(s2.hashCode());

	}

}
