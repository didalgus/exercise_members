package com.example.exercise.service;

import com.example.exercise.dto.JoinDto;
import com.example.exercise.dto.LoginDto;
import com.example.exercise.mapper.MemberMapper;
import com.example.exercise.vo.MemberVO;
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

        List<MemberVO> list = memberService.getMembers();
        int size = list.size();
        log.info("size : {}", size);
        assertTrue(size > 0);
        assertEquals(2, size);
    }

    @DisplayName("멤버 조회 테스트")
    @Test
    void member_search_test() {

        LoginDto loginDto = LoginDto.builder()
                .memberId("test")
                .memberPassword("1234")
                .build();

        MemberVO memberVO = memberService.getMember(loginDto);

        String hashPassword = memberService.selectHash(loginDto.getMemberPassword());

        assertAll(
                () -> assertEquals(loginDto.getMemberId(), memberVO.getMemberId()),
                () -> assertEquals("hong gil-dong", memberVO.getMemberName()),
                () -> assertEquals(hashPassword, memberVO.getMemberPassword())
        );
    }

    @DisplayName("멤버 삭제 테스트")
    @Test
    void member_delete_test() {

        int deleteMember = memberMapper.deleteMember("delete_id");
        assertEquals(1, deleteMember);
    }
}