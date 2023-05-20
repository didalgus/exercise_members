package com.example.exercise.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class Login {

    @GetMapping("/login/form")
    public String getJoinForm() {

        return "/login/form";

    }
}
