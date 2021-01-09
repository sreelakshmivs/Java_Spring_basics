package com.in28minutes.spring.basics.springin5steps;

import com.in28minutes.spring.basics.springin5steps.basic.BinarySearchimpl;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.in28minutes.spring.basics.springin5steps")
//@SpringBootApplication //Will make the spring boot to scan the package and sub packages for beans
public class SpringIn5StepsBasicApplication {

	public static void main(String[] args) {
		//BinarySearchimpl binarySearch = new BinarySearchimpl(new QuickSortAlgorithm());
		//Spring Application Context maintains all the beans
		//System.out.println(result);
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringIn5StepsBasicApplication.class);
		//ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsBasicApplication.class, args);
		BinarySearchimpl binarySearch = applicationContext.getBean(BinarySearchimpl.class);
		int result = binarySearch.binarySearch(new int[]{12, 4, 6}, 3);
		System.out.println(result);

	}

}
