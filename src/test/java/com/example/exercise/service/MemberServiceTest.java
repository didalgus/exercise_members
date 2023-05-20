package com.example.exercise.service;

import com.example.exercise.dto.JoinDto;
import com.example.exercise.dto.LoginDto;
import com.example.exercise.mapper.MemberMapper;
import com.example.exercise.vo.Member;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
@SpringBootTest
class MemberServiceTest {

    @Autowired
    private MemberService memberService;

    @Autowired
    MemberMapper memberMapper;

    @DisplayName("멤버 목록 테스트")
    @Test
    void member_list_test() {

        JoinDto joinDto = JoinDto.builder()
                                    .memberId("idTest1")
                                    .memberName("nameTest1")
                                    .memberPassword("passwordTest1")
                                    .build();

        memberService.insertMember(joinDto);

        List<Member> list = memberService.getMembers();
        int size = list.size();
        log.info("size : {}", size);
        assertTrue(size > 0);
        assertEquals(2, size);
    }

    @DisplayName("멤버 조회 테스트")
    @Test
    void member_search_test() {

        LoginDto loginDto = LoginDto.builder()
                .memberId("member1id")
                .memberPassword("1234")
                .build();

        Member member = memberService.getMember(loginDto);

        assertAll(
                () -> assertEquals(loginDto.getMemberId(), member.getMemberId()),
                () -> assertEquals("member1name", member.getMemberName())
        );
    }

    @DisplayName("멤버 삭제 테스트")
    @Test
    void member_delete_test() {
        boolean deleteMember = memberMapper.deleteMember("member1id");
        assertTrue(deleteMember);
    }
}