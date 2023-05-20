package com.example.exercise.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Join {

    @GetMapping("/join/form")
    public String getJoinForm() {

        return "/join/form";
    }
}
