package com.example.exercise.dto;

import lombok.Data;

@Data
public class JoinRequest {

    private String memberId;
    private String memberName;
    private String memberPassword;
}
