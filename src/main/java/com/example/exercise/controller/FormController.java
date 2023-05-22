package com.example.exercise.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FormController {

    @GetMapping("/")
    public String getIndex() {
        return "/index";
    }

    @GetMapping("/login/form")
    public String getLoginForm() {
        return "/login/form";
    }

    @GetMapping("/join/form")
    public String getJoinForm() {
        return "/join/form";
    }
}
