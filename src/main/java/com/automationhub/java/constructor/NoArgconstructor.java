package com.automationhub.java.constructor;

public class NoArgconstructor {

	String title;
	String author;

	// No-arg constructor
	public NoArgconstructor(String title,String author) {
		this.title = title;
		this.author = author;
	}

	public static void main(String[] args) {

		NoArgconstructor noconstructor = new NoArgconstructor("Kannathasan","hello"); // No-arg constructor called
		System.out.println(noconstructor.title);
		System.out.println(noconstructor.author); // "Untitled"
	}
}