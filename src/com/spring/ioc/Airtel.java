package com.spring.ioc;

public class Airtel implements Sim{

	@Override
	public void call() {
		System.out.println("Calling with Airtel sim");
	}

	@Override
	public void data() {
		System.out.println("Browsing with Airtel sim");
		
	}

}
