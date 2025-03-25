package com.itshaala;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = {"com.itshaala"})
public class SpringConfiguration {

    @Bean(name = "batsman")
    @Scope("prototype")
    public Batsman getBatsman() {
        Batsman batsman = new Batsman();
        batsman.setId(101);
        batsman.setName("Ruturaj");
        batsman.setAge(22);
        return batsman;
    }
}
