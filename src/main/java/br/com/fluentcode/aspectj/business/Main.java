package br.com.fluentcode.aspectj.business;


public class Main {
	
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		calculator.turnOn();
		calculator.turnOn("Turn on in economic mode.");
	}
	
}
