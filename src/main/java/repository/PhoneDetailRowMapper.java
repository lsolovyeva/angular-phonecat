package repository;

import model.Phone;
import model.PhoneDetail;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class PhoneDetailRowMapper implements ResultSetExtractor<PhoneDetail>
{


    @Override
    public PhoneDetail extractData(ResultSet rs) throws SQLException, DataAccessException {
        PhoneDetail phoneDetail = new PhoneDetail();
        phoneDetail.setAdditionalFeatures(rs.getString("additionalFeatures"));
        phoneDetail.setDescription(rs.getString("description"));
        phoneDetail.setName(rs.getString("name"));



        PhoneDetail.Android android = new PhoneDetail.Android();
        android.setUi(rs.getString("ui"));
        android.setOs(rs.getString("os_name"));
        phoneDetail.setAndroid(android);

        PhoneDetail.Battery battery = new PhoneDetail.Battery();
        battery.setStandbyTime(rs.getString("standbyTime"));
        battery.setTalkTime(rs.getString("talkTime"));
        battery.setType(rs.getString("type"));
        phoneDetail.setBattery(battery);


        PhoneDetail.Camera camera = new PhoneDetail.Camera();
        camera.setPrimary(rs.getString("primary_name"));
        phoneDetail.setCamera(camera);

        PhoneDetail.Connectivity connectivity = new PhoneDetail.Connectivity();
        connectivity.setBluetooth(rs.getString("bluetooth_name"));
        connectivity.setCell(rs.getString("cell"));
        connectivity.setGps(rs.getBoolean("gps"));
        connectivity.setInfrared(rs.getBoolean("infrared"));
        connectivity.setWifi(rs.getString("wifi_name"));
        phoneDetail.setConnectivity(connectivity);


        PhoneDetail.Display display = new PhoneDetail.Display();
        display.setScreenResolution(rs.getString("screenResolution"));
        display.setScreenSize(rs.getString("screenSize"));
        display.setTouchScreen(rs.getBoolean("touchScreen"));
        phoneDetail.setDisplay(display);

        PhoneDetail.Hardware hardware = new PhoneDetail.Hardware();
        hardware.setAccelerometer(rs.getBoolean("accelerometer"));
        hardware.setAudioJack(rs.getString("audioJack_name"));
        hardware.setCpu(rs.getString("cpu"));
        hardware.setFmRadio(rs.getBoolean("fmRadio"));
        hardware.setPhysicalKeyboard(rs.getBoolean("physicalKeyboard"));
        hardware.setUsb(rs.getString("usb_name"));
        phoneDetail.setHardware(hardware);


        PhoneDetail.SizeAndWeight sizeAndWeight = new PhoneDetail.SizeAndWeight();
        sizeAndWeight.setWeight(rs.getString("weight"));
        phoneDetail.setSizeAndWeight(sizeAndWeight);

        PhoneDetail.Storage storage = new PhoneDetail.Storage();
        storage.setFlash(rs.getString("flash"));
        storage.setRam(rs.getString("ram"));
        phoneDetail.setStorage(storage);


        ///////////
        //PhoneDetail phoneDetail = null;
        List<String> images = phoneDetail.getImages();
        while (rs.next()) {
            if (phoneDetail == null)
                phoneDetail = new PhoneDetail();
            else
                //phoneDetail.setImages(resultSet.getString("image"));
                images.add(rs.getString("images_name"));
        }
        return phoneDetail;
    }


}
