package repository;

import model.Phone;
import model.PhoneDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.*;
import java.util.List;

import repository.PhoneDetailRowMapper;

@Repository
public class PhoneRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Transactional(readOnly=true)
    public List<Phone> findAll() {
        return jdbcTemplate.query("select * from Phone", new PhoneRowMapper()); }

    @Transactional(readOnly=true)
    public PhoneDetail findPhoneById(int id) {
        return jdbcTemplate.query("(select PhoneDetail.additionalFeatures, os.name as os_name,\n" +
                "PhoneDetail.ui, PhoneDetail.standbyTime, PhoneDetail.talkTime, PhoneDetail.type,\n" +
                "`primary`.`name` as primary_name,\n" +
                "bluetooth.name as bluetooth_name,\n" +
                "PhoneDetail.cell, PhoneDetail.gps, PhoneDetail.infrared,\n" +
                "wifi.name as wifi_name,\n" +
                "PhoneDetail.description, PhoneDetail.screenResolution,PhoneDetail.screenSize,PhoneDetail.touchScreen,\n" +
                "PhoneDetail.accelerometer,\n" +
                "audioJack.name as audioJack_name,\n" +
                "PhoneDetail.cpu, PhoneDetail.fmRadio,PhoneDetail.physicalKeyboard,\n" +
                "usb.name as usb_name,\n" +
                "PhoneDetail.id, PhoneDetail.name, PhoneDetail.weight,PhoneDetail.flash, PhoneDetail.ram from PhoneDetail LEFT JOIN os ON PhoneDetail.os_id=os.id LEFT JOIN `primary`\n" +
                "ON PhoneDetail.primary_id=`primary`.id LEFT JOIN bluetooth\n" +
                "ON PhoneDetail.bluetooth_id=bluetooth.id LEFT JOIN wifi ON PhoneDetail.wifi_id=wifi.id LEFT JOIN audioJack ON PhoneDetail.audioJack_id=audioJack.id\n" +
                "LEFT JOIN usb ON PhoneDetail.usb_id=usb.id where PhoneDetail.id=?)" +
                "UNION " +
                "(SELECT images_id, images.name as images_name FROM PHONE_IMAGES, IMAGES LEFT JOIN PhoneDetail WHERE PhoneDetail.id=phone_images.phonedetail_id\n" +
                "AND\n" +
                "phonedetail_id=?\n" +
                "AND\n" +
                "images_id= images.id\n)" +
                "", new Object[]{id}, new PhoneDetailRowMapper());
    }

}
