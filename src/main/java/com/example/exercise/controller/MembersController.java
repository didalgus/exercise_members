package com.example.exercise.controller;

import com.example.exercise.dto.JoinDto;
import com.example.exercise.dto.LoginDto;
import com.example.exercise.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class MembersController {

    private final MemberService memberService;

    @PostMapping(value = "/member/login")
    public String loginMember(@Valid LoginDto loginDto) {
        return memberService.loginMember(loginDto);
    }

    @PostMapping(value = "/member/join")
    public String joinMember(@Valid JoinDto joinDto) { return memberService.insertMember(joinDto); }

    @GetMapping("/members/list")
    public List getMembers() {
        return memberService.getMembers();
    }
}
