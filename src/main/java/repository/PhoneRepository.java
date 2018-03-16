package repository;

import lombok.extern.slf4j.Slf4j;
import model.Phone;
import model.PhoneDetail;
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

    public List<Phone> findAllWithAdd() {
        return jdbcTemplate.query("INSERT * FROM Phone", new PhoneRowMapper());
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
