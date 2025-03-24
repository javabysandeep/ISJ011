package com.itshaala;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
@Component
@PropertySource("classpath*:application.properties")
public class Product {
    //@Value("101")
    @Value("${product.id}")
    private int id;

    // @Value("laptop")
    @Value("${product.name}")
    private String name;

    //@Value("130000")
    @Value("${product.price}")
    private int price;
}