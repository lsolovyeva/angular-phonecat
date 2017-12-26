package service;

import model.*;
import org.springframework.stereotype.Service;


@Service
public interface PhoneService {
    Phones[] getAllPhonesInfo();
    PhoneDetail getPhoneById(String id);
}