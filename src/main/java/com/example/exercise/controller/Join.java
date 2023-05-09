package com.example.exercise.controller;

import com.example.exercise.dto.JoinRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Join {

    @GetMapping("/join/form")
    public String getJoinForm() {

        return "/join/form";

    }

    @PostMapping("/join/register")
    public void getJoinRegister(JoinRequest joinRequest) {



    }

}
