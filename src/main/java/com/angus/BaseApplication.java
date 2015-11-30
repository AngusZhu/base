package com.angus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by Angus on Nov 8,2015.
 */
@SpringBootApplication
@PropertySource(value = {"classpath:/application.properties", "classpath:/datasource.properties"})
public class BaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(BaseApplication.class, args);
    }

}
