package com.zahid.runnable;

class ABC implements Runnable
{
	public void run()
	{
		for(int i=0;i<100;i++)
		{
			System.out.println("Thread A"+i);
		}
	}
}