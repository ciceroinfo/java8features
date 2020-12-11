/*
Functional Interfaces and Lambda Expressions
If you notice above interfaces code, you will notice @FunctionalInterface "annotation". Functional interfaces are new concept introduced in Java 8. An interface with exactly one abstract method becomes Functional Interface. We don’t need to use @FunctionalInterface annotation to mark an interface as Functional Interface. @FunctionalInterface annotation is a facility to avoid accidental addition of abstract methods in the functional interfaces. You can think of it like @Override annotation and it’s best practice to use it. "java.lang.Runnable" with single abstract method run() is a great example of functional interface.

One of the major benefits of functional interface is the possibility to use "lambda expressions" to instantiate them. We can instantiate an interface with anonymous class but the code looks bulky.
*/
package com.ciceroinfo.java8features.Functional_Interfaces_and_Lambda_Expressions;

import com.ciceroinfo.java8features.default_and_static_methods_in_Interfaces.Interface1;

public class Main {

	public static void main(String[] args) {

		Runnable r = new Runnable() {
			@Override
			public void run() {
				System.out.println("My Runnable");
			}
		};
		
		r.run();
		
		//Since functional interfaces have only one method, lambda expressions can easily provide the method implementation. We just need to provide method arguments and business logic. For example, we can write above implementation using lambda expression as:
		Runnable r1 = () -> {
			System.out.println("My Runnable by Lambda");
		};
		
		r1.run();
		
		
		// If you have single statement in method implementation, we don’t need curly braces also. For example above Interface1 anonymous class can be instantiated using lambda as follows:
		Interface1 i1 = (s) -> System.out.println(s);
		i1.method1("abc");

	}

}
