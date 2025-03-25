package com.itshaala;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.sql.Connection;



@Component
@PropertySource("classpath*:application.properties")
public class ConnectionUtil {

    //who will set the value for this --> Spring
    //field based dependency injection
    //@Autowired
    private Environment environment;

    //setter based dependency injection
    @Autowired
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }

    /*//constructor based dependency injection
    public ConnectionUtil(Environment environment) {
        this.environment = environment;
    }*/

    public Connection getConnection() {
        Connection con = null;
        String url = environment.getProperty("mysql.url");
        String username = environment.getProperty("mysql.username");
        String password = environment.getProperty("mysql.password");
        System.out.println(url);
        System.out.println(username);
        System.out.println(password);
        return con;
    }
}
