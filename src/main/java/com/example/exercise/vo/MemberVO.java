package com.example.exercise.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemberVO {
    private String memberId;
    private String memberName;
    private String memberPassword;
}
