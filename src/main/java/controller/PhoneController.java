package controller;

import model.PhoneDetail;
import model.Phone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.PhoneService;

import java.util.Collection;

@RestController
public class PhoneController {

    @Autowired
    private PhoneService phoneServiceImpl;


    @RequestMapping(value = "/phones/phones.json", method = RequestMethod.GET)
    public Collection<Phone> getAllPhonesInfo() {
        return phoneServiceImpl.getAllPhonesInfo();
    }

    @RequestMapping(value="/phones/{id}", method = RequestMethod.GET )
    public PhoneDetail getPhoneById(@PathVariable("id") String id) {
        return phoneServiceImpl.getPhoneById(id);
    }


}
