package day6;

import java.util.ArrayDeque;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<String> names =new ArrayDeque<String>();
		names.add("vanshika");
		names.add("Mehak");
		names.add("Sagar");
		names.add("Bhavya");
		System.out.println(names); 

		//names.add(null);//not allowed
		names.addFirst("Ana");
		System.out.println("adding first element - "+names);
		names.addLast("Zina");
		System.out.println("adding element to end - " +names); 
		names.removeFirst();
		System.out.println("After first element removal = "+names); 
		names.removeLast();
		System.out.println("After last element removal = "+names);
	}

}
