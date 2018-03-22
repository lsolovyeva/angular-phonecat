package controller;

import model.PhoneDetail;
import model.Phone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.PhoneService;
import java.util.Collection;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class PhoneController {

    @Autowired
    PhoneService phoneService;
/*
@RequestMapping(value = "/add", method = RequestMethod.POST)
public void addAccount() {
    System.out.println("Account on the top");
}

    @RequestMapping(value = "/add", method = POST)
    @ResponseBody
    public String postFoos() {
        return "Post some Foos";
    }
*/
    @RequestMapping(value = "/phones/phones.json", method = RequestMethod.GET)
    public Collection<Phone> getAllPhonesInfo() {
        return phoneService.findAll();
    }

    @RequestMapping(value = "/phones/{id}", method = RequestMethod.GET)
    public PhoneDetail getPhoneById(@PathVariable("id") Integer id) {
        return phoneService.findPhoneById(id);
    }









    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public int getAdd() {
        return phoneService.newPhoneWithAdd("JiJiJi",  "VoVoVo");
        //return new Phone(0, "JiJiJi", 144, "", "VoVoVo", "GoGoGo");
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    //@ResponseBody
    public int newPhone(@RequestParam("myName2")String myName2 ,@RequestParam("myName5")String myName5)
    {
        System.out.println("INTEGER Account on the top");
        //return new Phone(0, myName2, 144, "", "VoVoVo", "GoGoGo");
        return phoneService.newPhoneWithAdd(myName2, myName5);

    }

/*
    @GetMapping("/{id}")
    public ResponseEntity<?> getBazz(@PathVariable String id){
        return new ResponseEntity<>(new Bazz(id, "Bazz"+id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> newBazz(@RequestParam("name") String name){
        return new ResponseEntity<>(new Bazz("5", name), HttpStatus.OK);
    }

    */
}
