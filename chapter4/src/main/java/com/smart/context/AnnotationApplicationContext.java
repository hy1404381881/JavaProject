package com.smart.context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.smart.Car;

public class AnnotationApplicationContext {

	 public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Beans.class);
		System.out.println("kaishidiaoyong");
		Car car =ctx.getBean("car",Car.class);
		int i=0;
		System.out.println("jieshudiaoyong");
	}
}
