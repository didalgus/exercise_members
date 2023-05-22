package com.example.exercise.service;

import com.example.exercise.dto.JoinDto;
import com.example.exercise.dto.LoginDto;
import com.example.exercise.mapper.MemberMapper;
import com.example.exercise.vo.MemberVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberMapper memberMapper;

    public List<MemberVO> getMembers() {
        return memberMapper.findByAll();
    }

    public MemberVO getMember(LoginDto loginDto) {
        return memberMapper.findById(loginDto);
    }

    public String insertMember(JoinDto joinDto) {
        if (memberMapper.insertMember(joinDto) == 1) {
            return "OK";
        } else {
            return "FAIL";
        }
    }

    public String selectHash(String word) {
        return memberMapper.selectHash(word);
    }

    public String loginMember(LoginDto loginDto) {
        MemberVO memberVO = memberMapper.findById(loginDto);

        System.out.println("member id : " + memberVO.getMemberId());
        if (memberVO == null) {
            return "There are no members";
        }

        String hashPassword = selectHash(loginDto.getMemberPassword());

        if (memberVO.getMemberPassword().equals(hashPassword)) {
            return "OK";
        } else {
            return "Password is incorrect";
        }
    }

}
