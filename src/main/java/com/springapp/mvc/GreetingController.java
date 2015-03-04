package com.springapp.mvc;

import org.springframework.stereotype.Controller;
//import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/greeting")
public class GreetingController {
    @RequestMapping(method = RequestMethod.POST)
    public String greeting(@RequestParam("value1") String valueOne) {
        System.out.println(valueOne);
        return "hello";
    }
}
