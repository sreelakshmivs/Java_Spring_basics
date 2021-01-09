package com.in28minutes.spring.basics.springin5steps.basic;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary //@Primary is the best way among qualifier and autowiring by name
//@Qualifier("quick")
public class QuickSortAlgorithm implements SortAlgorithm{
    public int[] sort(int[] numbers){
        //Logic for quick sort
        return numbers;
    }
}
