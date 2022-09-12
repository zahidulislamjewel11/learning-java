package com.zahid.supersub;

public class SuperSubTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shoe s = new Shoe("Nike", 10);
		Walking w = new Walking("Adidas", 9.5, true);
		Running r = new Running("Nike", 10.5, 4.5);
		
		System.out.println(s.getBrand()+" "+s.getSize());
		System.out.println(w.getBrand()+" "+s.getSize()+" "+w.isGoreTex());
		System.out.println(r.getBrand()+" "+r.getSize()+" "+r.getWeight());
	}

}
