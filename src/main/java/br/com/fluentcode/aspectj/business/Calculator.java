package br.com.fluentcode.aspectj.business;

public class Calculator{
	
	public void turnOn(){
		turnOnInNormalMode();
	}
	
	public void turnOn(String msg){
		System.out.println(msg);
	}
	
	private static void turnOnInNormalMode(){
		System.out.println("Turn on in normal mode.");
	}

}
