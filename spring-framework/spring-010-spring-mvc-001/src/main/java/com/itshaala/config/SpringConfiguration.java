package com.itshaala.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = {"com.itshaala"})
public class SpringConfiguration {
    @Bean
    public ViewResolver ivr() {
        InternalResourceViewResolver ivr = new InternalResourceViewResolver();
        ivr.setPrefix("/WEB-INF/views/");
        ivr.setSuffix(".jsp");
        return ivr;
    }
}
