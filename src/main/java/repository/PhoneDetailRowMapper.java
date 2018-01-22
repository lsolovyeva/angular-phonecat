package repository;

import model.Phone;
import model.PhoneDetail;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PhoneDetailRowMapper implements RowMapper<PhoneDetail>
{
    @Override
    public PhoneDetail mapRow(ResultSet rs, int rowNum) throws SQLException {

        PhoneDetail phoneDetail = new PhoneDetail();
        phoneDetail.setAdditionalFeatures(rs.getString("additionalFeatures"));
        phoneDetail.setOs_id(rs.getInt("os_id"));
        phoneDetail.setDescription(rs.getString("description"));
        phoneDetail.setName(rs.getString("name"));



        PhoneDetail.Android android = new PhoneDetail.Android();
        android.setUi(rs.getString("ui"));
        //android.setOs(rs.getString("os"));
        phoneDetail.setAndroid(android);


        PhoneDetail.Battery battery = new PhoneDetail.Battery();
        battery.setStandbyTime(rs.getString("standbyTime"));
        battery.setTalkTime(rs.getString("talkTime"));
        battery.setType(rs.getString("type"));
        phoneDetail.setBattery(battery);


        PhoneDetail.Connectivity connectivity = new PhoneDetail.Connectivity();
        connectivity.setCell(rs.getString("cell"));
        connectivity.setGps(rs.getBoolean("gps"));
        connectivity.setInfrared(rs.getBoolean("infrared"));
        phoneDetail.setConnectivity(connectivity);


        PhoneDetail.Display display = new PhoneDetail.Display();
        display.setScreenResolution(rs.getString("screenResolution"));
        display.setScreenSize(rs.getString("screenSize"));
        display.setTouchScreen(rs.getBoolean("touchScreen"));
        phoneDetail.setDisplay(display);


        PhoneDetail.Hardware hardware = new PhoneDetail.Hardware();
        hardware.setAccelerometer(rs.getBoolean("accelerometer"));
        hardware.setCpu(rs.getString("cpu"));
        hardware.setFmRadio(rs.getBoolean("fmRadio"));
        hardware.setPhysicalKeyboard(rs.getBoolean("physicalKeyboard"));
        phoneDetail.setHardware(hardware);


        PhoneDetail.SizeAndWeight sizeAndWeight = new PhoneDetail.SizeAndWeight();
        sizeAndWeight.setWeight(rs.getString("weight"));
        phoneDetail.setSizeAndWeight(sizeAndWeight);

        PhoneDetail.Storage storage = new PhoneDetail.Storage();
        storage.setFlash(rs.getString("flash"));
        storage.setRam(rs.getString("ram"));
        phoneDetail.setStorage(storage);


        return phoneDetail;
    }
}