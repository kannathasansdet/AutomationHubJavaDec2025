package com.automationhub.java.constructor;

public class WhyConstructor {

	int rollNum; 
	String StudentName;
	boolean status;

	 WhyConstructor(){

		 System.out.println("This is no org constructor");
	}
	WhyConstructor(int rollNum, String StudentName,boolean status){

		System.out.println("This is params constructor");

		this.rollNum = rollNum;
		this.StudentName = StudentName;
		this.status = status;
	}

	public static void main(String[] args) {

		WhyConstructor WhyConstructor = new WhyConstructor();
		WhyConstructor WhyConstructor1 = new WhyConstructor(1,"kanna",false);
		System.out.println(WhyConstructor.rollNum);
		System.out.println(WhyConstructor.StudentName);
		System.out.println(WhyConstructor.status);
		System.out.println(WhyConstructor1.rollNum);
		System.out.println(WhyConstructor1.StudentName);
		System.out.println(WhyConstructor1.status);

	}

}
