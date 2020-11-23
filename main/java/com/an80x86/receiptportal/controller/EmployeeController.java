package com.an80x86.receiptportal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EmployeeController {

    @RequestMapping(path="/", method=RequestMethod.GET)
    public String goHome(){
        return "index";
    }

}
