package com.spring.ioc;

public class Jio implements Sim{

	@Override
	public void call() {
		System.out.println("Calling with Jio sim");
		
	}

	@Override
	public void data() {
		System.out.println("Browsing with Jio sim");
		
	}

}
