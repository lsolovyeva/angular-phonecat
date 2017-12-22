package controller;

import model.PhoneDetail;
import model.Phones;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.PhoneService;
import service.PhoneServiceImpl;

@RestController
public class PhoneController {

    @Autowired
    private PhoneService phoneServiceImpl;


    @RequestMapping(value = "/phones/phones.json", method = RequestMethod.GET)
    public Phones[] getAllPhonesInfo() {
        return phoneServiceImpl.getAllPhonesInfo();
    }

    @RequestMapping(value="/phones/{id}", method = RequestMethod.GET )
    public PhoneDetail getPhoneById(@PathVariable("id") String id) {
        return phoneServiceImpl.getPhoneById(id);
    }


}
