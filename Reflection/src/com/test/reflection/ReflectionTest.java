package com.test.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class ReflectionTest  {
 
	public static void main(String[] args) throws ClassNotFoundException {	
	//Fully Qualified class name used
	String personClassName= "com.model.Person";
	
	//To get class reference
	//forName() throws ClassNotFoundException
	Class<?> personClass= Class.forName(personClassName);
	System.out.println("Person Class = "+personClass);
	
	//To get public fields including those inherited, use getFields() method
	//Object class doesn't have any public fields
	Field[] fields= personClass.getFields();
	System.out.println(Arrays.toString(fields));
	
	//To get all fields declared in class, use geDecalredFields() method
	Field[] declaredFields= personClass.getDeclaredFields();
	System.out.println(Arrays.toString(declaredFields));
	
	//To get public methods including those inherited, use getMethods() method
	Method[] methods= personClass.getMethods();
	for(Method method: methods) {
		System.out.println(method);
	}
	
	//To get all methods declared in class, use getDeclaredMethods()
	Method[] declaredMethods= personClass.getDeclaredMethods();
	for(Method method: declaredMethods) {
		System.out.println(method);
	}
	
	/* To get all static declared methods, can use getModifier() method to get all modifiers 
	and then Modifier class factory methods to filter out some particular modifier
	*/
	Arrays.stream(declaredMethods)
		.filter(m -> Modifier.isStatic(m.getModifiers()))
		.forEach(System.out::println);
	
	//To get all constructors declared in class - getDeclaredConstructors()
	Constructor<?>[] declaredConstructors= personClass.getDeclaredConstructors();
	System.out.println(Arrays.deepToString(declaredConstructors));
	
	//To get public constructors(not superclass ones) - getConstructors()
	Constructor<?>[] constructors= personClass.getConstructors();
	System.out.println(Arrays.deepToString(constructors));
}
}