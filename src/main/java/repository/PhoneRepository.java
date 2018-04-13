package repository;

import model.Phone;
import model.PhoneDetail;
import model.PhoneForAdd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PhoneRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    public List<Phone> findAll() {
        return jdbcTemplate.query("SELECT * FROM Phone", new PhoneRowMapper());
    }

    public void newPhoneWithAdd(PhoneForAdd phoneForAdd) {

        int addedDetailID = addDetail(phoneForAdd);

        addPhone(phoneForAdd, addedDetailID);

        addPhoneAvailability(phoneForAdd, addedDetailID);

        addPhoneFeatures(phoneForAdd, addedDetailID);

        int addedImageID = addImages(phoneForAdd);
        addPhoneImages(phoneForAdd, addedDetailID, addedImageID);

        addPhoneDimentions(phoneForAdd, addedDetailID);
    }

    public int addPhone(PhoneForAdd phoneForAdd, int addedDetailID) {
        String sql = "INSERT INTO Phone(AGE, CARRIER, ID, IMAGEURL, NAME, SNIPPET, PHONEDETAIL_ID) values(?, ?, ?, ?, ?, ?, ?)";
        Object[] params = new Object[]{phoneForAdd.phone.getAge(), phoneForAdd.phone.getCarrier(), addedDetailID, phoneForAdd.phoneDetail.getImages().get(0), phoneForAdd.phone.getName(), phoneForAdd.phone.getSnippet(), addedDetailID};
        return jdbcTemplate.update(sql, params);
    }

    public int addDetail(PhoneForAdd phoneForAdd) {
        String sql = "    INSERT INTO PHONEDETAIL (ADDITIONALFEATURES,OS_ID,UI,STANDBYTIME,TALKTIME,TYPE,PRIMARY_ID,BLUETOOTH_ID,CELL,GPS,\n" +
                "    INFRARED,WIFI_ID,DESCRIPTION,SCREENRESOLUTION,SCREENSIZE,TOUCHSCREEN,ACCELEROMETER,\n" +
                "    AUDIOJACK_ID,CPU,FMRADIO,PHYSICALKEYBOARD,USB_ID, NAME,WEIGHT,FLASH,RAM)\n" +
                "    values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";

        Object[] params = new Object[]{phoneForAdd.phoneDetail.getAdditionalFeatures(),
                phoneForAdd.phoneDetail.getAndroid().getOs(),
                phoneForAdd.phoneDetail.getAndroid().getUi(),
                phoneForAdd.phoneDetail.getBattery().getStandbyTime(),
                phoneForAdd.phoneDetail.getBattery().getTalkTime(),
                phoneForAdd.phoneDetail.getBattery().getType(),
                phoneForAdd.phoneDetail.getCamera().getPrimary(),
                phoneForAdd.phoneDetail.getConnectivity().getBluetooth(),
                phoneForAdd.phoneDetail.getConnectivity().getCell(),
                phoneForAdd.phoneDetail.getConnectivity().isGps(),
                phoneForAdd.phoneDetail.getConnectivity().isInfrared(),
                phoneForAdd.phoneDetail.getConnectivity().getWifi(),
                phoneForAdd.phoneDetail.getDescription(),
                phoneForAdd.phoneDetail.getDisplay().getScreenResolution(),
                phoneForAdd.phoneDetail.getDisplay().getScreenSize(),
                phoneForAdd.phoneDetail.getDisplay().isTouchScreen(),
                phoneForAdd.phoneDetail.getHardware().isAccelerometer(),
                phoneForAdd.phoneDetail.getHardware().getAudioJack(),
                phoneForAdd.phoneDetail.getHardware().getCpu(),
                phoneForAdd.phoneDetail.getHardware().isFmRadio(),
                phoneForAdd.phoneDetail.getHardware().isPhysicalKeyboard(),
                phoneForAdd.phoneDetail.getHardware().getUsb(),
                phoneForAdd.phoneDetail.getName(),
                phoneForAdd.phoneDetail.getSizeAndWeight().getWeight(),
                phoneForAdd.phoneDetail.getStorage().getFlash(),
                phoneForAdd.phoneDetail.getStorage().getRam()};

        jdbcTemplate.update(sql, params); //new phone detail
        return jdbcTemplate.queryForObject("SELECT id FROM PhoneDetail WHERE name=?", new Object[]{phoneForAdd.phoneDetail.getName()}, new IdRowMapper(jdbcTemplate));
    }

    public int addPhoneAvailability(PhoneForAdd phoneForAdd, int addedDetailID) {
        String sql = "INSERT INTO PHONE_AVAILABILITY (PHONEDETAIL_ID, AVAILABILITY_ID) VALUES (?, ?)";
        ArrayList<Integer> tmp = new ArrayList<>();
        Object[] params;

        if (phoneForAdd.phoneDetail.getAvailability().size() > 0) {
            tmp.add(addedDetailID);
            Integer bar = Integer.parseInt(phoneForAdd.phoneDetail.getAvailability().get(0));
            tmp.add(bar);

            for (int i = 1; i < phoneForAdd.phoneDetail.getAvailability().size(); i++) {
                tmp.add(addedDetailID);
                Integer foo = Integer.parseInt(phoneForAdd.phoneDetail.getAvailability().get(i));
                tmp.add(foo);
                sql = sql.concat(" ,(?, ?)");
            }
            sql = sql.concat(";");
            params = tmp.toArray();
        } else
            params = new Object[]{addedDetailID, 0000};
        return jdbcTemplate.update(sql, params);
    }

    public int addPhoneFeatures(PhoneForAdd phoneForAdd, int addedDetailID) {
        String sql = "";
        Object[] params = new Object[]{};
        if (phoneForAdd.phoneDetail.getCamera().getFeatures().size() == 2) {
            params = new Object[]{addedDetailID, 11011, addedDetailID, 22022};
            sql = "INSERT INTO PHONE_FEATURES (PHONEDETAIL_ID, FEATURES_ID) VALUES (?, ?), (?, ?);";
        } else {
            if (phoneForAdd.phoneDetail.getCamera().getFeatures().get(0).equals("Flash"))
                params = new Object[]{addedDetailID, 11011};
            if (phoneForAdd.phoneDetail.getCamera().getFeatures().get(0).equals("Video"))
                params = new Object[]{addedDetailID, 22022};
            if (phoneForAdd.phoneDetail.getCamera().getFeatures().get(0).equals(""))
                params = new Object[]{addedDetailID, 33033};
            sql = "INSERT INTO PHONE_FEATURES (PHONEDETAIL_ID, FEATURES_ID) VALUES (?, ?);";
        }
        return jdbcTemplate.update(sql, params);
    }

    public int addPhoneImages(PhoneForAdd phoneForAdd, int addedDetailID, int addedImageID) {
        String sql = "INSERT INTO PHONE_IMAGES (PHONEDETAIL_ID, IMAGES_ID) VALUES (?, ?), (?, ?),(?, ?);";
        Object[] params = new Object[]{addedDetailID, addedImageID, addedDetailID, addedImageID + 1, addedDetailID, addedImageID + 2};
        return jdbcTemplate.update(sql, params);
    }

    public int addImages(PhoneForAdd phoneForAdd) {
        String sql = "INSERT INTO IMAGES(NAME) VALUES (?),(?), (?);";
        Object[] params = new Object[]{phoneForAdd.phoneDetail.getImages().get(0), phoneForAdd.phoneDetail.getImages().get(1), phoneForAdd.phoneDetail.getImages().get(2)};
        jdbcTemplate.update(sql, params);
        return jdbcTemplate.queryForObject("SELECT id FROM IMAGES WHERE name=?", new Object[]{phoneForAdd.phoneDetail.getImages().get(0)}, new IdRowMapper(jdbcTemplate));
    }

    public int addPhoneDimentions(PhoneForAdd phoneForAdd, int addedDetailID) {
        String sql = "INSERT INTO PHONE_DIMENSIONS (PHONEDETAIL_ID) VALUES (?), (?), (?);";
        addDimentions(phoneForAdd);
        Object[] params = new Object[]{addedDetailID, addedDetailID, addedDetailID};
        return jdbcTemplate.update(sql, params);
    }

    public int addDimentions(PhoneForAdd phoneForAdd) {
        String sql = "INSERT INTO DIMENSIONS(NAME) VALUES (?), (?), (?);";
        Object[] params = new Object[]{phoneForAdd.phoneDetail.getSizeAndWeight().getDimensions().get(0),
                phoneForAdd.phoneDetail.getSizeAndWeight().getDimensions().get(1),
                phoneForAdd.phoneDetail.getSizeAndWeight().getDimensions().get(2)};
        return jdbcTemplate.update(sql, params);
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
