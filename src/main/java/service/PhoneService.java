
package service;

import model.*;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;


@Service
public interface PhoneService {
    //Collection<Phone> getAllPhonesInfo();
    //PhoneDetail getPhoneById(String id);
    List<Phone> findAll();
    PhoneDetail findPhoneById(int id);


    }

