package com.offcn.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/save")
   public void save(){
        System.out.println("this is xiaowang write");
   }
}
