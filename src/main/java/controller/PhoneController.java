package controller;

import model.PhoneDetail;
import model.Phone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import repository.PhoneRepository;
import service.PhoneService;

import java.security.Principal;
import java.util.Collection;

@RestController
public class PhoneController {

    @RequestMapping("/user")
    public Principal user(Principal user) {
        return new Principal() {
            @Override
            public String getName() {
                return "name123";
            }

        };
    }

    @RequestMapping(value = "/dologin", method = RequestMethod.POST)
    public void getLogin() {

    }

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

}
