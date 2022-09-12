package com.zahid.encapsulation1;

public class StudentTest {

	public static void main(String[] args) {
		Student s = new Student("Jewel", 28);
		System.out.println(s.getName()+" "+s.getAge());
		s.setName("Zahid");
		s.setAge(27);
		System.out.println(s.getName()+" "+s.getAge());
	}
}
