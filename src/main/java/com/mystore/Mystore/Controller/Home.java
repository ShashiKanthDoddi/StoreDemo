package com.mystore.Mystore.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {
    @RequestMapping("/")
    public String hellotag(){
        return "Hello World";
    }


    @RequestMapping("/login")
    public String login(){
        return "It blody fokin login page! ehhh";
    }


    @RequestMapping("/About")
    public String About(){
        return "It blody fokin About page! ehhh";
    }
}

