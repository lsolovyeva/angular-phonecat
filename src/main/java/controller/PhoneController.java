package controller;

import model.PhoneDetail;
import model.Phone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import repository.User;
import repository.UserRepository;
import service.PhoneService;

import java.util.Collection;
import java.util.List;

@RestController
public class PhoneController {

    @Autowired
    private PhoneService phoneServiceImpl;

/*
    @RequestMapping(value = "/phones/phones.json", method = RequestMethod.GET)
    public Collection<Phone> getAllPhonesInfo() {
        return phoneServiceImpl.getAllPhonesInfo();
    }

    @RequestMapping(value="/phones/{id}", method = RequestMethod.GET )
    public PhoneDetail getPhoneById(@PathVariable("id") String id) {
        return phoneServiceImpl.getPhoneById(id);
    }
    */

    @Autowired
    private UserRepository repo;

    @RequestMapping(value = "/phones/phones.json", method = RequestMethod.GET)
    public Collection<Phone> getAllPhonesInfo() {
        return repo.findAll();
    }

    @RequestMapping(value="/phones/{id}", method = RequestMethod.GET )
    public PhoneDetail getPhoneById(@PathVariable("id") Integer id) {
        return repo.findPhoneById(id);
    }

}
