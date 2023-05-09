package com.example.exercise.service;

import com.example.exercise.mapper.MemberMapper;
import com.example.exercise.vo.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {

    private final MemberMapper memberMapper;

    public MemberService(MemberMapper memberMapper) {
        this.memberMapper = memberMapper;
    }
    public List<Member> getMembers() {

        return memberMapper.findByAll();
    }
}
