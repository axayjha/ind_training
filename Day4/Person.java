/*Code to demonstrate Object class methods */

public class Person {
	private String fname;
	private String lname;
	private int age;
	
	Person(String f, String l, int a)
	{
		this.fname = f;
		this.lname = l;
		this.age = a;
	}
	
	@Override
	public String toString() {
		return "Person {"+
				"fname= " + this.fname +  ", " +
				"lname= " + this.lname +  ", " +
				"age = " + this.age + " }";
	}
	
	public boolean equals(Object ob)
	{
		Person temp = (Person)ob;
		if (this.fname.equals(temp.fname)) 
			return true;
		return false;
					
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("Jon", "Snow", 20);
		System.out.println(p1.toString());
		System.out.println(p1.hashCode());
		Person p2 = new Person("Jon", "Stark", 45);
		System.out.println(p2.toString());
		
		System.out.println(p1.equals(p2));
		Person p3 = p1;
		System.out.println(p1.equals(p3));

	}

}
