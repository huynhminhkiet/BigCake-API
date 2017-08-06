package com.bigcake.controller;

import com.bigcake.model.SmartPhone;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Bigcake on 8/7/2017
 */
@RestController
public class SmartPhoneController {

    @RequestMapping("/getPhones")
    public List<SmartPhone> getPhones() {
        return Arrays.asList(
                new SmartPhone("Samsung A3 2017", "abc-adkklo"),
                new SmartPhone("Iphone 5", "abc-mmm")
        );
    }
}
