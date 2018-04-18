import controller.PhoneController;
import model.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {Main.class})
public class ControllerTests {
    @Autowired
    private PhoneController phoneController;

    @Test
    public void testExample() {
        Collection<Phone> allPhones = phoneController.getAllPhonesInfo();
        assertNotNull(allPhones);
        assertEquals(20, allPhones.size());
    }

    @Test
    public void testExample2() {
        PhoneDetail phoneDetail = phoneController.getPhoneById(123);
        assertNotNull(phoneDetail);
    }

    @Test
    public void testExample3() {
        List<String> features = new ArrayList<>();
        features.add("");

        List<String> dimensions = new ArrayList<>();
        dimensions.add("bbb");
        dimensions.add("bbb1");
        dimensions.add("bbb2");

        List<String> availability = new ArrayList<>();

        List<String> images = new ArrayList<>();
        images.add("98");
        images.add("99");
        images.add("100");


        Phone phone2 = new Phone();
        phone2.setAge(0);
        phone2.setCarrier("carrier");
        phone2.setId(331);
        phone2.setImageUrl("imageUrl");
        phone2.setName("name7");
        phone2.setSnippet("snippet");
        phone2.setPhonedetail_id(331);

        PhoneDetail phoneDetail2 = PhoneDetail.builder()
                .additionalFeatures("additionalFeatures")
                .description("description")
                .name("name7")
                .android(Android.AndroidBuilder.builder()
                        .os("0")
                        .ui("ui").build()
                )
                .battery(Battery.BatteryBuilder.builder()
                        .standbyTime("standbyTime")
                        .talkTime("talkTime")
                        .type("type")
                        .build()
                )
                .camera(Camera.CameraBuilder.builder()
                        .features(features)
                        .primary("3")
                        .build()
                )
                .connectivity(Connectivity.ConnectivityBuilder.builder()
                        .bluetooth("1")
                        .cell("cell")
                        .gps(true)
                        .infrared(true)
                        .wifi("1")
                        .build()
                )
                .display(Display.DisplayBuilder.builder()
                        .screenResolution("screenResolution")
                        .screenSize("screenSize")
                        .touchScreen(true)
                        .build())
                .hardware(Hardware.HardwareBuilder.builder()
                        .accelerometer(true)
                        .audioJack("1")
                        .cpu("cpu")
                        .fmRadio(true)
                        .physicalKeyboard(true)
                        .usb("0")
                        .build()
                )
                .sizeAndWeight(SizeAndWeight.SizeAndWeightBuilder.builder()
                        .dimensions(dimensions)
                        .weight("weight")
                        .build()
                )
                .storage(Storage.StorageBuilder.builder()
                        .flash("flash")
                        .ram("ram")
                        .build()
                )
                .availability(availability)
                .images(images)
                .build();

        PhoneForAdd phoneForAdd = new PhoneForAdd();
        phoneForAdd.phone = phone2;
        phoneForAdd.phoneDetail = phoneDetail2;

        phoneController.newPhone(phoneForAdd);
        assertNotNull(phoneForAdd);
    }
}
