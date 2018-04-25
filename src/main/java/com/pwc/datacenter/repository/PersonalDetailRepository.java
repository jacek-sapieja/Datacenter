package com.pwc.datacenter.repository;

import com.pwc.datacenter.stores.PersonalInformation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonalDetailRepository extends MongoRepository<PersonalInformation, String> {


}
