package service;

import controller.PhoneController;
import model.*;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public interface PhoneService {
    List<Phone> findAll();
    PhoneDetail findPhoneById(int id);
    int newPhoneWithAdd(String myName2, String myName5);
}

