package com.bigcake.controller;

import com.bigcake.model.MyAppInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Bigcake on 8/7/2017
 */
@RestController
public class AppInfoController {

    @RequestMapping("/info")
    public MyAppInfo info() {
        return new MyAppInfo("Bigcake API", "The cake and phone resources.", "1.0 BETA");
    }
}
