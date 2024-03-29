package com.model;

public class Person {
	private String name;
	private int age;
	
	public Person(){
		System.out.println("Empty constructor");
	}
	
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public static void sampleMethod() {
		System.out.println("This is a factory method.");
	}
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
	
}
