package com.javatechie.app.git_demo;

public class App {

	public void addData(String data) {
		System.out.println("Data =" + data);
		
		if(data.equalsIgnoreCase(Constant.DATA_TYPE)) {
			System.out.println("welcome");
		}
	}

	public void addedMethod(){
		System.out.println("welcome"+" Home");
		System.out.println("rama 2+3 : "+ 6);
		
	}
	
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
}
