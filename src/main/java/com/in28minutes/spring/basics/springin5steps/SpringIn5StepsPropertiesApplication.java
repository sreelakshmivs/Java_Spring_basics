package com.in28minutes.spring.basics.springin5steps;

import com.in28minutes.spring.basics.springin5steps.basic.BinarySearchimpl;
import com.in28minutes.spring.basics.springin5steps.properties.SomeExternalService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;

@Configuration
@ComponentScan("com.in28minutes.spring.basics.springin5steps")
//Load app.properties
@PropertySource("classpath:app.properties")
//@SpringBootApplication //Will make the spring boot to scan the package and sub packages for beans
public class SpringIn5StepsPropertiesApplication {

	public static void main(String[] args) {
		//Spring Application Context maintains all the beans
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringIn5StepsPropertiesApplication.class);
		SomeExternalService service = applicationContext.getBean(SomeExternalService.class);
		System.out.println(service.returnServiceUrl());

	}

}
