package com.gordonmzizi.employeemanager.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class LoginController {

    @RequestMapping({"","/"})
    public String homePage(){

        return "login.html";
    }


}
