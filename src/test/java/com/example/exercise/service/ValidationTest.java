package com.example.exercise.service;


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

    @DisplayName("빈문자열 전송 테스트")
    @Test
    void blank_validation_test() {

        LoginDto loginDto = LoginDto.builder()
                .memberId("")
                .memberPassword(" ")
                .build();

        Set<ConstraintViolation<LoginDto>> validations = valiator.validate(loginDto);

        /*
        message : Please enter your password
        message : Please enter your id
        message : 3 이상이어야 합니다
         */
        validations.forEach(error -> System.out.println("message : " + error.getMessage()));

    }

}
