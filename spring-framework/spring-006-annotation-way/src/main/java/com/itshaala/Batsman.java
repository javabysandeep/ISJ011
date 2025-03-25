package com.itshaala;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Component
@PropertySource("classpath*:application.properties")
public class Batsman {

    //@Value("101")
    @Value("${batsman.id}")
    private int id;

    //@Value("Sachin")
    @Value("${batsman.name}")
    private String name;

    //@Value("52")
    @Value("${batsman.age}")
    private int age;
}
