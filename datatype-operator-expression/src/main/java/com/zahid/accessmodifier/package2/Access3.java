package com.zahid.accessmodifier.package2;

import com.zahid.accessmodifier.package1.Access1;

//public class Access3 {
//	
//	public static void main(String[] args) {
//		Access1 x1 = new Access1();
//		System.out.println("h: "+x1.hours);
//		System.out.println("m: "+x1.minutes);
//	}
//	
//}

public class Access3 extends Access1 {

	public static void main(String[] args) {
		Access3 x3 = new Access3();
		System.out.println("h: "+x3.hours);
		System.out.println("m: "+x3.minutes);
		System.out.println(x3.getHours());
	}

}
