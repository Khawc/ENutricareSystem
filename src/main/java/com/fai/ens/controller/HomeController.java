package com.fai.ens.controller;

import com.fai.ens.entity.User;
import com.fai.ens.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @Autowired
    UserRepository userRepository;
    @RequestMapping("/")
    public String home(){
        userRepository.findAll();
        return "views/index";
    }
    @RequestMapping("/test")
    public String test(){
        User user = new User();
        user.setAccount("dsfsdf");
        user.setFirstName("sdfsdf");
        user.setLastName("sdfsdf");
        userRepository.save(user);
        return "";
    }
}
