package com.pwc.datacenter.bin;

import com.pwc.datacenter.repository.PersonalDetailRepository;
import com.pwc.datacenter.stores.PersonalInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DatabaseService {

      @Autowired
      PersonalDetailRepository repository;

      @Autowired
      public DatabaseService(){

      }

      public void savePersonalInformation(PersonalInformation info){

          repository.insert(info);


      }


      public Optional<PersonalInformation> getInfoPackageById(String id){

           return repository.findById(id);

      }


      public void deleteInfoPackageById(String id){

            repository.deleteById(id);

      }


}
