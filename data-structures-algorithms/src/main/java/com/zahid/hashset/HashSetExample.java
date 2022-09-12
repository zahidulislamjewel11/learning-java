package com.zahid.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> h = new HashSet<String>();
		
		h.add("Jewel");
		h.add("Zahid");
		h.add("Moon");
		
		System.out.println(h.size());
		System.out.println(h);
		
		h.remove("Moon");
		System.out.println(h);
		
		h.clear();
		System.out.println(h);
		
		System.out.println(h.contains("Zahid"));
		System.out.println(h.isEmpty());
		
		HashSet<Integer> k = new HashSet<Integer>();
		k.add(4);
		k.add(9);
		k.add(2);
		k.add(3);
		k.add(5);
		
		System.out.println(k.size());
		System.out.println(k);
		k.add(6);
		System.out.println(k);
		System.out.println(k.toArray());
		Object[] L = k.toArray();
		
		for(int i=0;i<L.length;i++)
		{
			System.out.print(L[i]+" ");
		}
		System.out.println();
		k.add(0);
		System.out.println(k.hashCode());
		
		Iterator<Integer> it = k.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+", ");
		}
		k.add(4);
		System.out.println();
		System.out.println(k);
	}

}
