package com.demidao.controllers;

import com.demidao.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class MainController {

    private final UserService userService;

    @Autowired
    public MainController(UserService userService) {
        this.userService = userService;
        this.userService.index(); // заполнение рыбными данными базу данных
    }

    @GetMapping("/")
    public String homePage() {


        return "home";
    }

}
