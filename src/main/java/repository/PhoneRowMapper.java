package repository;

import model.Phone;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PhoneRowMapper implements RowMapper<Phone>
{
    @Override
    public Phone mapRow(ResultSet rs, int rowNum) throws SQLException {
        Phone phone = new Phone();
        phone.setAge(rs.getInt("age"));
        phone.setCarrier(rs.getString("carrier"));
        //phone.setId(rs.getString("id"));
        phone.setId(rs.getInt("id"));
        phone.setImageUrl(rs.getString("imageUrl"));
        phone.setName(rs.getString("name"));
        phone.setSnippet(rs.getString("snippet"));
        phone.setPhonedetail_id(rs.getInt("phonedetail_id"));

        return phone;
    }
}