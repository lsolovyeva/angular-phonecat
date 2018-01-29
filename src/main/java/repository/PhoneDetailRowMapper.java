package repository;

import model.Phone;
import model.PhoneDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class PhoneDetailRowMapper implements RowMapper<PhoneDetail> {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public PhoneDetailRowMapper(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public PhoneDetail mapRow(ResultSet rs, int i) throws SQLException, DataAccessException {
        PhoneDetail.PhoneDetailBuilder phoneDetail = new PhoneDetail.PhoneDetailBuilder(
                rs.getString("additionalFeatures"),
                rs.getString("description"),
                rs.getString("name")
        ).android(rs.getString("ui"),rs.getString("os_name"));
        /*
        PhoneDetail phoneDetail = new PhoneDetail();
        phoneDetail.setAdditionalFeatures(rs.getString("additionalFeatures"));
        phoneDetail.setDescription(rs.getString("description"));
        phoneDetail.setName(rs.getString("name"));
*/
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

        int id = rs.getInt("PhoneDetail.id");
        List<String> images = jdbcTemplate.query("SELECT images.name AS images_name FROM PHONE_IMAGES INNER JOIN IMAGES ON\n" +
                "phonedetail_id=?\n" +
                "AND\n" +
                "images_id= images.id", new Object[]{id}, new ImageRowMapper());

        phoneDetail.setImages(images);
        List<String> availability = jdbcTemplate.query("SELECT availability.name AS availability_name FROM PHONE_availability INNER JOIN availability ON\n" +
                "phonedetail_id=?\n" +
                "AND\n" +
                "availability_id= availability.id", new Object[]{id}, new AvailabilityRowMapper());

        phoneDetail.setAvailability(availability);


        List<String> features = jdbcTemplate.query("SELECT features.name AS features_name FROM PHONE_features INNER JOIN features ON\n" +
                "phonedetail_id=?\n" +
                "AND\n" +
                "features_id= features.id", new Object[]{id}, new FeaturesRowMapper());

        camera.setFeatures(features);


        List<String> dimentions = jdbcTemplate.query("SELECT dimentions.name AS dimentions_name FROM PHONE_dimentions INNER JOIN dimentions ON\n" +
                "phonedetail_id=?\n" +
                "AND\n" +
                "dimentions_id= dimentions.id", new Object[]{id}, new DimensionsRowMapper());

        sizeAndWeight.setDimensions(dimentions);


        return phoneDetail;
    }

    private static class ImageRowMapper implements RowMapper<String> {

        @Override
        public String mapRow(ResultSet rs, int i) throws SQLException, DataAccessException {

            return rs.getString("images_name");
        }
    }

    private static class AvailabilityRowMapper implements RowMapper<String> {

        @Override
        public String mapRow(ResultSet rs, int i) throws SQLException, DataAccessException {

            return rs.getString("availability_name");
        }
    }

    private static class FeaturesRowMapper implements RowMapper<String> {

        @Override
        public String mapRow(ResultSet rs, int i) throws SQLException, DataAccessException {
            return rs.getString("features_name");
        }
    }

    private static class DimensionsRowMapper implements RowMapper<String> {

        @Override
        public String mapRow(ResultSet rs, int i) throws SQLException, DataAccessException {

            return rs.getString("dimentions_name");
        }
    }
}