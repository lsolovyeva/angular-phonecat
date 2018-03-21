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
    PhoneService phoneService;
/*
    @RequestMapping(value = "add/1", method = RequestMethod.POST)
    public Integer addPhone(Integer myName1)
    {

        return myName1;
    }
*/
@RequestMapping(value = "/add", method = {RequestMethod.POST, RequestMethod.GET})
public void addAccount() {
    System.out.println("Account on the top");
}

    @RequestMapping(value = "/phones/phones.json", method = RequestMethod.GET)
    public Collection<Phone> getAllPhonesInfo() {
        return phoneService.findAll();
    }

    @RequestMapping(value = "/phones/{id}", method = RequestMethod.GET)
    public PhoneDetail getPhoneById(@PathVariable("id") Integer id) {
        return phoneService.findPhoneById(id);
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Collection<Phone> getAdd() {
        return phoneService.findAllWithAdd();
    }
}
