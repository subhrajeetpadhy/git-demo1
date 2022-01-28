package com.javatechie.app.git_demo;

public class App {

	public void addData(String data) {
		System.out.println("Data =" + data);
		
		if(data.equals(Constant.DATA_TYPE)) {
			System.out.println("welcome");
		}
	}

	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
}
