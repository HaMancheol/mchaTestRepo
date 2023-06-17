package com.example.myproject2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class MyProject2Application {

    public static void main(String[] args) {
        SpringApplication.run(MyProject2Application.class, args);
    }

}
