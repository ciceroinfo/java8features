package com.ciceroinfo.java8features.default_and_static_methods_in_Interfaces;

@FunctionalInterface
public interface Interface2 {

	void method2();

	default void log(String str) {
		System.out.println("I2 logging::" + str);
	}

}