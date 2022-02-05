package com.tuling.iocbeanlifecicle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by smlz on 2019/8/15.
 */
public class MainStarter {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);

		Person person = (Person) context.getBean("person");


		//car实现了FactoryBean通过"&car" 可以拿到原始的bean
		//Car car = (Car)context.getBean("&car");

		System.out.println("person:"+person);
	}
}
