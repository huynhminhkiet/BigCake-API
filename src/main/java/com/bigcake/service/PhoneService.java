package com.bigcake.service;

import com.bigcake.model.SmartPhone;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Bigcake on 8/18/2017
 */

@Service
public class PhoneService {
    private List<SmartPhone> phones = new ArrayList<SmartPhone>(Arrays.asList(
            new SmartPhone(1, "Samsung A3", "abcabc"),
            new SmartPhone(2, "Samsung S8", "lllkkk"),
            new SmartPhone(3, "Iphone 5 ", "aaazzz"),
            new SmartPhone(4, "Oppo", "xxxyyy")
    ));

    public List<SmartPhone> getAllPhones() {
        return phones;
    }

    public SmartPhone getPhone(int id) {
        for (SmartPhone smartPhone : phones)
            if (smartPhone.getId() == id)
                return smartPhone;
        return null;
    }

    public void addPhone(SmartPhone phone) {
        phones.add(phone);
    }
}
