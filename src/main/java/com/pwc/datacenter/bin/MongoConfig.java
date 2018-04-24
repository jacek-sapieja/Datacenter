package com.pwc.datacenter.bin;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;


@Configuration
public class MongoConfig  {

    @Bean
    public Mongo mongo() throws Exception {
        return new MongoClient("localhost");
    }

    @Bean
    public MongoTemplate mongoTemplate() throws Exception {
        return new MongoTemplate(mongo(), "Datacenter");
    }



}


