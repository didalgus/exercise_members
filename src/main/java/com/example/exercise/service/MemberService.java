package com.example.exercise.service;

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
}
