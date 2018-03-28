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
    public int newPhone(@RequestBody PhoneForAdd phoneForAdd)
    {
        return phoneService.newPhoneWithAdd(phoneForAdd);

    }

/* Example:
    @GetMapping("/{id}")
    public ResponseEntity<?> getBazz(@PathVariable String id){
        return new ResponseEntity<>(new Bazz(id, "Bazz"+id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> newBazz(@RequestParam("name") String name){
        return new ResponseEntity<>(new Bazz("5", name), HttpStatus.OK);
    }
*/

/*
    @RequestMapping(value = "/add", method = POST)
    @ResponseBody
    public String postFoos() {
            //System.out.println("INTEGER Account on the top");
        return "Post some Foos";
    }
*/

/* no need to GET
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public int getAdd() {
        return phoneService.newPhoneWithAdd("JiJiJi",  "VoVoVo");
        //return new Phone(0, "JiJiJi", 144, "", "VoVoVo", "GoGoGo");
    }
*/
}
