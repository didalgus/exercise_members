package com.example.exercise.dto;

import lombok.Builder;

@Builder
public class JoinDto {

    private String memberId;
    private String memberName;
    private String memberPassword;
}
