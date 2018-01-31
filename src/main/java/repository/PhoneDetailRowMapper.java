package repository;

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

        PhoneDetail phoneDetail = new PhoneDetail.PhoneDetailBuilder(rs.getString("additionalFeatures"))
                .description(rs.getString("description"))
                .name(rs.getString("name"))
                .android(rs.getString("ui"),rs.getString("os_name"))
                .battery(rs.getString("standbyTime"),rs.getString("talkTime"),rs.getString("type"))
                .camera(features, rs.getString("primary_name"))
                .connectivity(rs.getString("bluetooth_name"),
                        rs.getString("cell"),
                        rs.getBoolean("gps"),
                        rs.getBoolean("infrared"),
                        rs.getString("wifi_name")
                        )
                .display(rs.getString("screenResolution"),rs.getString("screenSize"),rs.getBoolean("touchScreen")
                )
                .hardware(rs.getBoolean("accelerometer"),
                        rs.getString("audioJack_name"),
                        rs.getString("cpu"),
                        rs.getBoolean("fmRadio"),
                        rs.getBoolean("physicalKeyboard"),
                        rs.getString("usb_name")
                        )
                .sizeAndWeight(dimensions, rs.getString("weight"))
                .storage(rs.getString("flash"),rs.getString("ram"))
                .availability(availability)
                .images(images)

                .build();
        
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

            return rs.getString("dimensions_name");
        }
    }
}