package com.smart.test;

import java.io.IOException;

import org.codehaus.groovy.tools.groovydoc.Main;
import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import com.smart.Car;

public class BeanFactoryTest { 
	@Test
    public void getBean() throws Throwable{
    	DefaultListableBeanFactory factory = ht();
    	System.out.println("Init BeanFactory.");
    	getCar(factory);
    	
        
    }

	private void getCar(DefaultListableBeanFactory factory) {
		Car car=factory.getBean("car",Car.class);
    	System.out.println("car bean is ready for use");
    	car.introduce();
    	car.setColor("heise");
    	Car car2=factory.getBean("car",Car.class);
    	car2.introduce();
    	if(car.equals(car2)){
    		System.out.println("true");
    	}
	}

	private DefaultListableBeanFactory ht() throws IOException {
		ResourcePatternResolver resolver= new PathMatchingResourcePatternResolver();
    	Resource res=resolver.getResource("classpath:com/smart/beanfactory/beans.xml");
    	System.out.println(res.getURL());
    	DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
    	XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
    	reader.loadBeanDefinitions(res);
		return factory;
	}
	
}
