package com.example.exercise.service;

import com.example.exercise.dto.JoinDto;
import com.example.exercise.dto.LoginDto;
import com.example.exercise.mapper.MemberMapper;
import com.example.exercise.vo.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberMapper memberMapper;

    public List<Member> getMembers() {
        return memberMapper.findByAll();
    }

    public Member getMember(LoginDto loginDto) {
        return memberMapper.findById(loginDto);
    }

    public boolean insertMember(JoinDto joinDto) {
        return memberMapper.insertMember(joinDto);
    }

}
