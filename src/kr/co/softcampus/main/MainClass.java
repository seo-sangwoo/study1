package kr.co.softcampus.main;

import kr.co.softcampus.beans.HelloWorldEn;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloWorldEn hello1 = new HelloWorldEn();
		callMethod(hello1);
		
		HelloWorldEn hello2 = new HelloWorldEn();
		callMethod(hello2);
		
		HelloWorldEn hello3 = new HelloWorldEn();
		callMethod(hello3);
	}
	
	public static void callMethod(HelloWorldEn hello) {
		hello.sayHello();
	}

}
