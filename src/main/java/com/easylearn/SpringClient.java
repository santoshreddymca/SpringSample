package com.easylearn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringClient {

	public static void main(String[] args) {

	/*	Resource res = new ClassPathResource("/com/easylearn/spring-config.xml");

		BeanFactory factory = new XmlBeanFactory(res);*/
		
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/easylearn/spring-config.xml");
		System.out.println("Application Context container is ready.......");
		
		DemoInter obj = (DemoInter) context.getBean("demoObj");

		String result = obj.wish("Rod Johnson");
		System.out.println(result);

		obj.getCurrentDateAndTime();
		
		DemoInter obj1 = (DemoInter) context.getBean("demoObj");

		String result1 = obj1.wish("Rod Johnson");
		System.out.println(result1);

		obj1.getCurrentDateAndTime();

	}

}
