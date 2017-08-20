package com.bigcake.controller;

import com.bigcake.model.SmartPhone;
import com.bigcake.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Bigcake on 8/7/2017
 */
@RestController
public class SmartPhoneController {

    private final PhoneService mPhoneService;

    @Autowired
    public SmartPhoneController(PhoneService mPhoneService) {
        this.mPhoneService = mPhoneService;
    }

    @RequestMapping("/getPhones")
    public List<SmartPhone> getPhones() {
        return mPhoneService.getAllPhones();
    }

    @RequestMapping("/getPhone/{id}")
    public SmartPhone getPhone(@PathVariable int id) {
        return mPhoneService.getPhone(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/phones")
    public void addPhone(@RequestBody SmartPhone phone) {
        mPhoneService.addPhone(phone);
    }
}
