package com.zahid.thread;

class ABC extends Thread
{
	public void run()
	{
		for(int i=0;i<100;i++)
		{
			System.out.println("First Function - Turn "+i);
		}
	}
}