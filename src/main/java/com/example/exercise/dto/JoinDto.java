package com.example.exercise.dto;

import lombok.Builder;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.*;

@Builder
public class JoinDto {

    @NotNull(message = "Member Id : Please enter your id")
    @Size(min = 1, message = "Member Id : Please enter 1 characters or more")
    private String memberId;

    @NotEmpty(message = "Member Name : Please enter your name")
    @Range(min = 2, max = 20, message = "Member Name : The name must be at least 2 characters and no more than 20 characters")
    private String memberName;

    @NotBlank(message = "Member Password : Please enter your password")
    private String memberPassword;
}
