package com.example.exercise.dto;

import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Getter
@Builder
public class LoginDto {
    @NotEmpty(message = "Member Id : Please enter your id")
    @Size(min = 1, message = "Member Id : Please enter 1 characters or more")
    private String memberId;

    @NotBlank(message = "Member Password : Please enter your password")
    private String memberPassword;
}
