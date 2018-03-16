package service;

import model.*;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public interface PhoneService {
    List<Phone> findAll();
    PhoneDetail findPhoneById(int id);
    Collection<Phone> findAllWithAdd();
}

