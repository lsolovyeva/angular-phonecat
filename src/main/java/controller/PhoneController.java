package controller;

import model.PhoneDetail;
import model.Phone;
import model.PhoneForAdd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.PhoneService;

import java.util.Collection;

@RestController
public class PhoneController {
    @Autowired
    PhoneService phoneService;

    @RequestMapping(value = "/phones/phones.json", method = RequestMethod.GET)
    public Collection<Phone> getAllPhonesInfo() {
        return phoneService.findAll();
    }

    @RequestMapping(value = "/phones/{id}", method = RequestMethod.GET)
    public PhoneDetail getPhoneById(@PathVariable("id") Integer id) {
        return phoneService.findPhoneById(id);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public void newPhone(@RequestBody PhoneForAdd phoneForAdd) {
        phoneService.newPhoneWithAdd(phoneForAdd);
    }
}
