package com.pwc.datacenter.bin;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@Configuration
@EnableMongoRepositories(basePackages ="com.pwc.datacenter")
public class MongoConfig  extends AbstractMongoConfiguration {

    @Override
    protected String getDatabaseName() {
        return "test";
    }


    @Override
    public MongoClient mongoClient() {
        return new MongoClient("127.0.0.1", 27017);
    }
}


