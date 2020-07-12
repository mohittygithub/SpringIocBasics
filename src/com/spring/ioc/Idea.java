package com.spring.ioc;

public class Idea implements Sim{

	@Override
	public void call() {
		System.out.println("Calling with Idea sim");
		
	}

	@Override
	public void data() {
		System.out.println("Browsing with Idea sim");
		
	}

}
