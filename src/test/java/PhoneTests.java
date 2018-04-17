
import model.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import service.PhoneService;
import java.util.ArrayList;
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

    @Test
    public void addPhoneWithFlashFeature()  {
        List<String> _features = new ArrayList<>();
        _features.add("Flash");
        List<String> _dimensions =new ArrayList<>();
        _dimensions.add("bbb");
        _dimensions.add("bbb1");
        _dimensions.add("bbb2");

        List<String> _availability =new ArrayList<>();
        _availability.add("0000");
        List<String> _images =new ArrayList<>();
        _images.add("80");
        _images.add("81");
        _images.add("82");


        Phone phone2 = new Phone();
        phone2.setAge(0);
        phone2.setCarrier("carrier");
        phone2.setId(325);
        phone2.setImageUrl("imageUrl");
        phone2.setName("name");
        phone2.setSnippet("snippet");
        phone2.setPhonedetail_id(325);

        PhoneDetail phoneDetail2 = PhoneDetail.builder()
                .additionalFeatures("additionalFeatures")
                .description("description")
                .name("name")
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
                        .features(_features)
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
                        .dimensions(_dimensions)
                        .weight("weight")
                        .build()
                )
                .storage(Storage.StorageBuilder.builder()
                        .flash("flash")
                        .ram("ram")
                        .build()
                )
                .availability(_availability)
                .images(_images)
                .build();

        PhoneForAdd phoneForAdd = new PhoneForAdd();
        phoneForAdd.phone = phone2;
        phoneForAdd.phoneDetail = phoneDetail2;

        phoneService.newPhoneWithAdd(phoneForAdd);
        assertNotNull(phoneForAdd);
        //assertTrue(!phones.isEmpty());
    }

    @Test
    public void addPhoneWithVideoFeature()  {
        List<String> _features = new ArrayList<>();
        _features.add("Video");
        List<String> _dimensions =new ArrayList<>();
        _dimensions.add("bbb");
        _dimensions.add("bbb1");
        _dimensions.add("bbb2");

        List<String> _availability =new ArrayList<>();
        _availability.add("0000");
        List<String> _images =new ArrayList<>();
        _images.add("83");
        _images.add("84");
        _images.add("85");


        Phone phone2 = new Phone();
        phone2.setAge(0);
        phone2.setCarrier("carrier");
        phone2.setId(326);
        phone2.setImageUrl("imageUrl");
        phone2.setName("name2");
        phone2.setSnippet("snippet");
        phone2.setPhonedetail_id(326);

        PhoneDetail phoneDetail2 = PhoneDetail.builder()
                .additionalFeatures("additionalFeatures")
                .description("description")
                .name("name2")
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
                        .features(_features)
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
                        .dimensions(_dimensions)
                        .weight("weight")
                        .build()
                )
                .storage(Storage.StorageBuilder.builder()
                        .flash("flash")
                        .ram("ram")
                        .build()
                )
                .availability(_availability)
                .images(_images)
                .build();

        PhoneForAdd phoneForAdd = new PhoneForAdd();
        phoneForAdd.phone = phone2;
        phoneForAdd.phoneDetail = phoneDetail2;

        phoneService.newPhoneWithAdd(phoneForAdd);
        assertNotNull(phoneForAdd);
        //assertTrue(!phones.isEmpty());
    }

    @Test
    public void addPhoneWithFullFeatures()  {
        List<String> _features = new ArrayList<>();
        _features.add("Flash");
        _features.add("Video");

        List<String> _dimensions =new ArrayList<>();
        _dimensions.add("bbb");
        _dimensions.add("bbb1");
        _dimensions.add("bbb2");

        List<String> _availability =new ArrayList<>();
        _availability.add("0000");
        List<String> _images =new ArrayList<>();
        _images.add("86");
        _images.add("87");
        _images.add("88");


        Phone phone2 = new Phone();
        phone2.setAge(0);
        phone2.setCarrier("carrier");
        phone2.setId(327);
        phone2.setImageUrl("imageUrl");
        phone2.setName("name3");
        phone2.setSnippet("snippet");
        phone2.setPhonedetail_id(327);

        PhoneDetail phoneDetail2 = PhoneDetail.builder()
                .additionalFeatures("additionalFeatures")
                .description("description")
                .name("name3")
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
                        .features(_features)
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
                        .dimensions(_dimensions)
                        .weight("weight")
                        .build()
                )
                .storage(Storage.StorageBuilder.builder()
                        .flash("flash")
                        .ram("ram")
                        .build()
                )
                .availability(_availability)
                .images(_images)
                .build();

        PhoneForAdd phoneForAdd = new PhoneForAdd();
        phoneForAdd.phone = phone2;
        phoneForAdd.phoneDetail = phoneDetail2;

        phoneService.newPhoneWithAdd(phoneForAdd);
        assertNotNull(phoneForAdd);
        //assertTrue(!phones.isEmpty());
    }

    @Test
    public void addPhoneWithNoFeatures()  {
        List<String> _features = new ArrayList<>();
        _features.add("");

        List<String> _dimensions =new ArrayList<>();
        _dimensions.add("bbb");
        _dimensions.add("bbb1");
        _dimensions.add("bbb2");

        List<String> _availability =new ArrayList<>();
        _availability.add("0000");
        List<String> _images =new ArrayList<>();
        _images.add("89");
        _images.add("90");
        _images.add("91");


        Phone phone2 = new Phone();
        phone2.setAge(0);
        phone2.setCarrier("carrier");
        phone2.setId(328);
        phone2.setImageUrl("imageUrl");
        phone2.setName("name4");
        phone2.setSnippet("snippet");
        phone2.setPhonedetail_id(328);

        PhoneDetail phoneDetail2 = PhoneDetail.builder()
                .additionalFeatures("additionalFeatures")
                .description("description")
                .name("name4")
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
                        .features(_features)
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
                        .dimensions(_dimensions)
                        .weight("weight")
                        .build()
                )
                .storage(Storage.StorageBuilder.builder()
                        .flash("flash")
                        .ram("ram")
                        .build()
                )
                .availability(_availability)
                .images(_images)
                .build();

        PhoneForAdd phoneForAdd = new PhoneForAdd();
        phoneForAdd.phone = phone2;
        phoneForAdd.phoneDetail = phoneDetail2;

        phoneService.newPhoneWithAdd(phoneForAdd);
        assertNotNull(phoneForAdd);
        //assertTrue(!phones.isEmpty());
    }

    @Test
    public void addPhoneWithTwoAvailabilities()  {
        List<String> _features = new ArrayList<>();
        _features.add("");

        List<String> _dimensions =new ArrayList<>();
        _dimensions.add("bbb");
        _dimensions.add("bbb1");
        _dimensions.add("bbb2");

        List<String> _availability =new ArrayList<>();
        _availability.add("0000");
        _availability.add("1111");

        List<String> _images =new ArrayList<>();
        _images.add("92");
        _images.add("93");
        _images.add("94");


        Phone phone2 = new Phone();
        phone2.setAge(0);
        phone2.setCarrier("carrier");
        phone2.setId(329);
        phone2.setImageUrl("imageUrl");
        phone2.setName("name5");
        phone2.setSnippet("snippet");
        phone2.setPhonedetail_id(329);

        PhoneDetail phoneDetail2 = PhoneDetail.builder()
                .additionalFeatures("additionalFeatures")
                .description("description")
                .name("name5")
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
                        .features(_features)
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
                        .dimensions(_dimensions)
                        .weight("weight")
                        .build()
                )
                .storage(Storage.StorageBuilder.builder()
                        .flash("flash")
                        .ram("ram")
                        .build()
                )
                .availability(_availability)
                .images(_images)
                .build();

        PhoneForAdd phoneForAdd = new PhoneForAdd();
        phoneForAdd.phone = phone2;
        phoneForAdd.phoneDetail = phoneDetail2;

        phoneService.newPhoneWithAdd(phoneForAdd);
        assertNotNull(phoneForAdd);
        //assertTrue(!phones.isEmpty());
    }

    @Test
    public void addPhoneWithNoAvailabilities()  {
        List<String> _features = new ArrayList<>();
        _features.add("");

        List<String> _dimensions =new ArrayList<>();
        _dimensions.add("bbb");
        _dimensions.add("bbb1");
        _dimensions.add("bbb2");

        List<String> _availability =new ArrayList<>();
        //_availability.add("0000");
        //_availability.add("1111");

        List<String> _images =new ArrayList<>();
        _images.add("95");
        _images.add("96");
        _images.add("97");


        Phone phone2 = new Phone();
        phone2.setAge(0);
        phone2.setCarrier("carrier");
        phone2.setId(330);
        phone2.setImageUrl("imageUrl");
        phone2.setName("name6");
        phone2.setSnippet("snippet");
        phone2.setPhonedetail_id(330);

        PhoneDetail phoneDetail2 = PhoneDetail.builder()
                .additionalFeatures("additionalFeatures")
                .description("description")
                .name("name6")
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
                        .features(_features)
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
                        .dimensions(_dimensions)
                        .weight("weight")
                        .build()
                )
                .storage(Storage.StorageBuilder.builder()
                        .flash("flash")
                        .ram("ram")
                        .build()
                )
                .availability(_availability)
                .images(_images)
                .build();

        PhoneForAdd phoneForAdd = new PhoneForAdd();
        phoneForAdd.phone = phone2;
        phoneForAdd.phoneDetail = phoneDetail2;

        phoneService.newPhoneWithAdd(phoneForAdd);
        assertNotNull(phoneForAdd);
        //assertTrue(!phones.isEmpty());
    }
