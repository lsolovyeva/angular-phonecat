package repository;

import model.Phone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.*;
import java.util.List;

@Repository
public class UserRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Transactional(readOnly=true)
    public List<Phone> findAll() {
        return jdbcTemplate.query("select * from Phone", new PhoneRowMapper()); }

    @Transactional(readOnly=true)
    public User findUserById(int id) {
        return jdbcTemplate.queryForObject("select * from users where id=?", new Object[]{id}, new UserRowMapper()); }


    public User create(final User user)
    {
        final String sql = "insert into users(name,email) values(?,?)";
        KeyHolder holder = new GeneratedKeyHolder();
        jdbcTemplate.update(new PreparedStatementCreator() {

            @Override
            public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                ps.setString(1, user.getName());
                ps.setString(2, user.getEmail());
                return ps;
            }
        }, holder);

        int newUserId = holder.getKey().intValue();
        user.setId(newUserId);
        return user;
    }
}


class UserRowMapper implements RowMapper<User>
        {
@Override
public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        User user = new User();
        user.setId(rs.getInt("id"));
        user.setName(rs.getString("name"));
        user.setEmail(rs.getString("email"));
        return user;
        }
        }

        /*
class PhoneRowMapper implements RowMapper<Phone>
{
    @Override
    public Phone mapRow(ResultSet rs, int rowNum) throws SQLException {
        Phone phone = new Phone();
        phone.setAge(rs.getInt("age"));
        phone.setCarrier(rs.getString("carrier"));
        phone.setId(rs.getInt("id"));
        phone.setImageUrl(rs.getString("imageUrl"));
        phone.setName(rs.getString("name"));
        phone.setSnippet(rs.getString("snippet"));
        phone.setPhonedetail_id(rs.getInt("phonedetail_id"));

        return phone;
    }
}
*/
