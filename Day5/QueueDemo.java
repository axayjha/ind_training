import java.util.*;
public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue <String> pr = new PriorityQueue<>();
		pr.add("Hello");
		pr.add("World");
		pr.add("This is priority queue");
		
		pr.forEach(System.out::println);
		
		PriorityQueue <String> pr1 = new PriorityQueue<>();
		pr1.add("3Hello");
		pr1.add("2World");
		pr1.add("1This is priority queue");
		
		pr1.forEach(System.out::println);
		
		
	}

}
