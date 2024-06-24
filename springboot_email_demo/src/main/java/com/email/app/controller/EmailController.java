package com.email.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

    @GetMapping("/email")
    public String emailResponse(){
        return "Email sent";
    }

    @GetMapping("/emailRequest")
    public String emailRequest(){
        return "Email Request sent";
    }




}
