package com.jmu.test.controll;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class testcontroll {
    @RequestMapping("login")
    public String hello() {
        return "login";
    }
}
