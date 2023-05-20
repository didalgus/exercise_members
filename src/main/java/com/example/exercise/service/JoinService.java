package com.example.exercise.service;

import com.example.exercise.dto.JoinDto;
import com.example.exercise.mapper.MemberMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class JoinService {

    private final MemberMapper memberMapper;

    public String greet() {
        return "Hello, willow";
    }

    //TODO
    // MembersService 로 이동하기
    public void insertMember(JoinDto joinDto) {
        memberMapper.insertMember(joinDto);
    }
}
