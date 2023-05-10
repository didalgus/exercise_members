package com.example.exercise.service;

import com.example.exercise.vo.Member;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Slf4j
@RequiredArgsConstructor
@SpringBootTest
class MemberServiceTest {

    @Autowired
    private MemberService memberService;

    @Test
    public void getMembers() {
        List<Member> list = memberService.getMembers();
        int size = list.size();
        log.info("size : {}", size);
        assertEquals(1, size);
    }
}