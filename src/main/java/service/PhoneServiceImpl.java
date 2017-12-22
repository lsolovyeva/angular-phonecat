package service;


import model.PhoneDetail;
import model.Phones;
import org.springframework.stereotype.Service;

@Service

public class PhoneServiceImpl implements PhoneService {

    public Phones[] getAllPhonesInfo() {
        return PhoneService.allInfo;
    }

    public PhoneDetail getPhoneById(String id) {
        for (PhoneDetail phone : PhoneService.all) {
            if (id.equals(phone.getId())) return phone;
        }
        return null;
    }
}