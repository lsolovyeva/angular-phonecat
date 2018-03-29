package repository;

import model.Phone;
import model.PhoneDetail;
import model.PhoneForAdd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PhoneRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    public List<Phone> findAll() {
        return jdbcTemplate.query("SELECT * FROM Phone", new PhoneRowMapper());
    }

    public void newPhoneWithAdd(PhoneForAdd phoneForAdd) {

        addDetail(phoneForAdd);

        addPhone(phoneForAdd);

        addPhoneDimentions(phoneForAdd);
    }

    public int addPhone(PhoneForAdd phoneForAdd) {
        String sql = "INSERT INTO Phone(AGE, CARRIER, ID, IMAGEURL, NAME, SNIPPET, PHONEDETAIL_ID) values(?, ?, ?, ?, ?, ?, ?)";
        Object[] params = new Object[]{phoneForAdd.phone.getAge(), phoneForAdd.phone.getCarrier(), 144, 'b', phoneForAdd.phone.getName(), phoneForAdd.phone.getSnippet(), 144};
        return jdbcTemplate.update(sql,params);
    }

    public int addDetail(PhoneForAdd phoneForAdd) {
        String sql = "    INSERT INTO PHONEDETAIL (ADDITIONALFEATURES,OS_ID,UI,STANDBYTIME,TALKTIME,TYPE,PRIMARY_ID,BLUETOOTH_ID,CELL,GPS,\n" +
                "    INFRARED,WIFI_ID,DESCRIPTION,SCREENRESOLUTION,SCREENSIZE,TOUCHSCREEN,ACCELEROMETER,\n" +
                "    AUDIOJACK_ID,CPU,FMRADIO,PHYSICALKEYBOARD,USB_ID,ID,NAME,WEIGHT,FLASH,RAM)\n" +
                "    values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";

        Object[] params = new Object[]{"Add features",
                0, //os_id
                phoneForAdd.phoneDetail.getAndroid().getUi(),
                phoneForAdd.phoneDetail.getBattery().getStandbyTime(),
                phoneForAdd.phoneDetail.getBattery().getTalkTime(),
                phoneForAdd.phoneDetail.getBattery().getType(),
                3, //primary_id
                1, //bluetooth_id
                phoneForAdd.phoneDetail.getConnectivity().getCell(),
                phoneForAdd.phoneDetail.getConnectivity().isGps(),
                phoneForAdd.phoneDetail.getConnectivity().isInfrared(),
                2, //wifi_id
                phoneForAdd.phoneDetail.getDescription(),
                phoneForAdd.phoneDetail.getDisplay().getScreenResolution(),
                phoneForAdd.phoneDetail.getDisplay().getScreenSize(),
                phoneForAdd.phoneDetail.getDisplay().isTouchScreen(),
                phoneForAdd.phoneDetail.getHardware().isAccelerometer(),
                1, //audioJack_id
                phoneForAdd.phoneDetail.getHardware().getCpu(),
                phoneForAdd.phoneDetail.getHardware().isFmRadio(),
                phoneForAdd.phoneDetail.getHardware().isPhysicalKeyboard(),
                1, //usb_id
                144, //id
                phoneForAdd.phoneDetail.getName(),
                phoneForAdd.phoneDetail.getSizeAndWeight().getWeight(),
                phoneForAdd.phoneDetail.getStorage().getFlash(),
                phoneForAdd.phoneDetail.getStorage().getRam() };
        return jdbcTemplate.update(sql,params);
    }

    public int addPhoneDimentions(PhoneForAdd phoneForAdd) {
        //String sql = "INSERT INTO PHONE_DIMENSIONS (PHONEDETAIL_ID , DIMENSIONS_ID ) VALUES (?, ?), (?, ?), (?, ?);";
        String sql = "INSERT INTO PHONE_DIMENSIONS (PHONEDETAIL_ID) VALUES (?), (?), (?);";

        addDimentions(phoneForAdd);

        //Object[] params=new Object[]{144, 711, 144, 712, 144, 713};
        Object[] params = new Object[]{144, 144, 144};

        return jdbcTemplate.update(sql,params);
    }


    public int addDimentions(PhoneForAdd phoneForAdd) {
        //String sql = "INSERT INTO DIMENSIONS(ID, NAME ) VALUES (?,?), (?,?), (?,?);";
        String sql = "INSERT INTO DIMENSIONS(NAME) VALUES (?), (?), (?);";
        //Object[] params=new Object[]{711, "width1", 712, "height1", 713, "depth1"};
        Object[] params = new Object[]{phoneForAdd.phoneDetail.getSizeAndWeight().getDimensions().get(0),
                phoneForAdd.phoneDetail.getSizeAndWeight().getDimensions().get(1),
                phoneForAdd.phoneDetail.getSizeAndWeight().getDimensions().get(2)
        };

        return jdbcTemplate.update(sql,params);
    }

    public PhoneDetail findPhoneById(int id) {
        return jdbcTemplate.queryForObject("SELECT PhoneDetail.additionalFeatures, os.name AS os_name,\n" +
                "PhoneDetail.ui, PhoneDetail.standbyTime, PhoneDetail.talkTime, PhoneDetail.type,\n" +
                "`primary`.`name` AS primary_name,\n" +
                "bluetooth.name AS bluetooth_name,\n" +
                "PhoneDetail.cell, PhoneDetail.gps, PhoneDetail.infrared,\n" +
                "wifi.name AS wifi_name,\n" +
                "PhoneDetail.description, PhoneDetail.screenResolution,PhoneDetail.screenSize,PhoneDetail.touchScreen,\n" +
                "PhoneDetail.accelerometer,\n" +
                "audioJack.name AS audioJack_name,\n" +
                "PhoneDetail.cpu, PhoneDetail.fmRadio,PhoneDetail.physicalKeyboard,\n" +
                "usb.name AS usb_name,\n" +
                "PhoneDetail.id, PhoneDetail.name, PhoneDetail.weight,PhoneDetail.flash, PhoneDetail.ram FROM PhoneDetail LEFT JOIN os ON PhoneDetail.os_id=os.id LEFT JOIN `primary`\n" +
                "ON PhoneDetail.primary_id=`primary`.id LEFT JOIN bluetooth\n" +
                "ON PhoneDetail.bluetooth_id=bluetooth.id LEFT JOIN wifi ON PhoneDetail.wifi_id=wifi.id LEFT JOIN audioJack ON PhoneDetail.audioJack_id=audioJack.id\n" +
                "LEFT JOIN usb ON PhoneDetail.usb_id=usb.id WHERE PhoneDetail.id=?", new Object[]{id}, new PhoneDetailRowMapper(jdbcTemplate));
    }

}
/*

    INSERT INTO PHONEDETAIL (ADDITIONALFEATURES,OS_ID,UI,STANDBYTIME,TALKTIME,TYPE,PRIMARY_ID,BLUETOOTH_ID,CELL,GPS,
    INFRARED,WIFI_ID,DESCRIPTION,SCREENRESOLUTION,SCREENSIZE,TOUCHSCREEN,ACCELEROMETER,
    AUDIOJACK_ID,CPU,FMRADIO,PHYSICALKEYBOARD,USB_ID,ID,NAME,WEIGHT,FLASH,RAM)
    values('Add features',0,'la','23h','24h','other',3,1,'non',true,false,2,'My Description','screen','s size',false,
    false,1,'cpu',false,true,1,325,'name of mine','25kg','flashh','ramm');

    INSERT INTO Phone (AGE, CARRIER, ID, IMAGEURL, NAME, SNIPPET, PHONEDETAIL_ID) VALUES (0, 'a', 145, 'b', 'n', 'aaa', 325);

 */