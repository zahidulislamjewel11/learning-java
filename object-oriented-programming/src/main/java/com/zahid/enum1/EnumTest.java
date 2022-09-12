package com.zahid.enum1;

enum Level {
	LOW, MEDIUM, HIGH;
}

public class EnumTest {
	enum Flavor {
		CHOCOLATE, VANILLA, STRAWBERRY;
	}
	
//	static String[] levels = {"Low", "Medium", "High"};
	
	public static void main(String[] args) {
//		System.out.println(levels[0]);
//		System.out.println(levels[1]);
//		System.out.println(levels[2]);
		
		Level l = Level.LOW;
		System.out.println(l);
		
		System.out.println(Level.HIGH);
		
		switch(l)
		{
		case LOW:
			System.out.println("Low level");
			break;
		case MEDIUM:
			System.out.println("Medium level");
			break;
		case HIGH:
			System.out.println("High level");
			break;
		default:
			System.out.println("Not in enum");
		}
		System.out.println();
		
		Flavor flav = Flavor.VANILLA;
		if(flav == Flavor.VANILLA )
		{
			System.out.println("it's vanilla");
		}
		else if(flav == Flavor.CHOCOLATE )
		{
			System.out.println("it's chocolate");
		}
		else if(flav == Flavor.STRAWBERRY )
		{
			System.out.println("it's strawberry");
		}
	}
}
