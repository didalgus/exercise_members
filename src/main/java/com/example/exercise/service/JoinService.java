package com.example.exercise.service;

import com.example.exercise.dto.JoinDto;
import com.example.exercise.mapper.MemberMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class JoinService {

    private final MemberMapper memberMapper;

    public String insertMember(JoinDto joinDto) {
        int result = memberMapper.insertMember(joinDto);

        if(result == 1) {
            return "OK";
        } else {
            return "FAIL";
        }
    }
}
