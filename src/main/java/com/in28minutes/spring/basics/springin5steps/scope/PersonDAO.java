package com.in28minutes.spring.basics.springin5steps.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PersonDAO {
    @Autowired
    JdbcConnection jdbcConnection;

    public JdbcConnection getJdbcConnection() { //GEtter
        return jdbcConnection;
    }

    public void setJdbcConnection(JdbcConnection jdbcConnection) { //Setter
        this.jdbcConnection = jdbcConnection;
    }
}
