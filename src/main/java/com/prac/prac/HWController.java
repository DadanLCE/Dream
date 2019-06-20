package com.prac.prac;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HWController {
    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "Hello";
    }


}
