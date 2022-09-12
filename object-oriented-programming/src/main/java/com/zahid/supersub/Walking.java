package com.zahid.supersub;

public class Walking extends Shoe {
	private boolean goreTex;

	public Walking(String brand, double size, boolean goreTex) {
		super(brand, size);
		this.goreTex = goreTex;
	}

	public boolean isGoreTex() {
		return goreTex;
	}

	public void setGoreTex(boolean goreTex) {
		this.goreTex = goreTex;
	}
	
}
