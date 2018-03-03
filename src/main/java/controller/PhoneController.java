package controller;

import model.PhoneDetail;
import model.Phone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import repository.PhoneRepository;
import service.PhoneService;

import java.security.Principal;
import java.util.Collection;
import org.springframework.http.HttpStatus;

//@ResponseStatus(HttpStatus.FORBIDDEN)
//class ForbiddenException extends RuntimeException {
//}

@RestController
public class PhoneController {
//    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger("application");

/*
    @RequestMapping("/user")
    public Principal user(Principal user) {
        throw new ForbiddenException();
        //return new Principal() {
        //    @Override
        //    public String getName() {
        //        return "name123";
        //    }

        //};
    }

    @RequestMapping(value = "/dologin", method = RequestMethod.POST)
    public void doLogin(@RequestBody Credentials credentials) {
        log.info("doLogin: credentials = '{}'", credentials);
        throw new ForbiddenException();
    }
*/
    @RequestMapping("/user")
    public Principal user(Principal user) {
        return user;
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
