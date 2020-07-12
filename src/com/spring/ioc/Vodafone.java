package com.spring.ioc;

public class Vodafone implements Sim{

	@Override
	public void call() {
		System.out.println("Calling with Vodafone sim");
		
	}

	@Override
	public void data() {
		System.out.println("Browsing with Vodafone sim");
		
	}

}
