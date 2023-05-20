package com.example.exercise.controller;

import com.example.exercise.dto.JoinDto;
import com.example.exercise.service.JoinService;
import com.example.exercise.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class Members {

    private final MemberService memberService;

    private final JoinService joinService;

    @PostMapping("/member/join")
    public void joinMember(JoinDto joinDto) {

        //TODO
        //비밀번호 암호화

        joinService.insertMember(joinDto);
    }

    @GetMapping("/members/list")
    public List getMembers() {
        return memberService.getMembers();
    }
}
