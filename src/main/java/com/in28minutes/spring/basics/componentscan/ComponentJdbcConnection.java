package com.in28minutes.spring.basics.componentscan;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
//One of the dependency(JBBC) of class PersonDAO is a prototype and if the personDAO is singleton.
//Then to get the desired results we use proxy.
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ComponentJdbcConnection {

    public ComponentJdbcConnection() {
        System.out.println("Jdbc Connection"); //Constructor
    }
}
