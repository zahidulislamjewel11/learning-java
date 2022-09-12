package com.zahid.accessormutator;

class Account
{
	String name;
	int age;
	
	public void setName(String name)
	{
		this.name = name;
	}
		
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public int getAge()
	{
		return this.age;
	}
	
	
	public void sayHello(String name)
	{
		System.out.println("Hello "+name);
	}
	public void printDetails()
	{
//		System.out.println(name+", "+age);
//		System.out.println(this.name+", "+this.age);
		System.out.println(getName()+", "+getAge());
	}
}


public class GetterSetterTest {

	public static void main(String[] args) {
		
//		Account s = new Account();
//		s.sayHello("Jewel");
//		s.name = "Zahid";
//		s.age = 29;
//		System.out.println(s.name);
//		System.out.println(s.age);
//		s.printDetails();
		
		Account person = new Account();
		person.setName("Zahidul Islam");
		person.setAge(28);
		person.printDetails();
		System.out.println(person.getName()+", "+person.getAge());
	}
}
