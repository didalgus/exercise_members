package com.example.exercise.controller;

import com.example.exercise.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class Members {

    private final MemberService memberService;

    @GetMapping("/members/list")
    public List getMembers() {
        return memberService.getMembers();
    }
}
