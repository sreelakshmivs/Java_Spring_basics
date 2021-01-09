package com.in28minutes.spring.basics.springin5steps.cdi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.inject.Named;

@Named //CDI annotation similar to @Component
public class SomeCdiBusiness {
    @Inject //CDI annotation similar to @Autowired
    SomeCdiDao someCdiDao; //The dependency

//getter and setter
    public SomeCdiDao getSomeCdiDao() {
        return someCdiDao;
    }

    public void setSomeCdiDao(SomeCdiDao someCdiDao) {
        this.someCdiDao = someCdiDao;
    }
}