/*
    @Test
    public void findAddedPhone()  {
        List<String> _features = new ArrayList<>();
        _features.add("");

        List<String> _dimensions =new ArrayList<>();
        _dimensions.add("bbb");
        _dimensions.add("bbb1");
        _dimensions.add("bbb2");

        List<String> _availability =new ArrayList<>();
        //_availability.add("0000");
        //_availability.add("1111");

        List<String> _images =new ArrayList<>();
        _images.add("98");
        _images.add("99");
        _images.add("100");


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
                        .features(_features)
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
                        .dimensions(_dimensions)
                        .weight("weight")
                        .build()
                )
                .storage(Storage.StorageBuilder.builder()
                        .flash("flash")
                        .ram("ram")
                        .build()
                )
                .availability(_availability)
                .images(_images)
                .build();

        PhoneForAdd phoneForAdd = new PhoneForAdd();
        phoneForAdd.phone = phone2;
        phoneForAdd.phoneDetail = phoneDetail2;

        List<Phone> phones = phoneService.findAll();
        int sizeOfPhonesBeforeAdd = phones.size();

        phoneService.newPhoneWithAdd(phoneForAdd);
        phones = phoneService.findAll();
        int sizeOfPhonesAfterAdd = phones.size();

        Assert.assertEquals(sizeOfPhonesBeforeAdd, sizeOfPhonesAfterAdd - 1);

        //assertTrue(!phones.isEmpty());
    }
    */

@Test
    public void canCreateAndroid()  {
        Android android = new Android();
        assertNotNull(android);

    }

    @Test
    public void canCreateUser()  {
        //Principal mockPrincipal = Mockito.mock(Principal.class);
        //UserController.user(mockPrincipal);
        //assertNotNull(mockPrincipal);
        //MemoryRealm memoryRealm = new MemoryRealm();
        //Principal p = memoryRealm.authenticate("foo");
        //Assert.assertNull(p);
    }
}
