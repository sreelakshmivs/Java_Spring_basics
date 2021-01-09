package com.in28minutes.spring.basics.springin5steps.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//import javax.annotation.PostConstruct;
//import javax.annotation.PreDestroy;

@Component //Tells spring that this class is a bean(an instance)
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) //To get different instances for single bean, by default it is singleton.
public class BinarySearchimpl {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired //Tells spring that SortAlgorithm is a dependency of BinarySearch
    @Qualifier("bubble")
    private SortAlgorithm sortAlgorithm;

    //public void setSortAlgorithm(SortAlgorithm sortAlgorithm) { //Setter Injection (We can use setters, constructors or nothing will also work)
    //    this.sortAlgorithm = sortAlgorithm;
    //}

    //public BinarySearchimpl(SortAlgorithm sortAlgorithm) { //Constructor (used by spring for constructor injection)
    //    this.sortAlgorithm = sortAlgorithm;
    //}


    public int binarySearch(int[] numbers, int numberToSearchFor){
        //BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
        int[] sortedNumbers = sortAlgorithm.sort(numbers);
        System.out.println(sortAlgorithm);
        //Searching an array

        return 3;
    }
    //@PostConstruct
    //public void postConstruct(){ //As soon as the binarysearchimpl bean is created, this method is called
    //    logger.info("postConstruct");
    //}
    //@PreDestroy
    //public void preDestroy(){ //Just before the binarysearchimpl is destroyed, this is called
    //    logger.info("predestroy");

    //}
}
