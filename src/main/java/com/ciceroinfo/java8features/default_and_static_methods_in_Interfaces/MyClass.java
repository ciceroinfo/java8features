/*
We know that Java doesn’t provide "multiple inheritance in Classes" because it leads to "Diamond Problem". So how it will be handled with interfaces now, since interfaces are now similar to abstract classes. The solution is that compiler will throw exception in this scenario and we will have to provide implementation logic in the class implementing the interfaces.

Notice that both the interfaces have a common method log() with implementation logic.

As you can see that "Interface1" has static method implementation that is used in "MyClass.log()" method implementation. Java 8 uses "default" and "static" methods heavily in "Collection API" and default methods are added so that our code remains backward compatible.

If any class in the hierarchy has a method with the same signature, then default methods become irrelevant. Since any class implementing an interface already has Object as a superclass, if we have equals(), hashCode() default methods in the interface, it will become irrelevant. That’s why for better clarity, interfaces are not allowed to have Object default methods.

*/
package com.ciceroinfo.java8features.default_and_static_methods_in_Interfaces;

public class MyClass implements Interface1, Interface2 {

	@Override
	public void method2() {
	}

	@Override
	public void method1(String str) {
	}

//	@Override
//	public void log(String str) {
//		// TODO Auto-generated method stub
//		//Interface1.super.log(str);
//	}

//	@Override
//	public void log(String str) {
//		// TODO Auto-generated method stub
//		Interface2.super.log(str);
//	}

	// MyClass won't compile without having it's own log() implementation
	@Override
	public void log(String str) {
		System.out.println("MyClass logging::" + str);
		Interface1.print("abc");
		
		Interface1.super.log(str);
		
		Interface2.super.log(str);
	}

}