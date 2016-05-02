package com.cn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

/**
 * Created by GZ on 2016/5/2.
 */
@SpringBootApplication
public class App extends SpringBootServletInitializer {

//    private Logger logger = LoggerFactory.getLogger(App.class);

    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(App.class);
    }

    public static void main(String[] args){
        SpringApplication.run(App.class, args);
    }
}