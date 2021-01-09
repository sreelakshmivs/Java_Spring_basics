package com.in28minutes.spring.basics.springin5steps;

import com.in28minutes.spring.basics.springin5steps.basic.BinarySearchimpl;
import com.in28minutes.spring.basics.springin5steps.scope.PersonDAO;
import com.in28minutes.spring.basics.springin5steps.xml.XmlPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;

//@Configuration
//@ComponentScan("com.in28minutes.spring.basics.springin5steps")
//@SpringBootApplication //Will make the spring boot to scan the package and sub packages for beans
public class SpringIn5StepsXMLContextApplication {
	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsXMLContextApplication.class);
	public static void main(String[] args) {
		//BinarySearchimpl binarySearch = new BinarySearchimpl(new QuickSortAlgorithm());
		//Spring Application Context maintains all the beans
		//System.out.println(result);
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		LOGGER.info("Beans loaded are -> {}",
				(Object)applicationContext.getBeanDefinitionNames()); //get the names of beans that are in this application context
																		//Also type cast into an object

		XmlPersonDAO personDao = applicationContext.getBean(XmlPersonDAO.class);
		LOGGER.info("{} {}", personDao, personDao.getXmlJdbcConnection());

	}

}
