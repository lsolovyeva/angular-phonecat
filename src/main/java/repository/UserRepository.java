//package repository;
//
//@Repository
//02
//public class UserRepository
//
//        {
//        04
//@Autowired
//05
//private JdbcTemplate jdbcTemplate;
//        06
//
//        07
//@Transactional(readOnly=true)
//08
//public List<User> findAll() {
//        09
//        return jdbcTemplate.query("select * from users",
//        10
//        new UserRowMapper());
//        11
//        }
//        12
//
//        13
//@Transactional(readOnly=true)
//14
//public User findUserById(int id) {
//        15
//        return jdbcTemplate.queryForObject(
//        16
//        "select * from users where id=?",
//        17
//        new Object[]{id}, new UserRowMapper());
//        18
//        }
//        19
//
