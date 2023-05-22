package com.example.exercise.service;


import com.example.exercise.dto.JoinDto;
import com.example.exercise.dto.LoginDto;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

@Slf4j
public class ValidationTest {

    private static ValidatorFactory factory;
    private static Validator valiator;

    @BeforeAll
    static void init() {
        factory = Validation.buildDefaultValidatorFactory();
        valiator = factory.getValidator();
    }

    @AfterAll
    static void close() {
        factory.close();
    }

    @DisplayName("로그인시 빈문자열 전송 테스트")
    @Test
    void blank_validation_test() {

        LoginDto loginDto = LoginDto.builder()
                .memberId("")
                .memberPassword(" ")
                .build();

        Set<ConstraintViolation<LoginDto>> validations = valiator.validate(loginDto);

        /*
        message : Member Id : Please enter 1 characters or more
        message : Member Password : Please enter your password
        message : Member Id : Please enter your id
         */
        validations.forEach(error -> System.out.println("message : " + error.getMessage()));

    }

    @DisplayName("가입시 validation 체크")
    @Test
    void join_validation_test() {
        JoinDto joinDto = JoinDto.builder()
                .memberId("1")
                .memberName("")
                .memberPassword("1234")
                .build();

        Set<ConstraintViolation<JoinDto>> validations = valiator.validate(joinDto);

        /*
        Property : memberName, message : Member Name : Please enter your name
        Property : memberName, message : Member Name : The name must be at least 2 characters and no more than 20 characters
         */
        validations.forEach(error -> System.out.println("Property : " + error.getPropertyPath() + ", message : " + error.getMessage()));
    }

}
