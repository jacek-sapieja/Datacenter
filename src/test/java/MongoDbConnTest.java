import com.pwc.datacenter.bin.ApplicationConfig;
import com.pwc.datacenter.bin.DatabaseService;
import com.pwc.datacenter.stores.PersonalInformation;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {ApplicationConfig.class})
public class MongoDbConnTest {

     @Autowired
     DatabaseService service;

     @Test
     public void TestDB(){
         PersonalInformation info = new PersonalInformation();
         info.setId("1");
         info.setSfEntityId("2");
         service.savePersonalInformation(info);
     }


}
