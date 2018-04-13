package repository;

import model.*;
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

        int id = rs.getInt("PhoneDetail.id");

        List<String> features = jdbcTemplate.query("SELECT features.name AS features_name FROM PHONE_features INNER JOIN features ON\n" +
                "phonedetail_id=?\n" +
                "AND\n" +
                "features_id= features.id", new Object[]{id}, new FeaturesRowMapper());
        List<String> dimensions = jdbcTemplate.query("SELECT dimensions.name AS dimensions_name FROM PHONE_dimensions INNER JOIN dimensions ON\n" +
                "phonedetail_id=?\n" +
                "AND\n" +
                "dimensions_id= dimensions.id", new Object[]{id}, new DimensionsRowMapper());
        List<String> availability = jdbcTemplate.query("SELECT availability.name AS availability_name FROM PHONE_availability INNER JOIN availability ON\n" +
                "phonedetail_id=?\n" +
                "AND\n" +
                "availability_id= availability.id", new Object[]{id}, new AvailabilityRowMapper());
        List<String> images = jdbcTemplate.query("SELECT images.name AS images_name FROM PHONE_IMAGES INNER JOIN IMAGES ON\n" +
                "phonedetail_id=?\n" +
                "AND\n" +
                "images_id= images.id", new Object[]{id}, new ImageRowMapper());

        return PhoneDetail.builder()
                .additionalFeatures(rs.getString("additionalFeatures"))
                .description(rs.getString("description"))
                .name(rs.getString("name"))
                .android(Android.AndroidBuilder.builder()
                        .os(rs.getString("os_name"))
                        .ui(rs.getString("ui")).build()
                )
                .battery(Battery.BatteryBuilder.builder()
                        .standbyTime(rs.getString("standbyTime"))
                        .talkTime(rs.getString("talkTime"))
                        .type(rs.getString("type"))
                        .build()
                )
                .camera(Camera.CameraBuilder.builder()
                        .features(features)
                        .primary(rs.getString("primary_name"))
                        .build()
                )
                .connectivity(Connectivity.ConnectivityBuilder.builder()
                        .bluetooth(rs.getString("bluetooth_name"))
                        .cell(rs.getString("cell"))
                        .gps(rs.getBoolean("gps"))
                        .infrared(rs.getBoolean("infrared"))
                        .wifi(rs.getString("wifi_name"))
                        .build()
                )
                .display(Display.DisplayBuilder.builder()
                        .screenResolution(rs.getString("screenResolution"))
                        .screenSize(rs.getString("screenSize"))
                        .touchScreen(rs.getBoolean("touchScreen"))
                        .build())
                .hardware(Hardware.HardwareBuilder.builder()
                        .accelerometer(rs.getBoolean("accelerometer"))
                        .audioJack(rs.getString("audioJack_name"))
                        .cpu(rs.getString("cpu"))
                        .fmRadio(rs.getBoolean("fmRadio"))
                        .physicalKeyboard(rs.getBoolean("physicalKeyboard"))
                        .usb(rs.getString("usb_name"))
                        .build()
                )
                .sizeAndWeight(SizeAndWeight.SizeAndWeightBuilder.builder()
                        .dimensions(dimensions)
                        .weight(rs.getString("weight"))
                        .build()
                )
                .storage(Storage.StorageBuilder.builder()
                        .flash(rs.getString("flash"))
                        .ram(rs.getString("ram"))
                        .build()
                )
                .availability(availability)
                .images(images)
                .build();
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

            return rs.getString("dimensions_name");
        }
    }
}