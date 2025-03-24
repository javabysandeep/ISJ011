package com.itshaala;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.itshaala"})
public class SpringConfiguration {

    @Bean("productReference")
    public Product getProduct() {
        Product product = new Product();
        product.setId(101);
        product.setName("Speaker");
        product.setPrice(40000);
        return product;
    }

}
