package testing;
public class Student {
	private int age;
	private String name;

	
	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}


	/*public Student(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

}


