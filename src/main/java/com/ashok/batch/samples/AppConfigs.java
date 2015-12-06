package com.ashok.batch.samples;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * Created by ashokgudise on 12/6/15.
 *
 *
 * */
@Configuration
@PropertySource("classpath:application.properties")
public class AppConfigs {

    @Autowired
    private Environment environment;

    public Environment getEnvironment() {
        return environment;
    }


}
