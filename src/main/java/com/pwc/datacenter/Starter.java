package com.pwc.datacenter;

import org.springframework.boot.SpringApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


@EnableScheduling
public class Starter {

    public static void main(String [] args)
    {
        SpringApplication.run(Starter.class, args);
    }
}
