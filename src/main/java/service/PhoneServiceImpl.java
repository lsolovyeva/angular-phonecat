package service;

import model.Phone;
import model.PhoneDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import repository.PhoneDetailRowMapper;
import repository.PhoneRepository;
import repository.PhoneRowMapper;

import java.util.List;

@Service

public class PhoneServiceImpl implements PhoneService {

    @Autowired
    PhoneRepository phoneRepository;

    public PhoneDetail findPhoneById(int id) {return phoneRepository.findPhoneById(id);}

    public List<Phone> findAll() {
        return phoneRepository.findAll();
    }

}