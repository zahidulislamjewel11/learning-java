package com.zahid.packagedemo.main;

import com.zahid.packagedemo.mypackage.*;
import com.zahid.packagedemo.mypackage.algebraic.Bool;

public class Main {

	public static void main(String[] args) {
		Arithmetic obj = new Arithmetic();
		obj.add(4.9f, 2.3f);
		obj.sub(8, 1);
		obj.mul(4, 9);
		obj.div(9, 2);
		obj.div(5, 0);
		
		Display ob = new Display();
		ob.show();
		System.out.println();
		
		Bool obj1 = new Bool();
		obj1.show();
		
	}

}
