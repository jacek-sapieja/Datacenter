package com.pwc.datacenter.bin;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@Configuration
@ComponentScan("com.pwc.datacenter")
@EnableJpaRepositories("com.pwc.datacenter.repository")
public class ApplicationConfig  {


}



