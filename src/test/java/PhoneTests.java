import model.Phone;
import model.PhoneDetail;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import repository.PhoneRepository;
import service.PhoneService;

import java.util.List;

import static junit.framework.TestCase.assertTrue;
import static org.hibernate.validator.internal.util.Contracts.assertNotNull;
import static org.junit.Assert.assertEquals;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = Main.class)
//@WebAppConfiguration

public class PhoneTests {

    @Autowired
    //private PhoneRepository phoneRepository;
            PhoneService phoneService;

    @Test
    public void findAllPhones()  {
        List<Phone> phones = phoneService.findAll();
        assertNotNull(phones);
        assertTrue(!phones.isEmpty());

    }

    @Test
    public void findPhoneById()  {
        PhoneDetail phoneDetail = phoneService.findPhoneById(123);
        assertNotNull(phoneDetail);
        assertEquals(phoneDetail.getName(), "Motorola XOOM™ with Wi-Fi");
    }

}
