package com.example.exercise.dto;

import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter
@Builder
public class LoginDto {
    @NotEmpty(message = "Please enter your id")
    @Min(3)
    private String memberId;

    @NotBlank(message = "Please enter your password")
    private String memberPassword;
}
