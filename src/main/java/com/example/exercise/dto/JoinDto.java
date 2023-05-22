package com.example.exercise.dto;

import lombok.Builder;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Builder
public class JoinDto {

    @NotNull(message = "Member Id : Please enter your id")
    @Size(min = 2, message = "Member Id : Please enter 1 characters or more")
    private String memberId;

    @NotEmpty(message = "Member Name : Please enter your name")
    @Size(min = 2, max = 20, message = "Member Name : The name must be at least 2 characters and no more than 20 characters")
    private String memberName;

    @NotBlank(message = "Member Password : Please enter your password")
    private String memberPassword;
}
