package com.zahid.runnable;

class DEF implements Runnable
{
	public void run()
	{
		for(int i=0;i<100;i++)
		{
			System.out.println("Thread B"+i);
		}
	}
}