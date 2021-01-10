package com.synchrinization;

public class Counter {

	public int count=0;
	
	 public void increment() throws InterruptedException{
		Thread.sleep(1000);
		count++;
	}
	
	 public void decrement(){
		count--;
	}
	
	
}
