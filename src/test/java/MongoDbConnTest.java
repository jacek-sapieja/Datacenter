import com.pwc.datacenter.bin.ApplicationConfig;
import com.pwc.datacenter.bin.DatabaseService;
import com.pwc.datacenter.stores.PersonalInformation;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {ApplicationConfig.class})
public class MongoDbConnTest {

     @Autowired
     DatabaseService dbService;

     @Test
     public void TestDB(){

         dbService.deleteInfoPackageById("1000");

         PersonalInformation info = new PersonalInformation();
         info.setId("1000");
         info.setSfEntityId("2000");
         info.setSfEntityType("test_type");
         dbService.savePersonalInformation(info);

         Optional<PersonalInformation> personal = dbService.getInfoPackageById("1000");
         Assert.assertEquals("2000",personal.get().getSfEntityId());

     }

}
